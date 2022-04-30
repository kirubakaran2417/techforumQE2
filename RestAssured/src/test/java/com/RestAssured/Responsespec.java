package com.RestAssured;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;
import static io.restassured.RestAssured.given;

public class Responsespec {
	ResponseSpecification responseSpecification=null;

	@BeforeClass
public void setupresponsespecification() {
	
	responseSpecification=RestAssured.expect();
	responseSpecification.contentType(ContentType.JSON);
	responseSpecification.statusCode(200);
	responseSpecification.time(Matchers.lessThan(5000L));
	responseSpecification.statusLine("HTTP/1.1 200 OK");			
	
}
	
	@Test
	public void getllistofusers() {
		RestAssured.baseURI="https://reqres.in/api/users?=2";
		given().when().get().then().spec(responseSpecification).body("size()",Matchers.lessThanOrEqualTo(6));
		
	}
	@Test
	public void getsingleUser() {
		RestAssured.baseURI="https://reqres.in/api/users/2";
		given().when().then().spec(responseSpecification).header("connection", "keep-alive");

	}
}
