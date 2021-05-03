package com.javarestassuredtemplate.tests.usuario;

import com.javarestassuredtemplate.bases.TestBase;
import com.javarestassuredtemplate.requests.usuario.PutServeRestRequest;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;


public class PutServeRestTests extends TestBase {
    PutServeRestRequest putServeRestRequest;

    @Test
    public void alterarUsuario() {
        //Parâmetros
        String id = "nwhBMCFLdXl0QsKP";
        String nome = "Flavio Prazeres dos Santos";
        String email = "flavio.01@gmail.com";
        String password = "teste";
        String administrador = "true";
        int statusCodeEsperado = HttpStatus.SC_OK;

        //Fluxo
        putServeRestRequest = new PutServeRestRequest(id);
        putServeRestRequest.setJsonBodyUsingJsonFile(nome, email, password, administrador);
        ValidatableResponse response = putServeRestRequest.executeRequest();

        //Asserções
        response.statusCode(statusCodeEsperado);
        response.body("nome",equalTo(nome),
                "email", equalTo(email),
                "password", equalTo(password),
                "administrador", equalTo(administrador));


    }

}