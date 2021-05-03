package com.javarestassuredtemplate.tests.carrinhos;

import com.javarestassuredtemplate.bases.TestBase;
import com.javarestassuredtemplate.requests.carrinhos.DeleteCarrinhoCancelarRequest;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

public class DeleteCarrinhoCancelarTests extends TestBase {
    DeleteCarrinhoCancelarRequest deleteCarrinhoCancelarRequest;

    @Test
    public void deletarCarrinhoCompraCancelar(){

        int statusCodeEsperado = HttpStatus.SC_OK;

        deleteCarrinhoCancelarRequest = new DeleteCarrinhoCancelarRequest();
        ValidatableResponse response = deleteCarrinhoCancelarRequest.executeRequest();

        response.statusCode(statusCodeEsperado);


    }
}