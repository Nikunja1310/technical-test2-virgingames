package com.virgingames.jackpotinfo;

import com.virgingames.Steps.JackpotsSteps;
import com.virgingames.testbase.TestBaseJackpots;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.equalTo;

/**
 * Created by Nikunja
 */
@RunWith(SerenityRunner.class)
public class JackpotAssertTestWithSteps extends TestBaseJackpots {
    @Steps
    JackpotsSteps jackpotsSteps;

    @Title("Verify the Currency is GBP")
    @Test
    public void assertTestForCurrencyGBP() {
        jackpotsSteps.verifyCorrectCurrenciesInResponseForGBP().statusCode(200)
                .body("data.pots[1].currency", equalTo("GBP"));
    }

    @Title("Verify the Currency is EUR")
    @Test
    public void assertTestForCurrencyEUR() {
        jackpotsSteps.verifyCorrectCurrenciesInResponseForEUR().statusCode(200)
                .body("data.pots[1].currency", equalTo("EUR"));
    }

    @Title("Verify the Currency is SEK")
    @Test
    public void assertTestForCurrencySEK() {
        jackpotsSteps.verifyCorrectCurrenciesInResponseForSEK().statusCode(200)
                .body("data.pots[1].currency", equalTo("SEK"));
    }

    @Title("Verify the name in the Bingo")
    @Test
    public void assertTheNameInResponse() {
        jackpotsSteps.getProducts().statusCode(200)
                .body("data.pots[2].name", equalTo("Enterprise"));
    }

    @Title("Verify the Currency in the Bingo")
    @Test
    public void assertTheCurrencyInResponse() {
        jackpotsSteps.getProducts().statusCode(200)
                .body("data.pots[2].currency", equalTo("GBP"));
    }

}

