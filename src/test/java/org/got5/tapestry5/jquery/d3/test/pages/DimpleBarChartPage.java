package org.got5.tapestry5.jquery.d3.test.pages;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import org.apache.commons.io.IOUtils;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.json.JSONArray;

public class DimpleBarChartPage {
	
	@Persist
	private JSONArray data; 
	
	
	public void onActivate() throws IOException{
		if (data == null){
		InputStream is = DimpleBarChartPage.class.getClassLoader().getResourceAsStream("dimple_data.json");
		StringWriter writer= new StringWriter();
		IOUtils.copy(is, writer);
		data= new JSONArray(writer.toString());
		}
	}
	
	public JSONArray getData(){
		return this.data;
	}

}
