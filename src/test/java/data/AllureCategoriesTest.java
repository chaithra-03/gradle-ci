package data;

import io.qameta.allure.*;
import org.junit.jupiter.api.Test;

import java.net.SocketTimeoutException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Epic("Database Testing")
@Feature("Allure Categories")
@Owner("Chaithra")
class AllureCategoriesTest {

    @Test
    @Story("Product Defect")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Assertion failure representing a product defect.")
    void productDefect_shouldFail() {
        assertEquals(5, 4, "Product defect: incorrect order count");
    }

    @Test
    @Story("Broken Test")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Unexpected exception representing a broken test.")
    void brokenTest_shouldFail() {
        throw new NullPointerException("Repository object is null");
    }

    @Test
    @Story("Flaky Test")
    @Severity(SeverityLevel.NORMAL)
    @Description("Simulates a flaky timeout.")
    void flakyTest_shouldFail() throws Exception {
        throw new SocketTimeoutException("connection reset by peer");
    }
}