package userManagement;

import org.apache.commons.io.IOUtils;

import org.json.simple.parser.ParseException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import core.BaseTest;
import core.StatusCode;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import utils.JsonReader;
import utils.SoftAssertionUtil;

import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;
import java.util.List;
import java.util.Map;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import static org.hamcrest.MatcherAssert.assertThat;
import static io.restassured.RestAssured.given;
import java.io.File;
public class Practice extends BaseTest{
	@Test()
	public void verifyStatusCodeDelete() {
		//ExtentReport.extentlog = ExtentReport.extentreport.startTest("verifySC404","Validate 404 status code - negative testcase”);
// first parameter will be the name and second parameter will have the description about the test case
		extentTest= extentReports.createTest("verifystatuscodedelete", "verify 204 status code delete method");				
				Response resp = given()
						.contentType("application/json")
						.header("x-api-key","reqres-free-v1")
						.delete("https://reqres.in/api/users/2");
	  assertEquals(resp.getStatusCode(),204);
	  System.out.println("***********************************PASS*******************************");
	}

}

















