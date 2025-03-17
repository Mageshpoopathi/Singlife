package com.singlife.json.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class Operations {

    //Get operation
    public static Response getOperation(String URL){
        return RestAssured.get(URL);
    }
    //Post operation
    public static Response postOperation(String URL, String jsonFilePath) {
        try {
            String jsonBody = new String(Files.readAllBytes(Paths.get(jsonFilePath)));

            return RestAssured.given()
                    .contentType("application/json")
                    .body(jsonBody)
                    .post(URL);
        } catch (IOException e) {
            throw new RuntimeException("Failed to read JSON file: " + e.getMessage());
        }
    }
    //Put operation
    public static Response putOperation(String URL){
        return RestAssured.put(URL);
    }
    //delete operation
    public static Response deleteOperation(String URL){
        return RestAssured.delete(URL);
    }

    public static Response PostWithHeaders(String URL, String jsonFilePath, Map<String,String> headers) {
        try {
            String jsonBody = new String(Files.readAllBytes(Paths.get(jsonFilePath)));

            return RestAssured.given()
                    .contentType("application/json")
                    .body(jsonBody)
                    .headers(headers)
                    .post(URL);
        } catch (IOException e) {
            throw new RuntimeException("Failed to read JSON file: " + e.getMessage());
        }
    }


}
