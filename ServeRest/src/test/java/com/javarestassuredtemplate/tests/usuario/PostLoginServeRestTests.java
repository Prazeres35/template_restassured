package com.javarestassuredtemplate.tests.usuario;

import com.javarestassuredtemplate.bases.TestBase;
import com.javarestassuredtemplate.requests.usuario.PostLoginServeRestRequest;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;


public class PostLoginServeRestTests extends TestBase {
    PostLoginServeRestRequest postLoginServeRestRequest;

    @Test
    public void logarUsuario() {
        //Parâmetros
        String email = "flavio.santos@gmail.com";
        String password = "123456";
        int statusCodeEsperado = HttpStatus.SC_OK;

        //Fluxo
        postLoginServeRestRequest = new PostLoginServeRestRequest();
        postLoginServeRestRequest.setJsonBodyUsingJsonFile(email, password);
        ValidatableResponse response = postLoginServeRestRequest.executeRequest();

        //Asserções
        response.statusCode(statusCodeEsperado);


    }

}