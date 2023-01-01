package org.primedemo;

public class GitPractice {
	
	public GitPractice() {
		int a =10;
		int b =20;
		System.out.println(a+b);
		
	}
	
	static void metho1() {
		int c =30;
		System.out.println(c);
	}
	
	private void meth() {
		int d =40;
		System.out.println(d);

	}
	
	public static void main(String[] args) {
		
		GitPractice g = new GitPractice();
		metho1();
		g.meth();
	}

}
