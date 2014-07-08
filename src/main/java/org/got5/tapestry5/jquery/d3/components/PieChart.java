package org.got5.tapestry5.jquery.d3.components;

import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.json.JSONObject;
import org.got5.tapestry5.jquery.d3.base.AbstractD3Component;

@Import(
		library="${jquery.d3.core.path}/components/pieChart.js",
		stylesheet="${jquery.d3.core.path}/components/pieChart.css"
)
public class PieChart extends AbstractD3Component{

	@Override
	public JSONObject getSpecificOptions() {
		return null;
	}

	@Override
	public String getInitializerName() {
		// TODO Auto-generated method stub
		return "d3pieChart";
	}

}
