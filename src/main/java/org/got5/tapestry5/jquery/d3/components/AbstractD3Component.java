package org.got5.tapestry5.jquery.d3.components;

import org.apache.tapestry5.BindingConstants;
import org.apache.tapestry5.ClientElement;
import org.apache.tapestry5.ComponentResources;
import org.apache.tapestry5.MarkupWriter;
import org.apache.tapestry5.annotations.AfterRender;
import org.apache.tapestry5.annotations.BeginRender;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.SetupRender;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.json.JSONArray;
import org.apache.tapestry5.json.JSONObject;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;
import org.got5.tapestry5.jquery.d3.services.D3Stack;


@Import(stack=D3Stack.STACK_ID)
public abstract class AbstractD3Component implements ClientElement{
	

	@Parameter(defaultPrefix=BindingConstants.LITERAL)
	private String clientId;
	
	@Parameter(required=true, defaultPrefix=BindingConstants.PROP)
	private JSONArray dataSet;
	
	private JSONObject opts;	
	
	@Inject
	private JavaScriptSupport javascript;
	
	@Inject
	private ComponentResources resources;
	
	@SetupRender
	public void checkClientId(){
		//Be sure that clientId is set
		if (this.clientId==null){
			clientId = javascript.allocateClientId(resources);
		}
		
		//Organize options to send
		this.opts= new JSONObject();
		
		opts.put("id", this.getClientId());
		opts.put("dataSet", this.dataSet);
		JSONObject specificOptions = this.getSpecificOptions();
		opts.put("extra", specificOptions==null? new JSONObject():specificOptions);
	}
	
	@BeginRender
	public void addDivElement(MarkupWriter writer){
		writer.element("div", "id", clientId);
	}
	
	@AfterRender
	public void setJS(MarkupWriter writer){
//		resources.renderInformalParameters(writer);
		writer.end();
		
		javascript.addInitializerCall(this.getInitializerName(), this.opts);
	}

	public String getClientId() {
		return this.clientId;
	}
	
	
	public abstract JSONObject getSpecificOptions();
	
	public abstract String getInitializerName();
	
}
