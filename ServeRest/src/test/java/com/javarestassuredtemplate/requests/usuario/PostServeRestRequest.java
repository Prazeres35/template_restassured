package com.javarestassuredtemplate.requests.usuario;

import com.javarestassuredtemplate.bases.RequestRestBase;
import com.javarestassuredtemplate.utils.GeneralUtils;
import io.restassured.http.Method;


public class PostServeRestRequest extends RequestRestBase {
    public PostServeRestRequest() {
        requestService = "/usuarios";
        method = Method.POST;
    }

    public void setJsonBodyUsingJsonFile(
            String nome,
            String email,
            String password,
            String administrador) {
        jsonBody = GeneralUtils.readFileToAString("src/test/java/com/javarestassuredtemplate/jsons/PostServeRestJson.json")
                .replace("$nome", nome)
                .replace("$email", email)
                .replace("$password", password)
                .replace("$administrador", administrador);

    }

}