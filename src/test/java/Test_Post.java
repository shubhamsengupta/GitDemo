import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Test_Post {
	@Test
	void test_1(){
//		Map<String, Object> request = new HashMap<String, Object>();
//		request.put("name", "Shubham");
//		request.put("job", "engineer");
//		
//		System.out.println(request);
		JSONObject obj1 = new JSONObject();
		obj1.put("name", "hudlo");
		obj1.put("job","kutkut");
		System.out.println(obj1.toJSONString());
		given().
			body(obj1.toJSONString()).
		when().
			post("https://reqres.in/api/users").
		then().
			statusCode(201);
	}
}
