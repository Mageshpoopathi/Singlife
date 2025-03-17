package com.singlife.json.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Operations {

    //Get operation
    public static Response getOperation(String URL){
        return RestAssured.get(URL);
    }
    //Post operation
    public static Response postOperation(String URL){
        return RestAssured.post(URL);
    }
    //Put operation
    public static Response putOperation(String URL){
        return RestAssured.put(URL);
    }
    //delete operation
    public static Response deleteOperation(String URL){
        return RestAssured.delete(URL);
    }




}
