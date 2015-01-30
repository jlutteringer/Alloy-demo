package org.alloy.demo.managed.resources;

import java.util.List;

import org.alloy.site.resource.ResourceConfigurationProvider;
import org.alloy.site.resource.configuration.ResourceConfiguration;
import org.alloy.site.resource.configuration.ResourceConfigurations;
import org.springframework.stereotype.Component;

@Component
public class ResourceConfigurator extends ResourceConfigurationProvider {
	@Override
	protected void addConfigurations(List<ResourceConfiguration> configurations) {
		configurations.add(ResourceConfigurations.alias("/js/main.js")
				.include("/js/core/**")
				.build());
	}
}