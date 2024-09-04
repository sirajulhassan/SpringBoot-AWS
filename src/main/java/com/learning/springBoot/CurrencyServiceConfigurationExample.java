package com.learning.springBoot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "currency.service")
@Component
public class CurrencyServiceConfigurationExample {
	private String url;
	private String user;
	private String key;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	@Override
	public String toString() {
		return "CurrencyServiceConfigurationExample [url=" + url + ", user=" + user + ", key=" + key + "]";
	}
	
	
}
