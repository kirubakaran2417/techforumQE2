package com.RestAssured;

import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class Postrequest {
  @Test
  public void postMethodcall() {
	  String payload="{\"id\": 50,"
	  		+ "            \"email\": \"kiruba.karan@reqres.in\","
	  		+ "            \"first_name\": \"kiruba\","
	  		+ "            \"last_name\": \"karan\","
	  		+ "            \"avatar\": \"https://reqres.in/img/faces/8-image.jpg\""
	  		+ "        }";
	  
		RestAssured.baseURI="https://reqres.in/";
		given().header("content-type","application/json").body(payload).
		when().post("api/users").
		then().log().all().assertThat()
		                .statusCode(201).assertThat().body("email", equalTo("kiruba.karan@reqres.in"));

  }
}
