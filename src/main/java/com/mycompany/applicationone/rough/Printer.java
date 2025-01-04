package com.mycompany.applicationone.rough;

public class Printer {
	
	String nameWhoStarted;
	
	public Printer() {
		
	}
	
	public Printer(String nameWhoStarted) {
		this.nameWhoStarted = nameWhoStarted;
	}
	
	public void print() {
		for(int i=0; i<=4; i++) {
		System.out.println("Printing started by: "+nameWhoStarted);
		}
	}
	
	public void stopPrint() {
		
	}

}
