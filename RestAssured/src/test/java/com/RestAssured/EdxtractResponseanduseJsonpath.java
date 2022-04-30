package com.RestAssured;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class EdxtractResponseanduseJsonpath {
@Test
public void parsingTheresponse() {
	//extract the response
	Response response=given().when().get("https://reqres.in/api/users?page=2").then().extract().response();
	//converting your response
	JsonPath jsp=new JsonPath(response.asString());
	System.out.println("page is: "+jsp.getString("page"));
	System.out.println("List of all the email: "+jsp.getList("data.email"));
	int count=jsp.getList("data.id").size();
	for(int i=0;i<count;i++) {
		System.out.println("Firstname is "+jsp.get("data.first_name["+i+"]")+"\t"+"Last name is "+jsp.get("data.last_name["+i+"]"));
	}
	}
}
