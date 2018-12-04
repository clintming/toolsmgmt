package com.wujie.toolsmgmt.conf;

import org.springframework.stereotype.Component;

import java.util.Map;

public interface IEnv {
    public Map<String, String> getApiUrl();
}
