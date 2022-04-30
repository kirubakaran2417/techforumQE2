package com.RestAssured;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.lessThan;
import io.restassured.RestAssured;

public class ValidateResponse {

	@Test
	public void getmethodcall() {
		RestAssured.baseURI="https://reqres.in/api/users";
		
		given().queryParam("page", "2").header("content-type","application/json").
		when().get().
		then().log().all()
		                  .assertThat().statusCode(200)
		                  .assertThat().time(lessThan(5000L))
		                  .assertThat().header("content-type", "application/json; charset=utf-8")
                                       .header("connection", "keep-alive")
                          .assertThat().body("page", equalTo(2));
		
	}
}
