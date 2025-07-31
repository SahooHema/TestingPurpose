package userManagement;


import org.apache.commons.io.IOUtils;
import org.json.simple.parser.ParseException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

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

public class FileUpload {	
	@Test
	public void fileUpload() {
		File file = new File("src/test/resources/doc.text");
		Response response=  given()
			.multiPart("file", file)
		    .when()
		    .post("https://example.com/upload");
		System.out.println(response.getStatusCode());
	}
	//note: not important
	
	@Test
	public void fileDowload() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
