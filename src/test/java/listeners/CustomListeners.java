package listeners;


import base.Util;

import org.testng.*;

import utilities.Utilities;


import java.io.IOException;


public class CustomListeners extends Util implements ITestListener, ISuiteListener {

    public void onTestStart(ITestResult result) {

    }

    public void onTestSuccess(ITestResult result) {

    }

    public void onTestFailure(ITestResult result) {



    }

    public void onTestSkipped(ITestResult result) {


    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onStart(ITestContext context) {


    }

    public void onFinish(ITestContext context) {

    }

    @Override
    public void onStart(ISuite suite) {

    }

    @Override
    public void onFinish(ISuite suite) {


    }
}
