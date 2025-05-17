package GET;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class GET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Response r = given()
			//now we have 3 things given,whenand then
				.log().all()
				
				.when()
				
				.get("http://localhost:3000/pnrStatus")
				.then()
				.log().all()
			
				
			.statusCode(200)
			.time(lessThan(500L))
			.extract().response();
		System.out.println("response" + r.asPrettyString());
	}
}
