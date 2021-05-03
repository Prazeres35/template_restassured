package com.javarestassuredtemplate.tests.usuario;

import com.javarestassuredtemplate.bases.TestBase;
import com.javarestassuredtemplate.requests.usuario.DeleteServeRestRequest;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

public class DeleteServeRestTests extends TestBase {
    DeleteServeRestRequest deleteServeRestRequest;

    @Test
    public void deletarUsuario(){
        //Parâmetros
        String id = "Y8OkRpYpUQFbQgPD";
        int statusCodeEsperado = HttpStatus.SC_OK;
        //Fluxo
        deleteServeRestRequest = new DeleteServeRestRequest(id);
        ValidatableResponse response = deleteServeRestRequest.executeRequest();
        //Asserções
        response.statusCode(statusCodeEsperado);

    }
}