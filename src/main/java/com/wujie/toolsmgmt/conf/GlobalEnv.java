package com.wujie.toolsmgmt.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "global-env")
public class GlobalEnv {
    private String runningEnv;

    public String getRunningEnv() {
        return runningEnv;
    }
    public void setRunningEnv(String runningEnv) {
        this.runningEnv = runningEnv;
    }
}
