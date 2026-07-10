package data;

import io.qameta.allure.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.net.SocketTimeoutException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Epic("Database Testing")
@Feature("Allure Categories")
@Owner("Chaithra")
class AllureCategoriesTest {

    @Test
    @Story("Passed Test")
    @Severity(SeverityLevel.NORMAL)
    @Description("A successful test.")
    void passedTest() {
        assertEquals(10, 10);
    }

    @Test
    @Story("Failed Test")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Assertion failure.")
    void failedTest() {
        assertEquals(5, 4, "Expected 5 but found 4");
    }

    @Test
    @Story("Broken Test")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Unexpected NullPointerException.")
    void brokenTest() {
        throw new NullPointerException("Repository object is null");
    }

    @Test
    @Story("Flaky Test")
    @Severity(SeverityLevel.NORMAL)
    @Description("Simulates an intermittent timeout.")
    void flakyTest() throws Exception {
        throw new SocketTimeoutException("connection reset by peer");
    }

    @Test
    @Disabled("Feature under development")
    @Story("Skipped Test")
    @Severity(SeverityLevel.MINOR)
    @Description("Skipped test example.")
    void skippedTest() {
        assertEquals(1, 1);
    }
}