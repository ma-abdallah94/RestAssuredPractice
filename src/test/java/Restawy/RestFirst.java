package Restawy;
import static io.restassured.RestAssured.*;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import org.testng.annotations.Test;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class RestFirst
{
@Test
public void test1() {

        given().baseUri("https://62e313f0b54fc209b88492c8.mockapi.io/api/v1/")
                .when().get("Tasks")
                .then().log().all().assertThat().statusCode(200)
                //.assertThat().body("[0].name" , equalTo("Ms. Bessie Wiegand"))
                .assertThat().body("name" , hasItems()) ;
}

@Test
        public void test2() {

                given().baseUri("https://62e313f0b54fc209b88492c8.mockapi.io/api/v1/")
                        .when().get("Tasks")
                        .then().log().all().assertThat().statusCode(200)
                        .assertThat().body("[0].name" , equalTo("Ms. Bessie Wiegand"));

        }

}
