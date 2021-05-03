package com.javarestassuredtemplate.requests.usuario;

import com.javarestassuredtemplate.bases.RequestRestBase;
import com.javarestassuredtemplate.utils.GeneralUtils;
import io.restassured.http.Method;


public class PostLoginServeRestRequest extends RequestRestBase {
    public PostLoginServeRestRequest() {
        requestService = "/login";
        method = Method.POST;
    }

    public void setJsonBodyUsingJsonFile(
            String email,
            String password) {
        jsonBody = GeneralUtils.readFileToAString("src/test/java/com/javarestassuredtemplate/jsons/PostLoginServeRestJson.json")
                .replace("$email", email)
                .replace("$password", password);


    }

}