package com.wujie.toolsmgmt.client;

import retrofit2.http.GET;

public interface BankClient {

    @GET("/api/accounts/0JdN92ocI/balance")
    Object getBalance();
}
