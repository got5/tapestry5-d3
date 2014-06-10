package org.got5.tapestry5.jquery.d3.test.pages;

import org.apache.tapestry5.json.JSONArray;
import org.apache.tapestry5.json.JSONObject;

public class PieChartPage {
	
	
	
	public JSONArray getData(){
		
		JSONObject o1= new JSONObject();
		o1.put("label", "one");
		o1.put("value", 20.0);
		JSONObject o2= new JSONObject();
		o2.put("label", "two");
		o2.put("value", 50.0);		
		JSONObject o3= new JSONObject();
		o3.put("label", "three");
		o3.put("value", 30.0);		
		
		return new JSONArray(o1, o2, o3);
	}	

}
