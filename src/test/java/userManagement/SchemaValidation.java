package userManagement;

import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;
import static io.restassured.RestAssured.given;
import java.io.File;

public class SchemaValidation {
	
	@Test
	public void schemaValidation() {
		File file = new File("src/test/resources/schemaValidation.json");
		 given()
		 .when()
		 .get("https://reqres.in/api/users?page=2")
		 .then()
		 .assertThat()
		 .statusCode(200)
		 .body(JsonSchemaValidator.matchesJsonSchema(file));
		
	}

}
