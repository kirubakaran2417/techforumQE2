package com.RestAssured;

import static org.hamcrest.CoreMatchers.equalTo;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class Postrequest2 {

	@SuppressWarnings("unchecked")
	@Test
	public void postmethodcall() {
		JSONObject jsobj=new JSONObject();
		jsobj.put("id", "50");
		jsobj.put("email", "kiruba.karan@reqres.in");
		jsobj.put("first-name", "kiruba");
		jsobj.put("last-name", "v");
		jsobj.put("avatar", "https://reqres.in/img/faces/8-image.jpg");
		
		given().header("content-type","application/json").body(jsobj.toJSONString()).
		when().post("https://reqres.in/api/users").
		then().assertThat().statusCode(201).
		assertThat().body("first-name",equalTo("kiruba"));
	}
}
