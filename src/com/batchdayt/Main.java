package com.batchdayt;

public class Main{
	public static String a;
	
	 public Main(String b) {
		 a = b;
	 }
	
	public static void main(String[] args) {
		//System.out.println("Hello");
		 //Local Variables
		int b = 1; // Local Variables
		float c = (float) 2.2;
		
		//Util.pr("Amit --- jsdfhj sodfjklsdjf");
		Names n = new Names();
		Names u = new Names();
		n.writenames();
		//Util.pr(n.a);
		n.a = "AMIT";
		//Util.pr("n - " +n.a);
		//Util.pr("u - "+u.a);
		test();
	}
	
	static void test() {
		Schools s = new Schools();
		//s.writenames();
	}
	

}
