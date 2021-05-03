package com.javarestassuredtemplate.requests.carrinhos;

import com.javarestassuredtemplate.bases.RequestRestBase;
import io.restassured.http.Method;


public class DeleteCarrinhoCancelarRequest extends RequestRestBase {

    public DeleteCarrinhoCancelarRequest() {

        requestService = "/carrinhos/cancelar-compra";
        method = Method.DELETE;


    }
}