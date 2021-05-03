package com.javarestassuredtemplate.requests.usuario;

import com.javarestassuredtemplate.bases.RequestRestBase;
import com.javarestassuredtemplate.utils.GeneralUtils;
import io.restassured.http.Method;


public class DeleteServeRestRequest extends RequestRestBase {

    public DeleteServeRestRequest(String id) {

        requestService = "/usuarios/" + id;
        method = Method.DELETE;


    }
}