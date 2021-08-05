package com.inetbanking.utilities;

import java.io.File;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends TestListenerAdapter {
	public ExtentSparkReporter spark;
	public ExtentReports extent;
	public ExtentTest logger;

	public void onStart(ITestContext testContext) {
		// String timeStamp = new SimpleDateFormat("yyyy.mm.dd.hh.ss").format(new
		// Date());
		// String repn = "test-output-" + timeStamp + ".html";

		spark = new ExtentSparkReporter("ttt.html");
		extent.attachReporter(spark);

		/*
		 * try { spark.loadXMLConfig(System.getProperty("user.dir") +
		 * "/extent-config.xml"); } catch (IOException e) { e.printStackTrace(); }
		 */

		extent.attachReporter(spark);
		extent.setSystemInfo("host name", "local host");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("user", "Ardhendu");

		spark.config().setDocumentTitle("Inetbanking Test Report");
		spark.config().setReportName("Functional Test Report");
		spark.config().setTheme(Theme.DARK);

	}

	@Override
	public void onTestSuccess(ITestResult tr) {
		logger = extent.createTest(tr.getName());
		logger.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));

	}

	@Override
	public void onTestFailure(ITestResult tr) {
		logger = extent.createTest(tr.getName());
		logger.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));

		String screenp = System.getProperty("user.dir") + "\\Screenshots" + tr.getName() + "png";

		File f = new File(screenp);
		if (f.exists()) {
			logger.fail((Markup) logger.addScreenCaptureFromPath(screenp));

		}

	}

	@Override
	public void onTestSkipped(ITestResult tr) {
		logger = extent.createTest(tr.getName());
		logger.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));
	}

	public void onFinish(ITestContext testContext) {
		extent.flush();
	}

}
