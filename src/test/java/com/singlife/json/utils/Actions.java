package com.singlife.json.utils;

import io.restassured.response.Response;

import static org.hamcrest.Matchers.lessThan;

public class Actions {

    public static void statusCodeValidation(Response response, int statusCode){
        response.then().statusCode(statusCode);
        System.out.println("Status Code Validation:"+statusCode);
    }
    public static void bodyValidation(Response response){
        response.then().log().body();
        System.out.println("body data Validation:");
    }

//    public static void jsonSchemaValidation(Response response, String schemaFilePath) {
//        response.then().assertThat().body(matchesJsonSchemaInClasspath(schemaFilePath));
//        System.out.println("JSON Schema Validation: " + schemaFilePath);
//    }

    // Method to validate Header
    public static void headerValidation(Response response, String headerName, String expectedValue) {
        response.then().header(headerName, expectedValue);
        System.out.println("Header Validation: " + headerName + " = " + expectedValue);
    }

    // Method to validate Content Type
    public static void contentTypeValidation(Response response, String expectedContentType) {
        response.then().contentType(expectedContentType);
        System.out.println("Content Type Validation: " + expectedContentType);
    }

    // Method to validate JSON Path
    public static void jsonPathValidation(Response response, String jsonPath, String expectedValue) {
        String actualValue = response.jsonPath().getString(jsonPath);
        if (actualValue.equals(expectedValue)) {
            System.out.println("JSON Path Validation Passed: " + jsonPath + " = " + expectedValue);
        } else {
            System.out.println("JSON Path Validation Failed: " + jsonPath + " = " + actualValue);
        }
    }

    // Method to validate Response Time
    public static void responseTimeValidation(Response response, long expectedTime) {
        response.then().time(lessThan(expectedTime)); // For example, lessThan 5000 ms
        System.out.println("Response Time Validation: less than " + expectedTime + " ms");
    }

    // Method to validate status line
    public static void statusLineValidation(Response response, String expectedStatusLine) {
        response.then().statusLine(expectedStatusLine);
        System.out.println("Status Line Validation: " + expectedStatusLine);
    }

    // Method to validate the status code range (e.g., 2xx)
    public static void statusCodeRangeValidation(Response response, int lowerRange, int upperRange) {
        int statusCode = response.getStatusCode();
        if (statusCode >= lowerRange && statusCode <= upperRange) {
            System.out.println("Status Code Range Validation Passed: " + statusCode);
        } else {
            System.out.println("Status Code Range Validation Failed: " + statusCode);
        }
    }

    // Method to validate specific cookie
    public static void cookieValidation(Response response, String cookieName, String expectedValue) {
        String actualValue = response.getCookie(cookieName);
        if (actualValue.equals(expectedValue)) {
            System.out.println("Cookie Validation Passed: " + cookieName + " = " + expectedValue);
        } else {
            System.out.println("Cookie Validation Failed: " + cookieName + " = " + actualValue);
        }
    }

    // Method to validate specific session id
    public static void sessionIdValidation(Response response, String expectedSessionId) {
        String actualSessionId = response.getSessionId();
        if (actualSessionId.equals(expectedSessionId)) {
            System.out.println("Session ID Validation Passed: " + actualSessionId);
        } else {
            System.out.println("Session ID Validation Failed: " + actualSessionId);
        }
    }

    // Method to validate that a specific key exists in the response body
    public static void keyExistsValidation(Response response, String jsonPath) {
        boolean exists = response.jsonPath().getList(jsonPath).size() > 0;
        if (exists) {
            System.out.println("Key Exists Validation Passed: " + jsonPath);
        } else {
            System.out.println("Key Exists Validation Failed: " + jsonPath);
        }
    }

    // Method to validate specific query parameter
//    public static void queryParamValidation(Response response, String paramName, String expectedValue) {
//        String actualValue = response.getQueryParam(paramName);
//        if (actualValue.equals(expectedValue)) {
//            System.out.println("Query Parameter Validation Passed: " + paramName + " = " + expectedValue);
//        } else {
//            System.out.println("Query Parameter Validation Failed: " + paramName + " = " + actualValue);
//        }
//    }

    // Method to validate that the response body is not empty
    public static void nonEmptyBodyValidation(Response response) {
        if (!response.getBody().asString().isEmpty()) {
            System.out.println("Non-empty Body Validation Passed.");
        } else {
            System.out.println("Non-empty Body Validation Failed.");
        }
    }
}
