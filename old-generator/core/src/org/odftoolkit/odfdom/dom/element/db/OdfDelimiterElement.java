/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */    

package org.odftoolkit.odfdom.dom.element.db;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;


/**
 * ODF DOM Element implementation for element "<db:delimiter>".
 */
public abstract class OdfDelimiterElement extends OdfElement
{        
    /**
	 * 
	 */
	private static final long serialVersionUID = 8089664417395904741L;
	public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.DB, "delimiter" );

    public OdfDelimiterElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    @Override
	public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "db:field".
     */
    public String getField()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DB, "field" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = ";";
        }

        return String.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "db:field".
     */
    public void setField( String _aField )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "field" ), _aField );
    }

    /**
     * Get value of attribute "db:string".
     */
    public String getString()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DB, "string" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "\"";
        }

        return String.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "db:string".
     */
    public void setString( String _aString )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "string" ), _aString );
    }

    /**
     * Get value of attribute "db:decimal".
     */
    public String getDecimal()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DB, "decimal" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = ".";
        }

        return String.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "db:decimal".
     */
    public void setDecimal( String _aDecimal )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "decimal" ), _aDecimal );
    }

    /**
     * Get value of attribute "db:thousand".
     */
    public String getThousand()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DB, "thousand" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = ",";
        }

        return String.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "db:thousand".
     */
    public void setThousand( String _aThousand )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "thousand" ), _aThousand );
    }

}
