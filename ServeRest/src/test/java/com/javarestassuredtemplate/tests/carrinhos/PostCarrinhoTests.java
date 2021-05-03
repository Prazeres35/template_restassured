package com.javarestassuredtemplate.tests.carrinhos;

import com.javarestassuredtemplate.bases.TestBase;
import com.javarestassuredtemplate.requests.carrinhos.PostCarrinhoRequest;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;


public class PostCarrinhoTests extends TestBase {
    PostCarrinhoRequest postCarrinhoRequest;

    @Test
    public void postarProdutoCarrinho() {
        //Parâmetros
        String idProduto = "";
        String quantidade = "5";
        int statusCodeEsperado = HttpStatus.SC_CREATED;

        //Fluxo
        postCarrinhoRequest = new PostCarrinhoRequest();
        postCarrinhoRequest.setJsonBodyUsingJsonFile(idProduto, quantidade);
        ValidatableResponse response = postCarrinhoRequest.executeRequest();

        //Asserções
        response.statusCode(statusCodeEsperado);


    }

}