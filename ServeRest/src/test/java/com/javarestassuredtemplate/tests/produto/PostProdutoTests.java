package com.javarestassuredtemplate.tests.produto;

import com.javarestassuredtemplate.bases.TestBase;
import com.javarestassuredtemplate.requests.produto.PostProdutoRequest;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;


public class PostProdutoTests extends TestBase {
    PostProdutoRequest postProdutoRequest;

    @Test
    public void postarProduto() {
        //Parâmetros
        String nome = "Mouse Logitec";
        String preco = "16";
        String descricao = "Mouse Optico";
        String quantidade = "10";
        int statusCodeEsperado = HttpStatus.SC_CREATED;

        //Fluxo
        postProdutoRequest = new PostProdutoRequest();
        postProdutoRequest.setJsonBodyUsingJsonFile(nome, preco, descricao, quantidade);
        ValidatableResponse response = postProdutoRequest.executeRequest();

        //Asserções
        response.statusCode(statusCodeEsperado);



    }

}