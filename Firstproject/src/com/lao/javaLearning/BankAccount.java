package com.lao.javaLearning;

public class BankAccount {
	
	Long accountNumber=12345678l;
	String holdername="agni";
	Integer accbalance=3000;
	
	public void getbalance() {
		System.out.println("Balance is" + accbalance);
		
		
	}
	
	public static void main(String[] args) {
		BankAccount acc=new BankAccount();
		acc.getbalance();


	}
	

}
