package com.javarestassuredtemplate.requests.produto;

import com.javarestassuredtemplate.bases.RequestRestBase;
import com.javarestassuredtemplate.utils.GeneralUtils;
import io.restassured.http.Method;


public class PutProdutoRequest extends RequestRestBase {
    public PutProdutoRequest(String id) {
        requestService = "/produtos/" + id;
        method = Method.PUT;
    }

    public void setJsonBodyUsingJsonFile(
            String nome,
            String preco,
            String descricao,
            String quantidade) {
        jsonBody = GeneralUtils.readFileToAString("src/test/java/com/javarestassuredtemplate/jsons/PostServeRestJson.json")
                .replace("$nome", nome)
                .replace("$preco", preco)
                .replace("$descricao", descricao)
                .replace("$quantidade", quantidade);

    }

}