package org.apache.ddlutils.model;

/*
 * Copyright 1999-2005 The Apache Software Foundation.
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

import java.util.ArrayList;

/**
 * Provides compatibility with Torque-style xml with separate &lt;index&gt; and
 * &lt;unique&gt; tags, but adds no functionality.  All indexes are treated the
 * same by the Table.
 * 
 * @author John Marshall/Connectria
 * @version $Revision$
 */
public class UniqueIndex extends NonUniqueIndex
{
    /** Unique ID for serialization purposes. */
    private static final long serialVersionUID = -4097003126550294993L;

    /**
     * {@inheritDoc}
     */
    public boolean isUnique()
    {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public Object clone() throws CloneNotSupportedException
    {
        UniqueIndex result = new UniqueIndex();

        result._name    = _name;
        result._columns = (ArrayList)_columns.clone();
        return result;
    }
}
