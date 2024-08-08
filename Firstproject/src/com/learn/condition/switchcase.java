package com.learn.condition;

public class switchcase {
	String dog="goldy";
	
	public void guessdog() {
		switch(dog) {
		case "boldy":
			System.out.println("not correct");
			break;
		case "coldy":
			System.out.println("no no");
			break;
		case "goldy":
			System.out.println("correct");
			break;
		case "woldy":
			System.out.println("no");
			break;
			
			
		default:
			System.out.println("cant guess");
		
		}
	}

	public static void main(String[] args) {
		switchcase swi=new switchcase();
		swi.guessdog();
	
		
	}

}
