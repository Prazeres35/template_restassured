package com.javarestassuredtemplate.tests.carrinhos;

import com.javarestassuredtemplate.bases.TestBase;
import com.javarestassuredtemplate.requests.carrinhos.GetCarrinhosRequest;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

public class GetCarrinhosTests extends TestBase {
    GetCarrinhosRequest getCarrinhosRequest;

    @Test
    public void buscarCarrinho() {
        //Parâmetros
        int statusCodeEsperado = HttpStatus.SC_OK;

        //Fluxo
        getCarrinhosRequest = new GetCarrinhosRequest();
        ValidatableResponse response = getCarrinhosRequest.executeRequest();

        //Asserções
        response.statusCode(statusCodeEsperado);

    }

}