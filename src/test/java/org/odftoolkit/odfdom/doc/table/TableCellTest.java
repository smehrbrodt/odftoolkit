/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 * 
 * Copyright 2009 IBM. All rights reserved.
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
package org.odftoolkit.odfdom.doc.table;

import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.odftoolkit.odfdom.doc.OdfSpreadsheetDocument;
import org.odftoolkit.odfdom.doc.OdfTextDocument;
import org.odftoolkit.odfdom.dom.element.draw.DrawFrameElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawImageElement;
import org.odftoolkit.odfdom.type.Color;
import org.odftoolkit.odfdom.utils.ResourceUtilities;

public class TableCellTest {

	final String filename = "TestSpreadsheetTable";
	final String odtfilename = "TestTextTable";
	OdfSpreadsheetDocument odsdoc;
	OdfTextDocument odtdoc;
	OdfTable odsTable, odtTable;

    @Before
    public void setUp() {
		try {
			odsdoc = (OdfSpreadsheetDocument) OdfSpreadsheetDocument.loadDocument(ResourceUtilities.getTestResourceAsStream(filename+".ods"));
	    	odtdoc = (OdfTextDocument) OdfTextDocument.loadDocument(ResourceUtilities.getTestResourceAsStream(odtfilename+".odt"));
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
	private void saveods()
	{
		try {
			odsdoc.save(ResourceUtilities.newTestOutputFile(filename+"Output.ods"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void saveodt()
	{
		try {
			odtdoc.save(ResourceUtilities.newTestOutputFile(odtfilename+"Output.odt"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetIndexInRowColumn()
	{
		int rowindex = 2, columnindex = 1;
    	OdfTable table = odsdoc.getTableByName("Sheet1");
    	OdfTableCell cell = table.getCellByPosition(columnindex, rowindex);
    	
    	Assert.assertEquals(rowindex, cell.getRowIndex());
    	Assert.assertEquals(columnindex, cell.getColumnIndex());
    	
    	OdfTable table3 = odtdoc.getTableByName("Table3");
    	OdfTableCell cell1 = table.getCellByPosition(0,1);
    	Assert.assertEquals(1, cell1.getRowIndex());
    	Assert.assertEquals(0, cell1.getColumnIndex());
	}
	
	@Test
	public void testGetSetHoriJustify()
	{
		int rowindex = 3, columnindex = 0;
    	OdfTable table = odsdoc.getTableByName("Sheet1");
    	OdfTableCell fcell = table.getCellByPosition(columnindex, rowindex);
    	
    	String align = fcell.getHorizontalJustify();
    	Assert.assertEquals("center", align);
    	
    	fcell.setHorizontalJustify("left");
    	align = fcell.getHorizontalJustify();
    	Assert.assertEquals("left", align);
    	saveods();
	}
	
	@Test
	public void testGetSetVertJustify()
	{
		int rowindex = 3, columnindex = 0;
    	OdfTable table = odsdoc.getTableByName("Sheet1");
    	OdfTableCell fcell = table.getCellByPosition(columnindex, rowindex);
    	
    	String align = fcell.getVerticalJustify();
    	Assert.assertEquals("top", align);
    	
    	fcell.setVerticalJustify("bottom");
    	align = fcell.getVerticalJustify();
    	Assert.assertEquals("bottom", align);
    	saveods();
	}
	
	@Test
	public void testGetSetWrapOption()
	{
		int rowindex = 5, columnindex = 8;
    	OdfTable table = odsdoc.getTableByName("Sheet1");
    	OdfTableCell fcell = table.getCellByPosition(columnindex, rowindex);
    	
    	boolean wrap = fcell.isTextWrapped();
    	Assert.assertEquals(true, wrap);
    	
    	fcell.setTextWrapped(false);
    	wrap = fcell.isTextWrapped();
    	Assert.assertEquals(false, wrap);
    	saveods();
	}
	
	@Test
	public void testGetSetTextValue()
	{
		int rowindex = 5, columnindex = 8;
    	OdfTable table = odsdoc.getTableByName("Sheet1");
    	OdfTableCell fcell = table.getCellByPosition(columnindex, rowindex);
    	
    	String text = fcell.getDisplayText();
    	Assert.assertEquals("this is a big cell with a big table", text);
    	
    	fcell.setDisplayText("changed");
    	text = fcell.getDisplayText();
    	Assert.assertEquals("changed", text);
    	saveods();
    	
    	OdfTable table1 = odtdoc.getTableByName("Table1");
    	OdfTableCell fcell2 = table1.getCellByPosition(0, 1);
    	text = fcell2.getDisplayText();
    	Assert.assertEquals("Aabbccddee", text);
    }
	
	@Test
	public void testSetGetFormat()
	{
		int rowindex = 3, columnindex = 0;
    	OdfTable table = odsdoc.getTableByName("Sheet1");
    	OdfTableCell fcell = table.getCellByPosition(columnindex, rowindex);
    	
    	fcell.setFormatString("#0.0");
    	String displayvalue = fcell.getDisplayText();
    	Assert.assertEquals("300"+(new DecimalFormatSymbols()).getDecimalSeparator()+"0", displayvalue);
    	String format = fcell.getFormatString();
    	Assert.assertEquals("#0.0", format);
    	
    	OdfTableCell dcell = table.getCellByPosition(3, 2);
    	format = dcell.getFormatString();
    	Assert.assertEquals("MMM d, yy", format);
    	
    	dcell.setFormatString("yyyy-MM-dd");
    	displayvalue = dcell.getDisplayText();
    	Assert.assertEquals("2008-12-23", displayvalue);
    	
    	OdfTableCell pcell = table.getCellByPosition("B2");
    	format = pcell.getFormatString();
    	Assert.assertEquals("#0%", format);
    	
    	pcell.setFormatString("#0.00%");
    	displayvalue = pcell.getDisplayText();
    	Assert.assertEquals("200"+(new DecimalFormatSymbols()).getDecimalSeparator()+"00%", displayvalue);
    	// reproduce bug 157
    	try {
    		OdfTableRow tablerow = table.getRowByIndex(6);
    		OdfTableCell cell = tablerow.getCellByIndex(3);
    		Calendar currenttime = Calendar.getInstance();
    		cell.setDateValue(currenttime);
    		cell.setFormatString("yyyy-MM-dd");
    		tablerow = table.getRowByIndex(7);
    		cell = tablerow.getCellByIndex(3);
    		cell.setTimeValue(currenttime);
    		cell.setFormatString("HH:mm:ss");
    	} catch (Exception e) {
    		e.printStackTrace();
    		Assert.fail(e.getMessage());
    	}
    	saveods();
    	
	}
	
	private void loadOutputSpreadsheet(){
	    try {
		odsdoc=(OdfSpreadsheetDocument) OdfSpreadsheetDocument.loadDocument(ResourceUtilities.getTestResourceAsStream(filename+"Output.ods"));
	    } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	}
	
	@Test
	public void testGetSetCellBackColor() throws Exception {
	    int rowindex = 2, columnindex = 0;
	    OdfTable table = odsdoc.getTableByName("Sheet1");
	    OdfTableCell fcell = table.getCellByPosition(columnindex, rowindex);
	    Color expectedColor=Color.valueOf("#000000");
	    fcell.setCellBackColor(expectedColor);
	    saveods();
	  
	    //reload
	    loadOutputSpreadsheet();
	    table = odsdoc.getTableByName("Sheet1");
	    fcell=table.getCellByPosition(columnindex, rowindex);
	    Assert.assertEquals(expectedColor.toString(),fcell.getCellBackColor().toString());
	    
	}
	
	@Test
	public void testGetSetDateValue() {
	    int rowindex = 7, columnindex = 7;
	    OdfTable table = odsdoc.getTableByName("Sheet1");
	    OdfTableCell fcell = table.getCellByPosition(columnindex, rowindex);
	    Calendar expectedCalendar=new GregorianCalendar(2010,1,30);
	    fcell.setDateValue(expectedCalendar);
	    saveods();
	    //reload
	    loadOutputSpreadsheet();
	    table = odsdoc.getTableByName("Sheet1");
	    fcell=table.getCellByPosition(columnindex, rowindex);
	    Assert.assertEquals(0, fcell.getDateValue().compareTo(expectedCalendar));
	    
	}
	
		
	@Test
	public void testGetSetStringValue() {
	    int rowindex = 6, columnindex = 0;
	    OdfTable table = odsdoc.getTableByName("Sheet1");
	    OdfTableCell fcell = table.getCellByPosition(columnindex, rowindex);
	    String expectedString="hello world";
	    fcell.setStringValue(expectedString);
	    saveods();
	    //reload
	    loadOutputSpreadsheet();
	    table = odsdoc.getTableByName("Sheet1");
	    fcell=table.getCellByPosition(columnindex, rowindex);
	    Assert.assertEquals(expectedString,fcell.getStringValue());
	}
	
	@Test
	public void testGetSetBooleanValue() {
	    int rowindex = 5, columnindex = 5;
	    OdfTable table = odsdoc.getTableByName("Sheet1");
	    OdfTableCell fcell = table.getCellByPosition(columnindex, rowindex);
	    boolean expected=false;
	    fcell.setBooleanValue(expected);
	    saveods();
	    //reload
	    loadOutputSpreadsheet();
	    table = odsdoc.getTableByName("Sheet1");
	    fcell=table.getCellByPosition(columnindex, rowindex);
	    Assert.assertFalse(fcell.getBooleanValue());
	}
	
	@Test
	public void testGetSetCurrencyValue() {
	    int rowindex = 5, columnindex = 5;
	    OdfTable table = odsdoc.getTableByName("Sheet1");
	    OdfTableCell fcell = table.getCellByPosition(columnindex, rowindex);
	    double expected=100.00;
	    fcell.setCurrencyValue(expected, "USD");
	    saveods();
	    //reload
	    loadOutputSpreadsheet();
	    table = odsdoc.getTableByName("Sheet1");
	    fcell=table.getCellByPosition(columnindex, rowindex);
	    Assert.assertEquals(expected,fcell.getCurrencyValue());
	}
	
	@Test
	public void testGetSetCurrencyDesc() {
	    int rowindex = 1, columnindex = 2;
	    OdfTable table = odsdoc.getTableByName("Sheet1");
	    OdfTableCell fcell = table.getCellByPosition(columnindex, rowindex);
	    String expected="USD";
	    fcell.setCurrencyCode(expected);
	    saveods();
	    //reload
	    loadOutputSpreadsheet();
	    table = odsdoc.getTableByName("Sheet1");
	    fcell=table.getCellByPosition(columnindex, rowindex);
	    Assert.assertEquals(expected,fcell.getCurrencyCode());
	}
	
	@Test
	public void testGetSetPercentageValue() {
	    int rowindex = 5, columnindex = 5;
	    OdfTable table = odsdoc.getTableByName("Sheet1");
	    OdfTableCell fcell = table.getCellByPosition(columnindex, rowindex);
	    double expected=56.98;
	    fcell.setPercentageValue(expected);
	    saveods();
	    //reload
	    loadOutputSpreadsheet();
	    table = odsdoc.getTableByName("Sheet1");
	    fcell=table.getCellByPosition(columnindex, rowindex);
	    Assert.assertEquals(expected,fcell.getPercentageValue());
	}
	
	@Test
	public void testGetSetTimeValue() {
	    int rowindex = 0, columnindex = 4;
	    OdfTable table = odsdoc.getTableByName("Sheet1");
	    OdfTableCell fcell = table.getCellByPosition(columnindex, rowindex);
	    Calendar expected=Calendar.getInstance();
	    fcell.setTimeValue(expected);
	    saveods();
	    //reload
	    loadOutputSpreadsheet();
	    table = odsdoc.getTableByName("Sheet1");
	    fcell=table.getCellByPosition(columnindex, rowindex);

	    SimpleDateFormat simpleFormat = new SimpleDateFormat("'PT'HH'H'mm'M'ss'S'");
            String  expectedString= simpleFormat.format(expected.getTime());
            String  targetString= simpleFormat.format(fcell.getTimeValue().getTime());
	    Assert.assertEquals(expectedString,targetString);
	    // reproduce bug156
	    String timeValueAttribute = fcell.mCellElement.getOfficeTimeValueAttribute();
	    Assert.assertNotNull(timeValueAttribute);
	    Assert.assertEquals(expectedString, timeValueAttribute);
	}
	
	@Test
	public void testGetSetFormula() {
	    int rowindex = 1, columnindex = 10;
	    OdfTable table = odsdoc.getTableByName("Sheet1");
	    OdfTableCell fcell = table.getCellByPosition(columnindex, rowindex);
	    String expected="of:=[.I2]*4";
	    fcell.setFormula(expected);
	    saveods();
	    //reload
	    loadOutputSpreadsheet();
	    table = odsdoc.getTableByName("Sheet1");
	    fcell=table.getCellByPosition(columnindex, rowindex);
	    Assert.assertEquals(expected,fcell.getFormula());
	}
	
	@Test
	public void testGetStyleName() {
	    int rowindex =2, columnindex = 0;
	    OdfTable table = odsdoc.getTableByName("Sheet1");
	    OdfTableCell fcell = table.getCellByPosition(columnindex, rowindex);
	    String expected="ce2";
	    fcell.getStyleName();
	   
	    Assert.assertEquals(expected,fcell.getStyleName());
	}
	
	@Test
	public void testGetTableColumn() {
	    int rowindex =2, columnindex = 0;
	    OdfTable table = odsdoc.getTableByName("Sheet1");
	    OdfTableCell fcell = table.getCellByPosition(columnindex, rowindex);

	    Assert.assertNotNull(fcell.getTableColumn());
	    Assert.assertEquals(columnindex, fcell.getTableColumn().getColumnIndex());
	}
	
	@Test
	public void testGetTableRow() {
	    int rowindex =2, columnindex = 0;
	    OdfTable table = odsdoc.getTableByName("Sheet1");
	    OdfTableCell fcell = table.getCellByPosition(columnindex, rowindex);

	    Assert.assertNotNull(fcell.getTableRow());
	    Assert.assertEquals(rowindex, fcell.getTableRow().getRowIndex());
	}
	
	@Test
	public void testRemoveContent() {
	    int rowindex = 5, columnindex = 8;
	    OdfTable table = odsdoc.getTableByName("Sheet1");
	    OdfTableCell fcell = table.getCellByPosition(columnindex, rowindex);

	    Assert.assertTrue(fcell.mCellElement.getChildNodes().getLength()>0);
	    fcell.removeContent();
	    saveods();
	    //reload
	    loadOutputSpreadsheet();
	    table = odsdoc.getTableByName("Sheet1");
	    fcell=table.getCellByPosition(columnindex, rowindex);
	    Assert.assertEquals(0,fcell.mCellElement.getChildNodes().getLength());
	}
	
	@Test
	public void testRemoveTextContent() throws Exception {
	    int rowindex = 5, columnindex = 8;
	    OdfTable table = odsdoc.getTableByName("Sheet1");
	    OdfTableCell fcell = table.getCellByPosition(columnindex, rowindex);

            //how to test?
	    fcell.removeContent();
	    Assert.assertEquals(0,fcell.mCellElement.getChildNodes().getLength());
	    
	    fcell.setDisplayText("hello");
	    DrawFrameElement drawEle=new DrawFrameElement(odsdoc.getContentDom());
	    DrawImageElement imageEle=drawEle.newDrawImageElement();
	    fcell.mCellElement.appendChild(drawEle);
	    
	    Assert.assertEquals(2,fcell.mCellElement.getChildNodes().getLength());
	    
	    fcell.removeTextContent();
	    saveods();
	    //reload
	    loadOutputSpreadsheet();
	    table = odsdoc.getTableByName("Sheet1");
	    fcell=table.getCellByPosition(columnindex, rowindex);
	    Assert.assertEquals(1,fcell.mCellElement.getChildNodes().getLength());
	}
	
	@Test
	public void testGetSetDisplayText() {
	    int rowindex = 5, columnindex = 5;
	    OdfTable table = odsdoc.getTableByName("Sheet1");
	    OdfTableCell fcell = table.getCellByPosition(columnindex, rowindex);
	    String expected="display text";
	    
	  //  Assert.assertEquals(expected, fcell.getDisplayText());
	    
	    fcell.setDisplayText(expected);
	    saveods();
	    //reload
	    loadOutputSpreadsheet();
	    table = odsdoc.getTableByName("Sheet1");
	    fcell=table.getCellByPosition(columnindex, rowindex);
	    Assert.assertEquals(expected,fcell.getDisplayText());
	}
	
	@Test
	public void testGetSetFormatString() {
	    int rowindex = 3, columnindex = 0;
	    OdfTable table = odsdoc.getTableByName("Sheet1");
	    OdfTableCell fcell = table.getCellByPosition(columnindex, rowindex);

            //float format string
	      String expected="#0.0";
	      fcell.setFormatString(expected);
	      
	    //date format string
//	      String expected="MMM d, yy";
//	      String expected="yyyy-MM-dd";
	    
	    
	    saveods();
	    //reload
	    loadOutputSpreadsheet();
	    table = odsdoc.getTableByName("Sheet1");
	    fcell=table.getCellByPosition(columnindex, rowindex);
	    Assert.assertEquals(expected,fcell.getFormatString());
	}
	
	@Test
	public void testGetCurrencySymbol()
	{
	    OdfTable table = odsdoc.getTableByName("Sheet1");
	    OdfTableCell cell1 = table.getCellByPosition("C2");
	    Assert.assertEquals("$", cell1.getCurrencySymbol());
	    OdfTableCell cell2 = table.getCellByPosition("C3");
	    Assert.assertEquals("CNY", cell2.getCurrencySymbol());
	}
	
	@Test
	public void testGetSetCurrencyFormat()
	{
	    OdfTable table = odsdoc.getTableByName("Sheet1");
	    String[] formats = {"$#,##0.00","#,##0.00 CNY","$#,##0.0"};
	    
    	OdfTableCell cell = table.getCellByPosition("J1");
    	cell.setCurrencyValue(32.12, "USD");
    	cell.setCurrencyFormat("$", formats[0]);
    	
    	cell =table.getCellByPosition("J2");
    	cell.setCurrencyValue(32, "CNY");
    	cell.setCurrencyFormat("CNY", formats[1]);
    	
    	cell=table.getCellByPosition("J3");
    	cell.setCurrencyValue(-32.12, "USD");
    	cell.setCurrencyFormat("$", formats[2]);
    	
    	saveods();
    	//reload
	    loadOutputSpreadsheet();
	    table = odsdoc.getTableByName("Sheet1");
	    for(int i=1;i<=3;i++)
	    {
	    	OdfTableCell newcell = table.getCellByPosition("J"+i);
	    	Assert.assertEquals(formats[i-1], newcell.getFormatString());
	    }
	    
	}
	
}
