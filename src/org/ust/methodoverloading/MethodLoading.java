package org.ust.methodoverloading;

public class MethodLoading {

	public void dataBase(int empId,String name) {
		System.out.println("My Empuid and Name is "+ empId+name);
	}
	public void dateBase(String Email, float salary, long mobileNumber) {
		System.out.println("my detail are"+ Email+salary+mobileNumber);
		
	}
	public static void main(String []args) {
		MethodLoading Det = new MethodLoading();
		Det.dataBase(124358,"Sathish");
		Det.dateBase("mohan.sathish@gmail.com",9840425549l,26/10/1985);
	}
}
