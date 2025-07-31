package userManagement;

import static io.restassured.RestAssured.given;

import io.restassured.builder.RequestSpecBuilder;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.text.ParseException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import core.StatusCode;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.postRequestBody;
import utils.JsonReader;
import utils.PropertyReader;
import utils.SoftAssertionUtil;
import utils.SoftAssertionUtil1;

public class getUsers {
	private RequestSpecification requestspec;
	
//	@Test
//	public void getUserData() {
//		given().
//		when().get("https://jsonplaceholder.typicode.com/posts/1").
//		then().assertThat().statusCode(200)
////		.body(not(isEmptyString())
//		.body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"));
//	}
	
//	@Test
//	public void vaidateResponseHasItems() {
//		
//		 RestAssured.baseURI = "https://jsonplaceholder.typicode.com"; // replace with actual API
//	Response response =	given().
//		when().get("/posts")
//		.then()
//		.extract()
//		.response();
//	
//List<String> list=	response.jsonPath().getList("title");
//	
//	assertThat(list,hasItems("sunt aut facere repellat provident occaecati excepturi optio reprehenderit","qui est esse"));	
//	}
//	
	
//	
//	@Test
//	public void vaidateResponseHasSize() {
//		
//		 RestAssured.baseURI = "https://jsonplaceholder.typicode.com"; // replace with actual API
//	Response response =	given().
//		when().get("/comments")
//		.then()
//		.extract()
//		.response();
//	
//List<String> list =	Arrays.asList("Eliseo@gardner.biz","Jayne_Kuhic@sydney.com");
//	List<String> list1= response.jsonPath().getList("");
//	
//	assertThat(list1,hasSize(500));	
//	}
	
//	@Test
//	public void vaidateListContainsInOrder() {
//		
//		 RestAssured.baseURI = "https://jsonplaceholder.typicode.com"; // replace with actual API
//	Response response =	given().
//		when().get("/comments?postId=1")
//		.then()
//		.extract()
//		.response();
//	
////List<String> list=	Arrays.asList("Eliseo@gardner.biz","Jayne_Kuhic@sydney.com");
//	List<String> list= response.jsonPath().getList("email");
//	
//	assertThat(list,contains("Eliseo@gardner.biz","Jayne_Kuhic@sydney.com","Nikita@garfield.biz","Lew@alysha.tv","Hayden@althea.biz"));	
//	}
////	
//	@Test
//	public void testGetUsersWithQueryParameters() {
//		RestAssured.baseURI= "https://reqres.in/api";
//		Response response =  given()
//		  .queryParam("page", 2)
//		  .when()
//	      .get("/users");		
//		response.then().body("data[0].id",equalTo(7));//can use is() method as well				
//	}
	
//	@Test
//	public void validateResponseBodyGetPathParam() {
////		RestAssured.baseURI= "https://reqres.in/api";
//		Response response =  given()
//		  .pathParam("raceSeason", 2017)
//		  .when()
//	      .get("http://ergast.com/api/f1/{raceSeason}/circuits.json");		
//		int actualcode =    response.getStatusCode();
//		assertEquals(actualcode, 200); //Testng
//		System.out.println(response.body().asString());//not working java.net.connection error in console	
//	}
////////note: for debugging purpose if not using postman to test api use this loc i.e.	System.out.println(response.body().asString());	


//    @Test
//    public void testCreateUserWithFormParam() {
//        Response response = given()
//             .contentType("application/x-www-form-urlencoded")
////             .header("x-api-key", "reqres-free-v1")
//             .formParam("name", "John Doe")
//             .formParam("job", "Developer")
//             .when()
//             .post("https://reqres.in/api/users")
//             .then()
//            // .statusCode(201)
//             .extract()
//             .response();
//        
//        response.then().body("name", equalTo("John Doe"));// not working due to api key
//    }
//	
//    @Test
//    public void testgetUserWithHeader() {
//        given()
//        .header("Content-Type", "application/json")
//        //.header("Authorization", "bearer ifudif")
//             .when()
//             .get("https://reqres.in//api/users?page=2")
//             .then()
//             .statusCode(200);        //not working api key required
//    }
	
//	@Test
//	public void testWithTwoHeaders() {
//		       String value= PropertyReader.propertyReader("config.properties","server");	
//		       String url = value+"users?page=2";
//		       System.out.println(url);
//		
//	   given()
//	           .header("Authorization", "bearer ywtefdu13tx4fdub1t3ygdxuy3gnx1iuwdheni1u3y4gfuy1t3bx")
//	           .header("Content-Type", "application/json")
//	           .when()
//	           .get(url)
//	           .then()
//	           .statusCode(200);
//	   System.out.println("testWithTwoHeaders Executed Successfully");
//	}
	
	
//	@Test
//	public void testHeadersWithMap() {
//		Map<String,String> headers = new HashMap<>();
//		headers.put("Authorization", "bearer ywtefdu13tx4fdub1t3ygdxuy3gnx1iuwdheni1u3y4gfuy1t3bx");
//		headers.put("Content-Type", "application/json");
//          given()
//	           .headers(headers)
//	           .when()
//	           .get("https://reqres.in/api/users?page=2")
//	           .then()
//	           .statusCode(200);
//	   System.out.println("testWithTwoHeaders Executed Successfully");  //not working api key required
//	}
	
	
//	@Test
//	public void testFetchHeaders() {
//	   Response response = given()
//	           .when()
//	           .get("https://reqres.in/api/users?page=2")
//	           .then()
//	           .extract().response();
//	   Headers headers = response.getHeaders();
//	   //if you want to print all headers then comment 244,246,247
//	   for (Header h : headers) {
//	       if (h.getName().contains("Server")) {
//	           System.out.println(h.getName() + " : " + h.getValue());
//	           assertEquals(h.getValue(), "cloudflare");
//	           System.out.println("testFetchHeaders Executed Successfully");
//	       }
//	   }
//	   
//	}

//	@Test
//	public void testFetchCookies() {
//	   Response response = given()
//	           .when()
//	           .get("https://reqres.in/api/users?page=2")
//	           .then()
//	           .extract().response();
//
//	   Map<String, String> cookies = response.getCookies();
//	   Cookies cookies1 = response.getDetailedCookies();
//	   cookies1.getValue("server");
//	   assertEquals(cookies1.getValue("server"), "cloudflare");
//	   assertThat(cookies,hasKey("Server"));
//	   assertThat(cookies,hasValue("cloudflare"));  
//	
//
//@Test()
//public void validateResponseBodyGetBasicAuth() throws IOException, ParseException, org.json.simple.parser.ParseException {
//	
//	 String username =JsonReader.getTestData("username");
//	 String password =JsonReader.getTestData("password");
//	 System.out.println("username is:"+username +","+"password is:"+password);
//    Response response=given()
//          .auth()
//          .basic(username, password)
//          .when()
//          .get("https://postman-echo.com/basic-auth");
//             int actualcode= response.getStatusCode();
//             assertEquals(actualcode,200);
//    
//}

//@Test()
//public void verifyStatusCodeDelete() {
//	SoftAssertionUtil softassert = new SoftAssertionUtil();
//  Response resp = given().delete("https://reqres.in/api/users/2");
//  assertEquals(resp.getStatusCode(),StatusCode.success.code);
//  softassert.assertEquals(resp.getStatusCode(),StatusCode.success.code,"success code");//use of soft assertion
//  softassert.assertAll();
//  System.out.println("***********************************PASS*******************************");
//}
//
//@Test()
//public void verifyStatusCodeDelete1() {
////	SoftAssertionUtil1 softassert1 = new SoftAssertionUtil1();
//  Response resp = given().delete("https://reqres.in/api/users/2");
//  assertEquals(resp.getStatusCode(),StatusCode.success.code);
//  SoftAssertionUtil1.assertEquals(resp.getStatusCode(),StatusCode.success.code,"success code");//use of soft assertion
//  SoftAssertionUtil1 .assertAll();
//  System.out.println("***********************************PASS*******************************");
//}

//@DataProvider(name="testdata")
//public Object[][] testData() {	
//	return new Object[][] {
//		{"1","john"},
//		{"2","jane"}
//	};
//}
//	
//@Test(dataProvider="testdata")
//@Parameters({"id","name"})
//public void testEndpoint(String id, String name) {
//	Response response=  given()
//	  .queryParam("id", id)
//	  .queryParam("name", name)
//	  .when()
//	  .get("https://reqres.in/api/users");
//	System.out.println(response.then().toString());
////	 .then()
////	 .statusCode(200);
//	  
//	
//}
//	@Test
//	public void test() throws IOException, ParseException, org.json.simple.parser.ParseException {
////		Object value= JsonReader.getJSONArrayData("languages", 1);
////		System.out.println(value.toString());
//		JsonReader.getJSONArrayDataWithIterator("languages");
//	}

//	@Test
//	public void testRestAssuredBuilderPattern() {
//		requestspec =getRequestSpecificationBuilder("2");		
//		   given()
//		   .spec(requestspec)
//		  .when()
//	      .get("/users")
//	      .then()
//	      .assertThat()
//	      .statusCode(200);	
//	}
//	
//	@Test 
//	public RequestSpecification getRequestSpecificationBuilder(String page) {
//		requestspec = new RequestSpecBuilder()
//				.setBaseUri("https://reqres.in/api")
//				.addQueryParam("page", page)
//				.build();
//		return requestspec;		
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
