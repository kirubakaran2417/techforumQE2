package com.RestAssured;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class ReqSpecification {
	RequestSpecification reqspec;

	@BeforeClass
	public void usingRequestSpec() {
		String payload="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}";
		reqspec=RestAssured.given();
		reqspec.baseUri("https://reqres.in/");
		reqspec.basePath("api/users/2");
		reqspec.header("content-Type","application/json");
		reqspec.body(payload);

	}

	@Test
	public void putMethodcall() {
		reqspec.put()
		.then().assertThat().statusCode(200);
	}

	@Test
	public void deleteMethodcall() {
		reqspec.delete()
		.then()
		.assertThat().statusLine("HTTP/1.1 204 No Content");
	}
}
