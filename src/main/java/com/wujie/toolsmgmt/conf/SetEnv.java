package com.wujie.toolsmgmt.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class SetEnv{

    @Autowired
    ProEnv proEnv;
    @Autowired
    TestEnv testEnv;
    @Autowired
    GlobalEnv globalEnv;



    public Map<String, String> getApiUrl() {
        String runningEnv = globalEnv.getRunningEnv();
        switch (runningEnv){
            case "2":
                return testEnv.getApiUrl();
            case "1":
                return proEnv.getApiUrl();

            default:
                return null;
        }
    }
}
