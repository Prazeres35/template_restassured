package com.javarestassuredtemplate.requests.usuario;

import com.javarestassuredtemplate.bases.RequestRestBase;
import io.restassured.http.Method;


public class GetServeRestParamRequest extends RequestRestBase {

    public GetServeRestParamRequest(String id) {

        requestService = "/usuarios/" + id;
        method = Method.GET;

    }
}