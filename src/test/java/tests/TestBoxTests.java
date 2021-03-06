package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestBoxTests {

    @BeforeAll
    static void srtUp() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1366x768";
    }

    @Test
    void fillFormTest() {
        String name = "Alex Egorov";

        open("/text-box");

        $("[id=userName]").setValue(name);
        $("[id=userEmail]").setValue("alex@egorov.com");
        $("[id=currentAddress]").setValue("Some street 1");
        $("[id=permanentAddress]").setValue("Another street 2");
        $("[id=submit]").click();

        //Asserts
        $("[id=output]").shouldHave(text(name), text("alex@egorov.com"),
                text("Some street 1"), text("Another street 2"));

        //$("[id=output] [id=name]").shouldHave(text(name));
        //$("[id=output]").$("[id=name]").shouldHave(text(name));
        //$("[id=name]").shouldHave(text(name));

        //$("[id=permanentAddress]").shouldHave(text("Permananet Address :Another street 2")); //wrong
        //$("p[id=permanentAddress]").shouldHave(text("Permananet Address :Another street 2")); //wrong
        //$("[id=permanentAddress]", 1).shouldHave(text("Permananet Address :Another street 2")); //wrong

    }
}
