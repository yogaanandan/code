package com.loop;

public class forloop {
	
	public void fl() {
	for(int t=0;t<25;t++) {
		System.out.println("peacock");
		}
}
	
	public void wl() {
		int t=0;
		while(t<25) {
			System.out.println("goal");
			t++;
		}
}
	
		public void dw() {
			int tt=0;
			do {
				System.out.println("loss");
				tt++; }
			while(tt<25);
		    
	}
			

	
	
	
	public static void main(String[] args) {
		forloop forr=new forloop();
		forr.fl();
		forr.wl();
		forr.dw();

	}

}
