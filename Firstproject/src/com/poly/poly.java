package com.poly;

public class poly {
	
	public void bike(String a) {
		System.out.println("slow");
	}
	public void bike(int gg) {
		System.out.println("fast");
	}
	public void bike(String c,int f) {
		System.out.println("very slow");
	}

	public static void main(String[] args) {
		poly pol=new poly();
		String inn=new String();
		pol.bike(inn);
		

	}

}
