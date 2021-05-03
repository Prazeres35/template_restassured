package com.javarestassuredtemplate.tests.usuario;

import com.javarestassuredtemplate.bases.TestBase;
import com.javarestassuredtemplate.requests.usuario.GetServeRestParamRequest;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

public class GetServeRestParamTests extends TestBase {
    GetServeRestParamRequest getServeRestParamRequest;

    @Test
    public void buscarUsuario(){

        String id = "I48iAho4r0mQ4NcA";
        String nome = "Flavio";
        String password = "flavio.santos@gmail.com";
        String administrador = "true";
        int statusCodeEsperado = HttpStatus.SC_OK;

        getServeRestParamRequest = new GetServeRestParamRequest(id);
        ValidatableResponse response = getServeRestParamRequest.executeRequest();

        response.statusCode(statusCodeEsperado);

    }
}