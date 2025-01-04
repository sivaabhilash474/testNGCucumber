package com.mycompany.applicationone.rough;

public class InheritanceExcercise {
	
	public static void main(String[] args) {
		B b = new B();
		b.m5();
		System.out.println("Main method");
		Thread t1 = new Thread();
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
	}

}
