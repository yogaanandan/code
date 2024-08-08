package com.lao.javaLearning;

public class returntype {
	
	public Integer amt=1000;
	
	public Integer collectandgiveittome() {
		System.out.println("dadcollected"+amt);
		return amt;
	}
	

	public static void main(String[] args) {
		returntype ret=new returntype();
			Integer amt=ret.collectandgiveittome();
			System.out.println("add money"+amt);

	}

}
