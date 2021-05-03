package com.javarestassuredtemplate.tests.produto;

import com.javarestassuredtemplate.bases.TestBase;
import com.javarestassuredtemplate.requests.produto.PutProdutoRequest;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;


public class PutProdutoTests extends TestBase {
    PutProdutoRequest putProdutoRequest;

    @Test
    public void alterarProduto() {
        //Parâmetros
        String id = "";
        String nome = "Flavio";
        String preco = "flavio.01@gmail.com";
        String descricao = "teste";
        String quantidade = "true";
        int statusCodeEsperado = HttpStatus.SC_OK;

        //Fluxo
        putProdutoRequest = new PutProdutoRequest(id);
        putProdutoRequest.setJsonBodyUsingJsonFile(nome, preco, descricao, quantidade);
        ValidatableResponse response = putProdutoRequest.executeRequest();

        //Asserções
        response.statusCode(statusCodeEsperado);


    }

}