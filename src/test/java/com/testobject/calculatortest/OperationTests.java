package com.testobject.calculatortest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.testobject.appium.junit.TestObjectAppiumSuite;
import org.testobject.rest.api.appium.common.TestObject;

import static org.junit.Assert.assertTrue;

@TestObject(testObjectSuiteId = 16381)
@RunWith(TestObjectAppiumSuite.class)
public class OperationTests extends AbstractTest {

    public OperationTests() {}

    /* A simple addition, it expects the correct result to appear in the result field. */
    @Test
    public void twoPlusTwoOperation() {

        app.calculatorScreen().tapDigit("2");
        app.calculatorScreen().tapSymbol("+");
        app.calculatorScreen().tapDigit("2");
        app.calculatorScreen().tapSymbol("=");

        assertTrue(app.calculatorScreen().isResultCorrect("4"));

    }

}