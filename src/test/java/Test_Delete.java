import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class Test_Delete {
	@Test
	void test_01() {
		given().
			delete("https://reqres.in/api/users/2").
		then().
			statusCode(204);
	}
}
