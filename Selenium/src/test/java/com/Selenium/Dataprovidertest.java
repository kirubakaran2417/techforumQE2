package com.Selenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovidertest {
	@Test(dataProvider = "jovita")
	public void setData(String name,String rollNo) {
		System.out.println("Name: "+name);
		System.out.println("RollNo: "+rollNo);
	}
	@DataProvider(name="jovita")
	public Object[][] dataprovidermethod(){
		Object[][] data=new Object[3][2];
		//1st row
		data[0][0]="dhinesh";
		data[0][1]="001";
		//2nd row
		data[1][0]="kiruba";
		data[1][1]="002";
		//3rd row
		data[2][0]="karan";
		data[2][1]="003";
		return data;
	}
}
