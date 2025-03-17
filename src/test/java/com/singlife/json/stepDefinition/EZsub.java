package com.singlife.json.stepDefinition;

import com.singlife.json.utils.Actions;
import com.singlife.json.utils.Operations;
import io.cucumber.java.en.*;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class EZsub {
    @Given("I use the create quotation API to post data")
    public void i_use_the_create_quotation_api_to_post_data() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("Accept", "application/json");
        headers.put("Authorization","Basic ZmNtdWFwaXVzZXI6ZmNtdWFwaSNwd2RAMjAyMQ==");
        Response res=Operations.PostWithHeaders("https://fcmuapp.ecm.uat.intranet.singlife.com/v1/notes/archival",
                "src/test/resources/PostDatas/FilenetDatas/filenetNotes.json",headers);
        Actions.statusCodeValidation(res,200);
        Actions.bodyValidation(res);
    }
    @When("I verify that the quotation is created successfully")
    public void i_verify_that_the_quotation_is_created_successfully() {
        System.out.println("I use the create quotation API to post data");
    }
    @Then("I validate the status code of the API")
    public void i_validate_the_status_code_of_the_api() {
        System.out.println("I use the create quotation API to post data");
    }
}
