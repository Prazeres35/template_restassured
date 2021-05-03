package com.javarestassuredtemplate.requests.produto;

import com.javarestassuredtemplate.bases.RequestRestBase;
import io.restassured.http.Header;
import io.restassured.http.Method;

public class GetProdutoRequest extends RequestRestBase {
    public GetProdutoRequest(){

        requestService = "/produtos";
        method = Method.GET;
    }
}

