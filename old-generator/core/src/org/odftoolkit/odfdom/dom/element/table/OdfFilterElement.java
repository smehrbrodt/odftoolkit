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

package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.table.OdfConditionSourceType;
import org.odftoolkit.odfdom.dom.type.OdfBoolean;


/**
 * ODF DOM Element implementation for element "<table:filter>".
 */
public abstract class OdfFilterElement extends OdfElement
{        
    /**
	 * 
	 */
	private static final long serialVersionUID = 7872202353192224524L;
	public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TABLE, "filter" );

    public OdfFilterElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    @Override
	public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "table:target-range-address".
     */
    public String getTargetRangeAddress()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "target-range-address" ) );
    }

    /**
     * Set value of attribute "table:target-range-address".
     */
    public void setTargetRangeAddress( String _aTargetRangeAddress )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "target-range-address" ), _aTargetRangeAddress );
    }

    /**
     * Get value of attribute "table:condition-source".
     */
    public OdfConditionSourceType getConditionSource()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "condition-source" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "self";
        }

        return OdfConditionSourceType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:condition-source".
     */
    public void setConditionSource( OdfConditionSourceType _aConditionSource )
    {                    
        String aStringVal = OdfConditionSourceType.toString( _aConditionSource );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "condition-source" ), aStringVal );
    }

    /**
     * Get value of attribute "table:condition-source-range-address".
     */
    public String getConditionSourceRangeAddress()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "condition-source-range-address" ) );
    }

    /**
     * Set value of attribute "table:condition-source-range-address".
     */
    public void setConditionSourceRangeAddress( String _aConditionSourceRangeAddress )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "condition-source-range-address" ), _aConditionSourceRangeAddress );
    }

    /**
     * Get value of attribute "table:display-duplicates".
     */
    public Boolean getDisplayDuplicates()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "display-duplicates" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "true";
        }

        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:display-duplicates".
     */
    public void setDisplayDuplicates( Boolean _aDisplayDuplicates )
    {                    
        String aStringVal = OdfBoolean.toString( _aDisplayDuplicates );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "display-duplicates" ), aStringVal );
    }

}
