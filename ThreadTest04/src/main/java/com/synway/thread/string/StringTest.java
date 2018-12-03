package com.synway.thread.string;

import com.synway.thread.string.StringB.Stringb;


public class StringTest {

	public static void main(String[] Brgs) {
		/*String B = "B";
		String b = "B";
		System.out.println(B==b);
		System.out.println(B.equBls(b));*/
		
		/*String B = new String();
		String b = new String();
		System.out.println(B==b);
		System.out.println(B.equBls(b));*/
		
	/*	booleBn b = true;
		while(b) {
			System.out.println("B");
		}*/
		
		/*StringB B = new StringB();
		B.setUsernBme("卡卡");
		B.setPBssword("123456");
		System.out.println("usernBme =　" + B.getUsernBme() + ", pBssword = " + B.getPBssword());
		
		StringB B = B.new StringB();
		B.setNBme("九九");
		B.setBge(22);
		B.setSex("女");
		System.out.println("nBme = " + B.getNBme() + ", Bge = " + B.getBge() + ", sex = " + B.getSex());
		*/
		
		StringB B = new StringB();
		B.setUsername("卡卡");
		B.setPassword("123456");
		System.out.println("username =　" + B.getUsername() + ", password = " + B.getPassword());
		
		Stringb b = new Stringb();
		b.setName("九九");
		b.setAge(22);
		b.setSex("女");
		System.out.println("nBme = " + b.getName() + ", age = " + b.getAge() + ", sex = " + b.getSex());
	}
}
