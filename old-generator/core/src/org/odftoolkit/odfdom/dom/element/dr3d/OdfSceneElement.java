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

package org.odftoolkit.odfdom.dom.element.dr3d;

import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.dom.element.OdfStyleablePresentationElement;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.type.OdfBoolean;
import org.odftoolkit.odfdom.dom.type.OdfCellAddress;
import org.odftoolkit.odfdom.dom.type.OdfId;
import org.odftoolkit.odfdom.dom.type.OdfNonNegativeInteger;
import org.odftoolkit.odfdom.dom.type.OdfPositiveInteger;
import org.odftoolkit.odfdom.dom.type.OdfStyleName;
import org.odftoolkit.odfdom.dom.type.OdfStyleNames;
import org.odftoolkit.odfdom.dom.type.dr3d.OdfProjectionType;
import org.odftoolkit.odfdom.dom.type.dr3d.OdfShadeModeType;
import org.odftoolkit.odfdom.dom.type.text.OdfAnchorType;
import java.util.List;


/**
 * ODF DOM Element implementation for element "<dr3d:scene>".
 */
public abstract class OdfSceneElement extends OdfStyleablePresentationElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.DR3D, "scene" );

    public OdfSceneElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "dr3d:vrp".
     */
    public String getVrp()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DR3D, "vrp" ) );
    }

    /**
     * Set value of attribute "dr3d:vrp".
     */
    public void setVrp( String _aVrp )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DR3D, "vrp" ), _aVrp );
    }

    /**
     * Get value of attribute "dr3d:vpn".
     */
    public String getVpn()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DR3D, "vpn" ) );
    }

    /**
     * Set value of attribute "dr3d:vpn".
     */
    public void setVpn( String _aVpn )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DR3D, "vpn" ), _aVpn );
    }

    /**
     * Get value of attribute "dr3d:vup".
     */
    public String getVup()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DR3D, "vup" ) );
    }

    /**
     * Set value of attribute "dr3d:vup".
     */
    public void setVup( String _aVup )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DR3D, "vup" ), _aVup );
    }

    /**
     * Get value of attribute "dr3d:projection".
     */
    public OdfProjectionType getProjection()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DR3D, "projection" ) );
        return OdfProjectionType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "dr3d:projection".
     */
    public void setProjection( OdfProjectionType _aProjection )
    {                    
        String aStringVal = OdfProjectionType.toString( _aProjection );
        setOdfAttribute( OdfName.get( OdfNamespace.DR3D, "projection" ), aStringVal );
    }

    /**
     * Get value of attribute "dr3d:distance".
     */
    public String getDistance()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DR3D, "distance" ) );
    }

    /**
     * Set value of attribute "dr3d:distance".
     */
    public void setDistance( String _aDistance )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DR3D, "distance" ), _aDistance );
    }

    /**
     * Get value of attribute "dr3d:focal-length".
     */
    public String getFocalLength()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DR3D, "focal-length" ) );
    }

    /**
     * Set value of attribute "dr3d:focal-length".
     */
    public void setFocalLength( String _aFocalLength )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DR3D, "focal-length" ), _aFocalLength );
    }

    /**
     * Get value of attribute "dr3d:shadow-slant".
     */
    public Integer getShadowSlant()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DR3D, "shadow-slant" ) );
        return OdfNonNegativeInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "dr3d:shadow-slant".
     */
    public void setShadowSlant( Integer _aShadowSlant )
    {                    
        String aStringVal = OdfNonNegativeInteger.toString( _aShadowSlant );
        setOdfAttribute( OdfName.get( OdfNamespace.DR3D, "shadow-slant" ), aStringVal );
    }

    /**
     * Get value of attribute "dr3d:shade-mode".
     */
    public OdfShadeModeType getShadeMode()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DR3D, "shade-mode" ) );
        return OdfShadeModeType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "dr3d:shade-mode".
     */
    public void setShadeMode( OdfShadeModeType _aShadeMode )
    {                    
        String aStringVal = OdfShadeModeType.toString( _aShadeMode );
        setOdfAttribute( OdfName.get( OdfNamespace.DR3D, "shade-mode" ), aStringVal );
    }

    /**
     * Get value of attribute "dr3d:ambient-color".
     */
    public String getAmbientColor()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DR3D, "ambient-color" ) );
    }

    /**
     * Set value of attribute "dr3d:ambient-color".
     */
    public void setAmbientColor( String _aAmbientColor )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DR3D, "ambient-color" ), _aAmbientColor );
    }

    /**
     * Get value of attribute "dr3d:lighting-mode".
     */
    public Boolean getLightingMode()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DR3D, "lighting-mode" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "dr3d:lighting-mode".
     */
    public void setLightingMode( Boolean _aLightingMode )
    {                    
        String aStringVal = OdfBoolean.toString( _aLightingMode );
        setOdfAttribute( OdfName.get( OdfNamespace.DR3D, "lighting-mode" ), aStringVal );
    }

    /**
     * Get value of attribute "svg:x".
     */
    public String getX()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "x" ) );
    }

    /**
     * Set value of attribute "svg:x".
     */
    public void setX( String _aX )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "x" ), _aX );
    }

    /**
     * Get value of attribute "svg:y".
     */
    public String getY()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "y" ) );
    }

    /**
     * Set value of attribute "svg:y".
     */
    public void setY( String _aY )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "y" ), _aY );
    }

    /**
     * Get value of attribute "svg:width".
     */
    public String getWidth()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "width" ) );
    }

    /**
     * Set value of attribute "svg:width".
     */
    public void setWidth( String _aWidth )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "width" ), _aWidth );
    }

    /**
     * Get value of attribute "svg:height".
     */
    public String getHeight()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "height" ) );
    }

    /**
     * Set value of attribute "svg:height".
     */
    public void setHeight( String _aHeight )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "height" ), _aHeight );
    }

    /**
     * Get value of attribute "draw:style-name".
     */
    public String getDrawStyleName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "style-name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:style-name".
     */
    public void setDrawStyleName( String _aDrawStyleName )
    {                    
        String aStringVal = OdfStyleName.toString( _aDrawStyleName );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "style-name" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:class-names".
     */
    public List<String> getDrawClassNames()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "class-names" ) );
        return OdfStyleNames.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:class-names".
     */
    public void setDrawClassNames( List<String> _aDrawClassNames )
    {                    
        String aStringVal = OdfStyleNames.toString( _aDrawClassNames );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "class-names" ), aStringVal );
    }

    /**
     * Get value of attribute "presentation:style-name".
     */
    public String getPresentationStyleName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "style-name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:style-name".
     */
    public void setPresentationStyleName( String _aPresentationStyleName )
    {                    
        String aStringVal = OdfStyleName.toString( _aPresentationStyleName );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "style-name" ), aStringVal );
    }

    /**
     * Get value of attribute "presentation:class-names".
     */
    public List<String> getPresentationClassNames()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "class-names" ) );
        return OdfStyleNames.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:class-names".
     */
    public void setPresentationClassNames( List<String> _aPresentationClassNames )
    {                    
        String aStringVal = OdfStyleNames.toString( _aPresentationClassNames );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "class-names" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:z-index".
     */
    public Integer getZIndex()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "z-index" ) );
        return OdfNonNegativeInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:z-index".
     */
    public void setZIndex( Integer _aZIndex )
    {                    
        String aStringVal = OdfNonNegativeInteger.toString( _aZIndex );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "z-index" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:id".
     */
    public String getId()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "id" ) );
        return OdfId.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:id".
     */
    public void setId( String _aId )
    {                    
        String aStringVal = OdfId.toString( _aId );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "id" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:layer".
     */
    public String getLayer()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "layer" ) );
    }

    /**
     * Set value of attribute "draw:layer".
     */
    public void setLayer( String _aLayer )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "layer" ), _aLayer );
    }

    /**
     * Get value of attribute "table:end-cell-address".
     */
    public String getEndCellAddress()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "end-cell-address" ) );
        return OdfCellAddress.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:end-cell-address".
     */
    public void setEndCellAddress( String _aEndCellAddress )
    {                    
        String aStringVal = OdfCellAddress.toString( _aEndCellAddress );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "end-cell-address" ), aStringVal );
    }

    /**
     * Get value of attribute "table:end-x".
     */
    public String getEndX()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "end-x" ) );
    }

    /**
     * Set value of attribute "table:end-x".
     */
    public void setEndX( String _aEndX )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "end-x" ), _aEndX );
    }

    /**
     * Get value of attribute "table:end-y".
     */
    public String getEndY()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "end-y" ) );
    }

    /**
     * Set value of attribute "table:end-y".
     */
    public void setEndY( String _aEndY )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "end-y" ), _aEndY );
    }

    /**
     * Get value of attribute "table:table-background".
     */
    public Boolean getTableBackground()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "table-background" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:table-background".
     */
    public void setTableBackground( Boolean _aTableBackground )
    {                    
        String aStringVal = OdfBoolean.toString( _aTableBackground );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "table-background" ), aStringVal );
    }

    /**
     * Get value of attribute "text:anchor-type".
     */
    public OdfAnchorType getAnchorType()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "anchor-type" ) );
        return OdfAnchorType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:anchor-type".
     */
    public void setAnchorType( OdfAnchorType _aAnchorType )
    {                    
        String aStringVal = OdfAnchorType.toString( _aAnchorType );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "anchor-type" ), aStringVal );
    }

    /**
     * Get value of attribute "text:anchor-page-number".
     */
    public Integer getAnchorPageNumber()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "anchor-page-number" ) );
        return OdfPositiveInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:anchor-page-number".
     */
    public void setAnchorPageNumber( Integer _aAnchorPageNumber )
    {                    
        String aStringVal = OdfPositiveInteger.toString( _aAnchorPageNumber );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "anchor-page-number" ), aStringVal );
    }

    /**
     * Get value of attribute "dr3d:transform".
     */
    public String getTransform()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DR3D, "transform" ) );
    }

    /**
     * Set value of attribute "dr3d:transform".
     */
    public void setTransform( String _aTransform )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DR3D, "transform" ), _aTransform );
    }

    /**
     * Get value of attribute "draw:caption-id".
     */
    public String getCaptionId()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "caption-id" ) );
        return OdfId.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:caption-id".
     */
    public void setCaptionId( String _aCaptionId )
    {                    
        String aStringVal = OdfId.toString( _aCaptionId );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "caption-id" ), aStringVal );
    }

}