package org.got5.tapestry5.jquery.d3.test.pages;

import org.apache.tapestry5.json.JSONArray;

public class BarChartPage {
	
	
	
	public JSONArray getData(){
		return new JSONArray(
				25, 7, 5, 26, 11, 8, 25, 14, 23, 19,
                14, 11, 22, 29, 11, 13, 12, 17, 18, 10,
                24, 18, 25, 9, 3);
	}	

}
