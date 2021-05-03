package com.javarestassuredtemplate.requests.carrinhos;

import com.javarestassuredtemplate.GlobalParameters;
import com.javarestassuredtemplate.bases.RequestRestBase;
import com.javarestassuredtemplate.utils.GeneralUtils;
import io.restassured.http.Method;


public class PostCarrinhoRequest extends RequestRestBase {
    public PostCarrinhoRequest() {

        requestService = "/carrinhos";
        method = Method.POST;
    }

    public void setJsonBodyUsingJsonFile(
            String idProduto,
            String quantidade) {
        jsonBody = GeneralUtils.readFileToAString("src/test/java/com/javarestassuredtemplate/jsons/PostCarrinhoJson.json")
                .replace("$idProduto", idProduto)
                .replace("$quantidade", quantidade);


    }

}