package org.got5.tapestry5.jquery.d3.components;

import org.apache.tapestry5.BindingConstants;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.json.JSONObject;
import org.got5.tapestry5.jquery.d3.base.AbstractDimpleComponent;

@Import(library="${jquery.dimple.core.path}/components/dimpleBarChart.js")
public class DimpleBarChart extends AbstractDimpleComponent{
	
	@Parameter(defaultPrefix=BindingConstants.LITERAL)
	private Integer width;
	
	@Parameter(defaultPrefix=BindingConstants.LITERAL)
	private Integer height;

	@Override
	public JSONObject getSpecificOptions() {
		JSONObject res= new JSONObject();
		if (width!=null){
			res.put("width", width);
		}
		if (height!=null){
			res.put("height", height);
		}
		return res;
	}

	@Override
	public String getInitializerName() {
		return "dimpleBarChart";
	}

}
