package com.learn.condition;

public class elseif {
	
	String act="vijay";
	
	public void ifcla() {
		if(act=="vijay") {
			System.out.println("correct"); }
		
		else if(act=="jj") {
			System.out.println("Not correct");}
		else if(act=="op") {
			System.out.println("NO NO");}
		else {
			System.out.println("sry i cant guess");
		}
		
	}
	
	

	public static void main(String[] args) {
	elseif el=new elseif();
	el.ifcla();

	}

}
