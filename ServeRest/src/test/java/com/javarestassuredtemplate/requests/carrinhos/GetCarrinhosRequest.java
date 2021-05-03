package com.javarestassuredtemplate.requests.carrinhos;

import com.javarestassuredtemplate.bases.RequestRestBase;
import io.restassured.http.Header;
import io.restassured.http.Method;

public class GetCarrinhosRequest extends RequestRestBase {
    public GetCarrinhosRequest(){

        requestService = "/carrinhos";
        method = Method.GET;
    }
}