package com.virgingames.Steps;

import com.virgingames.constants.EndPoints;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

/**
 * Created by Nikunja
 */
public class JackpotsSteps {
    static ValidatableResponse response;

    @Step("Verifying GBP Currency in response")
    public ValidatableResponse verifyCorrectCurrenciesInResponseForGBP() {
       return SerenityRest.given()
                .queryParams("currency", "GBP")
                .when()
                .get(EndPoints.GET_JACKPOT_ENDPOINT_CURRENCY)
                .then();
    }

    @Step("Verifying EUR Currency in response")
    public ValidatableResponse verifyCorrectCurrenciesInResponseForEUR() {
       return SerenityRest.given()
                .queryParams("currency", "EUR")
                .get(EndPoints.GET_JACKPOT_ENDPOINT_CURRENCY)
                .then();
    }

    @Step("Verifying SEK Currency in response")
    public ValidatableResponse verifyCorrectCurrenciesInResponseForSEK() {
      return   SerenityRest.given()
                .queryParams("currency", "SEK")
                .get(EndPoints.GET_JACKPOT_ENDPOINT_CURRENCY)
                .then();
    }

    @Step("Getting jackpot information")
    public ValidatableResponse getProducts() {
        return SerenityRest.given().log().all()
                .when()
                .get(EndPoints.GET_JACKPOT_ENDPOINT_CURRENCY)
                .then();
    }

}