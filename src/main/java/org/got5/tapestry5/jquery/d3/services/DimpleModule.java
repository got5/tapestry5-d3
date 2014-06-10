package org.got5.tapestry5.jquery.d3.services;

import org.apache.tapestry5.ioc.Configuration;
import org.apache.tapestry5.ioc.MappedConfiguration;
import org.apache.tapestry5.services.LibraryMapping;
import org.apache.tapestry5.services.javascript.JavaScriptStack;
import org.got5.tapestry5.jquery.d3.D3SymbolConstants;

public class DimpleModule {
	
	public static void contributeJavaScriptStackSource(
			MappedConfiguration<String, JavaScriptStack> configuration) {
		
		configuration.addInstance(DimpleStack.STACK_ID, DimpleStack.class);
	}
	
	public static void contributeComponentClassResolver(
			Configuration<LibraryMapping> configuration) {
		
		configuration.add(new LibraryMapping("d3-dimple",
				"org.got5.tapestry5.jquery.d3"));
	}
	
	//TODO could be remove
	public static void contributeClasspathAssetAliasManager(
			MappedConfiguration<String, String> configuration) {
		configuration.add("tap-jquery-dimple", "org/got5/tapestry5");
	}	
	
	public static void contributeFactoryDefaults(MappedConfiguration<String, String> configuration)
    {
        configuration.add(D3SymbolConstants.D3_DIMPLE_ASSET_PATH, "classpath:org/got5/tapestry5/jquery/d3/asset");
    }

}
