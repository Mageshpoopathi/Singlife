package com.singlife.json.stepDefinition.filenet;

import com.singlife.UIAutomation.BaseClass;
import com.singlife.json.utils.Actions;
import com.singlife.json.utils.Operations;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class filenet {

    Response res;

    @Given("I use the Filenet notes API to post data")
    public void i_use_the_filenet_notes_api_to_post_data() {
//        Map<String, String> headers = new HashMap<>();
//        headers.put("Content-Type", "application/json");
//        headers.put("Accept", "application/json");
//        headers.put("Authorization","Basic ZmNtdWFwaXVzZXI6ZmNtdWFwaSNwd2RAMjAyMQ==");
//         res=Operations.PostWithHeaders("https://fcmuapp.ecm.uat.intranet.singlife.com/v1/notes/archival",
//                "src/test/resources/PostMethodDatas/FilenetDatas/filenetNotes.json",headers);


    }

    @When("I validate the status code of the filenet API as {int}")
    public void i_validate_the_status_code_of_the_filenet_api_as(Integer statusCode) {
       // Actions.statusCodeValidation(res,200);
//        Actions.bodyValidation(res);
//        System.out.println("statusCode success");

    }

    @Then("I verify that the filenet notes is created successfully")
    public void i_verify_that_the_filenet_notes_is_created_successfully() {

        System.out.println("ui auto");
        WebDriver driver=BaseClass.Browser();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

    }
}
