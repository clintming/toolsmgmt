package com.wujie.toolsmgmt.controller;


import com.wujie.toolsmgmt.client.BidClient;
import com.wujie.toolsmgmt.conf.SetEnv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/")
@Controller
public class ApiMgmt {

    @Autowired
    SetEnv setEnv;

    @RequestMapping("/publishBid")
    @ResponseBody
    public String publishBid(){
        String data = "{\n" +
                "    \"uid\":\"Q3kJALwWY\",\n" +
                "    \"amount\":\"2000\",\n" +
                "    \"borrowPeriod\":\"6\",\n" +
                "    \"borrowPeriodUnit\":\"��\",\n" +
                "    \"rate\":15,\n" +
                "    \"description\":\"MCL TEST\",\n" +
                "    \"loanType\":\"PERSON\",\n" +
                "    \"repaymentType\":\"ONE_TIME\",\n" +
                "    \"title\":\"�ƻ����{{title}}\",\n" +
                "    \"warrantUid\":\"dG6AWUufb\"\n" +
                "}";


        //BidClient bidClient = ServiceGenerator.createService(BidClient.class,"http://a.io.tzj.net/core.bid.svc/");
        //String result = bidClient.bidApply(data);
        //return result;
        return setEnv.getApiUrl().get("svcUrl");
    }

    public String openDepositAccount(){

        return null;
    }
}
