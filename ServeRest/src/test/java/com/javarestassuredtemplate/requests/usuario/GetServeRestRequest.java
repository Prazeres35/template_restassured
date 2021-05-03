package com.javarestassuredtemplate.requests.usuario;

import com.javarestassuredtemplate.bases.RequestRestBase;
import io.restassured.http.Method;

public class GetServeRestRequest extends RequestRestBase {
    public GetServeRestRequest(){

        requestService = "/usuarios";
        method = Method.GET;
    }
}
