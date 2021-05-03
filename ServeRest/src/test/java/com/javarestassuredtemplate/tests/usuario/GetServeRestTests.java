package com.javarestassuredtemplate.tests.usuario;

import com.javarestassuredtemplate.bases.TestBase;
import com.javarestassuredtemplate.requests.usuario.GetServeRestRequest;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

public class GetServeRestTests extends TestBase {
    GetServeRestRequest getServeRestRequest;

    @Test
    public void buscarUsuarioExistente(){
        //Parâmetros
        int statusCodeEsperado = HttpStatus.SC_OK;

        //Fluxo
        getServeRestRequest = new GetServeRestRequest();
        ValidatableResponse response = getServeRestRequest.executeRequest();

        //Asserções
        response.statusCode(statusCodeEsperado);


    }
}
