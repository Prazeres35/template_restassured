package com.javarestassuredtemplate.tests.produto;

import com.javarestassuredtemplate.bases.TestBase;
import com.javarestassuredtemplate.requests.produto.DeleteProdutoRequest;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

public class DeleteProdutoTests extends TestBase {
    DeleteProdutoRequest deleteProdutoRequest;

    @Test
    public void deletarProduto(){

        String id = "jbOfj7tROWPerE7i";
        int statusCodeEsperado = HttpStatus.SC_OK;

        deleteProdutoRequest = new DeleteProdutoRequest(id);
        ValidatableResponse response = deleteProdutoRequest.executeRequest();

        response.statusCode(statusCodeEsperado);


    }
}