package com.javarestassuredtemplate.tests.carrinhos;

import com.javarestassuredtemplate.bases.TestBase;
import com.javarestassuredtemplate.requests.carrinhos.DeleteCarrinhoCompraRequest;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

public class DeleteCarrinhoCompraTests extends TestBase {
    DeleteCarrinhoCompraRequest deleteCarrinhoCompraRequest;

    @Test
    public void deletarCarrinhoCompra(){

        int statusCodeEsperado = HttpStatus.SC_OK;

        deleteCarrinhoCompraRequest = new DeleteCarrinhoCompraRequest();
        ValidatableResponse response = deleteCarrinhoCompraRequest.executeRequest();

        response.statusCode(statusCodeEsperado);


    }
}