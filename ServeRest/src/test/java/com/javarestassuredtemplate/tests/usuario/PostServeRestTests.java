package com.javarestassuredtemplate.tests.usuario;

import com.javarestassuredtemplate.bases.TestBase;
import com.javarestassuredtemplate.requests.usuario.PostServeRestRequest;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;



public class PostServeRestTests extends TestBase {
    PostServeRestRequest postServeRestRequest;

    @Test
    public void criarUsuario() {
        //Parâmetros
        String nome = "Flavio Prazeres";
        String email = "flavio.santos@gmail.com";
        String password = "123456";
        String administrador = "true";
        int statusCodeEsperado = HttpStatus.SC_CREATED;

        //Fluxo
        postServeRestRequest = new PostServeRestRequest();
        postServeRestRequest.setJsonBodyUsingJsonFile(nome, email, password, administrador);
        ValidatableResponse response = postServeRestRequest.executeRequest();

        //Asserções
        response.statusCode(statusCodeEsperado);
        response.body("nome",equalTo(nome),
                "email", equalTo(email),
                "password", equalTo(password),
                "administrador", equalTo(administrador));


    }

}