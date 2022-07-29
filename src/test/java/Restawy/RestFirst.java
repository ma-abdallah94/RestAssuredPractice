package Restawy;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class RestFirst
{
@Test
public void test() {

        given().baseUri("https://62e313f0b54fc209b88492c8.mockapi.io/api/v1/")
                .when().get("Tasks")
                .then().log().all()
                .assertThat().statusCode(200);

}

}
