package org.got5.tapestry5.jquery.d3.test.pages;

import org.apache.tapestry5.json.JSONArray;

public class GroupedBarChartPage {
	
	
	
	public JSONArray getData(){
		return 
			new JSONArray(
				new JSONArray(0.1, 0.2, 0.3, 0.4),
				new JSONArray(0.2, 0.3, 0.4, 0.5),
				new JSONArray(0.3, 0.4, 0.5, 0.6),
				new JSONArray(0.4, 0.5, 0.6, 0.7),
				new JSONArray(0.5, 0.6, 0.7, 0.8)
			);
	}	

}
