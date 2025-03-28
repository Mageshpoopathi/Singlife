package com.singlife.json;


import com.singlife.UIAutomation.BaseClass;
import com.singlife.json.utils.Actions;
import com.singlife.json.utils.Operations;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class api {
    public static void main(String[] args) {
//        filenetNoteArchival();
//        filenetDocumentArchival();
//        filenetDocumentRetrieval();
        WebDriver driver= BaseClass.Browser();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }

    public static void filenetNoteArchival(){
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("Accept", "application/json");
        headers.put("Authorization","Basic ZmNtdWFwaXVzZXI6ZmNtdWFwaSNwd2RAMjAyMQ==");
        Response res=Operations.PostWithHeaders("https://fcmuapp.ecm.uat.intranet.singlife.com/v1/notes/archival",
                "src/test/resources/PostMethodDatas/FilenetDatas/filenetNotes.json",headers);
        Actions.statusCodeValidation(res,200);
        Actions.bodyValidation(res);
    }
    public static void filenetDocumentArchival(){
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("Accept", "application/json");
        headers.put("Authorization","Basic ZmNtdWFwaXVzZXI6ZmNtdWFwaSNwd2RAMjAyMQ==");
        Response res=Operations.PostWithHeaders("https://fcmuapp.ecm.uat.intranet.singlife.com/v1/documents/archival",
                "src/test/resources/PostMethodDatas/FilenetDatas/filenetDocument.json",headers);
        Actions.statusCodeValidation(res,200);
        Actions.bodyValidation(res);
    }
    public static void filenetDocumentRetrieval(){
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("Accept", "application/json");
        headers.put("Authorization","Basic ZmNtdWFwaXVzZXI6ZmNtdWFwaSNwd2RAMjAyMQ==");
        Response res=Operations.PostWithHeaders("https://fcmuapp.ecm.uat.intranet.singlife.com/v1/documents/archival",
                "src/test/resources/PostMethodDatas/FilenetDatas/filenetDocumentRetrieve.json",headers);
        Actions.statusCodeValidation(res,200);
        Actions.bodyValidation(res);
    }
}
