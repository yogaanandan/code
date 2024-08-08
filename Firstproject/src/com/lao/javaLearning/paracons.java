package com.lao.javaLearning;

public class paracons {
	String ani_name;
	String ani_type;
	
	paracons(String n,String t){
		 ani_name=n;
		ani_type=t;
		
		
	}
	
	public void sayanimal() {
		System.out.println(ani_name  + ani_type);
		
	}

	public static void main(String[] args) {
		paracons para=new paracons("cat","bad");
		para.sayanimal();
		
		paracons para2=new paracons("dog","good");
		para2.sayanimal();
		

	}

}
