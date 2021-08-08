import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Test01_GET {
	@Test
	void test_01() {
		Response response = get("https://reqres.in/api/users?page=2");
		System.out.println("Status Code: "+response.getStatusCode());
		System.out.println("Response body: "+response.getBody());
		System.out.println("Response time: "+response.getTime());
		
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	@Test
	void test_02() {
		given()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.body("data[0].id", equalTo(7));
	}
}
