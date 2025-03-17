package com.singlife.json;


import com.singlife.json.utils.Actions;
import com.singlife.json.utils.Operations;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class api {
    public static void main(String[] args) {
        Response res=Operations.getOperation("https://www.google.com/");
        Actions.statusCodeValidation(res, 200);

    }
}
