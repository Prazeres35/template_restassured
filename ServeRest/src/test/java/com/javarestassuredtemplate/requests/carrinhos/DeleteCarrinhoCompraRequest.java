package com.javarestassuredtemplate.requests.carrinhos;

import com.javarestassuredtemplate.bases.RequestRestBase;
import io.restassured.http.Method;


public class DeleteCarrinhoCompraRequest extends RequestRestBase {

    public DeleteCarrinhoCompraRequest() {

        requestService = "/carrinhos/concluir-compra";
        method = Method.DELETE;


    }
}