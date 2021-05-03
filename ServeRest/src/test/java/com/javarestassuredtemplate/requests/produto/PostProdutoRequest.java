package com.javarestassuredtemplate.requests.produto;

import com.javarestassuredtemplate.GlobalParameters;
import com.javarestassuredtemplate.bases.RequestRestBase;
import com.javarestassuredtemplate.enums.AuthenticationType;
import com.javarestassuredtemplate.utils.GeneralUtils;
import io.restassured.http.Method;




public class PostProdutoRequest extends RequestRestBase {
    public PostProdutoRequest() {


        requestService = "/produtos";
        method = Method.POST;
    }

    public void setJsonBodyUsingJsonFile(
            String nome,
            String preco,
            String descricao,
            String quantidade) {
        jsonBody = GeneralUtils.readFileToAString("src/test/java/com/javarestassuredtemplate/jsons/PostProdutoJson.json")
                .replace("$nome", nome)
                .replace("$preco", preco)
                .replace("$descricao", descricao)
                .replace("$quantidade", quantidade);

    }

}