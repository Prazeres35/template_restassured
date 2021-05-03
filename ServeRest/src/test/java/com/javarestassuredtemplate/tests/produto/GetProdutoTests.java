package com.javarestassuredtemplate.tests.produto;

import com.javarestassuredtemplate.bases.TestBase;
import com.javarestassuredtemplate.requests.produto.GetProdutoRequest;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

public class GetProdutoTests extends TestBase {
    GetProdutoRequest getProdutoRequest;

    @Test
    public void buscarProduto() {
        //Parâmetros

        int statusCodeEsperado = HttpStatus.SC_OK;


        //Fluxo
        getProdutoRequest = new GetProdutoRequest();
        ValidatableResponse response = getProdutoRequest.executeRequest();

        //Asserções
        response.statusCode(statusCodeEsperado);

    }

}