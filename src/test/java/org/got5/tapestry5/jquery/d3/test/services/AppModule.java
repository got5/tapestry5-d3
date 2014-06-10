package org.got5.tapestry5.jquery.d3.test.services;

import org.apache.tapestry5.SymbolConstants;
import org.apache.tapestry5.ioc.MappedConfiguration;
import org.apache.tapestry5.ioc.annotations.SubModule;
import org.got5.tapestry5.jquery.d3.services.D3Module;

@SubModule(D3Module.class)
public class AppModule {
	
	public static void contributeApplicationDefaults(MappedConfiguration<String, String> configuration)
    {
        configuration.add(SymbolConstants.PRODUCTION_MODE, "false");
        configuration.add("demo-src-dir","D:/work/tapestry/projects/tapestry-d3/src/");
    }
	
}
