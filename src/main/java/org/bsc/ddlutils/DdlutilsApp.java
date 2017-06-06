/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bsc.ddlutils;

import java.io.InputStreamReader;
import java.util.Collections;
import javax.sql.DataSource;
import org.apache.ddlutils.JDBCDriver;
import org.apache.ddlutils.Platform;
import org.apache.ddlutils.PlatformFactory;
import org.apache.ddlutils.io.DatabaseIO;
import org.apache.ddlutils.model.Database;

/**
 *
 * @author softphone
 */
public class DdlutilsApp {
 
    public static void main( String [] args ) throws Exception {
        
        JDBCDriver.JDBC_DRIVER_DERBY.load();
        
        final DataSource ds = new org.apache.derby.jdbc.ClientDataSource() {{
            setDataSourceName("test");
            setDatabaseName("test");
            setPortNumber(1527);
            setUser("admin");
            setPassword("admin");
            setServerName("localhost");
        }};
        
        final Platform platform = PlatformFactory.createNewPlatformInstance(ds);    
        
        
        final DatabaseIO dbio = new DatabaseIO();
        
        final Database db = dbio.read( new InputStreamReader(DdlutilsApp.class.getClassLoader().getResourceAsStream("schema.xml")) );
    
        platform.createDatabase(JDBCDriver.JDBC_DRIVER_DERBY, 
                                "jdbc:derby://localhost:1527/test;", 
                                "admin", 
                                "admin", 
                                Collections.emptyMap());
        platform.createModel(db, true, true);
        
    }
}
