package com.actitime.testscript;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo {
	
	@Test(dataProvider="Login")
	public void testLogin(String un,String pw) {
		System.out.println(un+"     "+pw);
	}	
	
	@DataProvider
	public Object[][] Login() {
	Object[][] obj	= new Object[2][2];
	obj[0][0]="admin1";
	obj[0][1]="manager1";
	obj[1][0]="admin2";
	obj[1][1]="manager2";
	return obj;
	}
	
}
