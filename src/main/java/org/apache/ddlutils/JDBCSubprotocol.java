/*
 * Copyright 2017 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
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

/**
 *
 * @author softphone
 */
public enum JDBCSubprotocol {
    
    /** The subprotocol used by the DataDirect DB2 driver. */
    JDBC_SUBPROTOCOL_DATADIRECT_DB2            ("datadirect:db2"),
    /** The subprotocol used by the DataDirect SQLServer driver. */
    JDBC_SUBPROTOCOL_DATADIRECT_SQLSERVER      ("datadirect:sqlserver"),
    /** The subprotocol used by the DataDirect Oracle driver. */
    JDBC_SUBPROTOCOL_DATADIRECT_ORACLE         ("datadirect:oracle"),
    /** The subprotocol used by the DataDirect Sybase driver. */
    JDBC_SUBPROTOCOL_DATADIRECT_SYBASE         ("datadirect:sybase"),
    /** The subprotocol used by the i-net DB2 driver. */
    JDBC_SUBPROTOCOL_INET_DB2                  ("inetdb2"),
    /** The subprotocol used by the i-net Oracle driver. */
    JDBC_SUBPROTOCOL_INET_ORACLE               ("inetora"),
    /** A subprotocol used by the i-net SQLServer driver. */
    JDBC_SUBPROTOCOL_INET_SQLSERVER            ("inetdae"),
    /** A subprotocol used by the i-net SQLServer driver. */
    JDBC_SUBPROTOCOL_INET_SQLSERVER6           ("inetdae6"),
    /** A subprotocol used by the i-net SQLServer driver. */
    JDBC_SUBPROTOCOL_INET_SQLSERVER7           ("inetdae7"),
    /** A subprotocol used by the i-net SQLServer driver. */
    JDBC_SUBPROTOCOL_INET_SQLSERVER7A          ("inetdae7a"),
    /** A subprotocol used by the pooled i-net SQLServer driver. */
    JDBC_SUBPROTOCOL_INET_SQLSERVER_POOLED_1   ("inetpool:inetdae"),
    /** A subprotocol used by the pooled i-net SQLServer driver. */
    JDBC_SUBPROTOCOL_INET_SQLSERVER6_POOLED_1  ("inetpool:inetdae6"),
    /** A subprotocol used by the pooled i-net SQLServer driver. */
    JDBC_SUBPROTOCOL_INET_SQLSERVER7_POOLED_1  ("inetpool:inetdae7"),
    /** A subprotocol used by the pooled i-net SQLServer driver. */
    JDBC_SUBPROTOCOL_INET_SQLSERVER7A_POOLED_1 ("inetpool:inetdae7a"),
    /** A subprotocol used by the pooled i-net SQLServer driver. */
    JDBC_SUBPROTOCOL_INET_SQLSERVER_POOLED_2   ("inetpool:jdbc:inetdae"),
    /** A subprotocol used by the pooled i-net SQLServer driver. */
    JDBC_SUBPROTOCOL_INET_SQLSERVER6_POOLED_2  ("inetpool:jdbc:inetdae6"),
    /** A subprotocol used by the pooled i-net SQLServer driver. */
    JDBC_SUBPROTOCOL_INET_SQLSERVER7_POOLED_2  ("inetpool:jdbc:inetdae7"),
    /** A subprotocol used by the pooled i-net SQLServer driver. */
    JDBC_SUBPROTOCOL_INET_SQLSERVER7A_POOLED_2 ("inetpool:jdbc:inetdae7a"),
    /** The subprotocol used by the i-net Sybase driver. */
    JDBC_SUBPROTOCOL_INET_SYBASE               ("inetsyb"),
    /** The subprotocol used by the pooled i-net Sybase driver. */
    JDBC_SUBPROTOCOL_INET_SYBASE_POOLED_1      ("inetpool:inetsyb"),
    /** The subprotocol used by the pooled i-net Sybase driver. */
    JDBC_SUBPROTOCOL_INET_SYBASE_POOLED_2      ("inetpool:jdbc:inetsyb"),
    /** The subprotocol used by the JNetDirect SQLServer driver. */
    JDBC_SUBPROTOCOL_JSQLCONNECT_SQLSERVER     ("JSQLConnect"),
    /** The subprotocol used by the jTDS SQLServer driver. */
    JDBC_SUBPROTOCOL_JTDS_SQLSERVER            ("jtds:sqlserver"),
    /** The subprotocol used by the jTDS Sybase driver. */
    JDBC_SUBPROTOCOL_JTDS_SYBASE               ("jtds:sybase"),
    /** The subprotocol used by the derby drivers. */
    JDBC_SUBPROTOCOL                           ("derby");
    
    ;

    final  String subprotocol;

    JDBCSubprotocol( String subprotocol ) {
        this.subprotocol = subprotocol;
    }
    
    public String value() { return subprotocol; }
    
}
