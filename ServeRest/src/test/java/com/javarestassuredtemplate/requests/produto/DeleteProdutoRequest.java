package com.javarestassuredtemplate.requests.produto;

import com.javarestassuredtemplate.bases.RequestRestBase;
import io.restassured.http.Method;


public class DeleteProdutoRequest extends RequestRestBase {

    public DeleteProdutoRequest(String id) {

        requestService = "/produtos/" + id;
        method = Method.DELETE;


    }
}