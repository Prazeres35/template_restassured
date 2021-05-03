package com.javarestassuredtemplate.requests.usuario;

import com.javarestassuredtemplate.bases.RequestRestBase;
import com.javarestassuredtemplate.utils.GeneralUtils;
import io.restassured.http.Method;


public class PutServeRestRequest extends RequestRestBase {
    public PutServeRestRequest(String id) {
        requestService = "/usuarios/" + id;
        method = Method.PUT;
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