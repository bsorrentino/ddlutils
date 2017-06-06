/*
 * Copyright 2017 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 ("the "License"),
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.ddlutils;

public enum JDBCDriver {

    /** The DataDirect Connect DB2 jdbc driver. */
    JDBC_DRIVER_DATADIRECT_DB2      ("com.ddtek.jdbc.db2.DB2Driver"),
    /** The DataDirect Connect SQLServer jdbc driver. */
    JDBC_DRIVER_DATADIRECT_SQLSERVER("com.ddtek.jdbc.sqlserver.SQLServerDriver"),
    /** The DataDirect Connect Oracle jdbc driver. */
    JDBC_DRIVER_DATADIRECT_ORACLE     ("com.ddtek.jdbc.oracle.OracleDriver"),
    /** The DataDirect Connect Sybase jdbc driver. */
    JDBC_DRIVER_DATADIRECT_SYBASE     ("com.ddtek.jdbc.sybase.SybaseDriver"),
    /** The i-net DB2 jdbc driver. */
    JDBC_DRIVER_INET_DB2              ("com.inet.drda.DRDADriver"),
    /** The i-net Oracle jdbc driver. */
    JDBC_DRIVER_INET_ORACLE           ("com.inet.ora.OraDriver"),
    /** The i-net SQLServer jdbc driver. */
    JDBC_DRIVER_INET_SQLSERVER        ("com.inet.tds.TdsDriver"),
    /** The i-net Sybase jdbc driver. */
    JDBC_DRIVER_INET_SYBASE           ("com.inet.syb.SybDriver"),
    /** The i-net pooled jdbc driver for SQLServer and Sybase. */
    JDBC_DRIVER_INET_POOLED           ("com.inet.pool.PoolDriver"),
    /** The JNetDirect SQLServer jdbc driver. */
    JDBC_DRIVER_JSQLCONNECT_SQLSERVER ("com.jnetdirect.jsql.JSQLDriver"),
    /** The jTDS jdbc driver for SQLServer and Sybase. */
    JDBC_DRIVER_JTDS                  ("net.sourceforge.jtds.jdbc.Driver"),
    
    /** The derby jdbc driver for use as a client for a normal server. */
    JDBC_DRIVER_DERBY             ("org.apache.derby.jdbc.ClientDriver"),
    /** The derby jdbc driver for use as an embedded database. */
    JDBC_DRIVER_DERBY_EMBEDDED    ("org.apache.derby.jdbc.EmbeddedDriver")    
    ;

    
    final  String driverClass;

    JDBCDriver( String driverClass ) {
        this.driverClass = driverClass;
    }
    
    public String value() { return driverClass; }

    public void load() throws ClassNotFoundException { Class.forName(driverClass); }
}

