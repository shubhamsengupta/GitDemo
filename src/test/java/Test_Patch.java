import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Test_Patch {
	@Test
	void test_03() {
		JSONObject request = new JSONObject();
		request.put("name", "hodol");
		request.put("job", "kutkut");
		given().
			body(request.toJSONString()).
		when().
			patch("https://reqres.in/api/users/2").
		then().
			statusCode(200);
	}
}
