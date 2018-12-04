package com.wujie.toolsmgmt.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "test-env")
public class TestEnv{

    private Map<String, String> apiUrl = new HashMap<String, String>();

    public Map<String, String> getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(Map<String, String> apiUrl) {
        this.apiUrl = apiUrl;
    }

}
