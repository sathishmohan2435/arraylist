package org.ust.methodoverloading;

public class Calculate {

	public void sum(int a,int b) {
		System.out.println("Sum of "+(a+b));
	}
	public void sum(float a,float b) {
		System.out.println("Sum of "+(a+b));
	}
	public void sum(int c,double d) {
		System.out.println("Sum of "+(c+d));
	}
	public static void main(String[] args) {
		Calculate ca = new Calculate();
		ca.sum(1,2);
		ca.sum(4.6f,4.6f);
		ca.sum(5, 5.5);
	}
}
