package quru.qa;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.*;

public class SimpleTest {

    @BeforeAll
    static void init08() {
        System.out.println("### @BeforeAll");
    }

    @BeforeEach
    void openYaPage() {
        System.out.println("###    @BeforeEach");
     //   Selenide.open("https://ya.ru");
    }

    @AfterEach
    void close() {
        System.out.println("###    @AfterAll");
     //   WebDriverRunner.closeWindow();
    }

    @AfterAll
    static void clean08() {
        System.out.println("### @AfterAll");
    }

    @Test
    void assertTest() {
        System.out.println("###         @Test 0");
    }


    @Test
    void assertTest1() {
        System.out.println("###         @Test 1");
    }

    @Test
    void assertTest2() {
        System.out.println("###         @Test 2");
    }

    @Test
    void assertTest3() {
        System.out.println("###         @Test 3");
    }
}
