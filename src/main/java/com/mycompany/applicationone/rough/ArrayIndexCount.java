package com.mycompany.applicationone.rough;

public class ArrayIndexCount {
	
	
	public int[] addTwo(int[] a, int number) {
		
		
		int out[][] = {};
		boolean match = false;
		
			for(int i=0; i<a.length; i++) {
//				System.out.println(a[i]);
				for(int j=i+1; j<a.length; j++) {
//					System.out.println(i + " " +j);
					if(a[i] + a[j] == number) {
						System.out.println(i + " " +j);
						
						match = true;
						
					}
				}
			}

		
		return null;
		
	}
	
	/*
	 * nums =[3,2,5] add = 7
	 * return indexes of 2 and 5 (1,2)
	 */
	
	
	
	
	
	public static void main(String[] args) {
		ArrayIndexCount a = new ArrayIndexCount();
		int[] nums = {6,3,1,4,5,1,6,1,0};
		a.addTwo(nums, 7);
		
//		for(int i=0; i<4; i++) {
//			for(int j=i+1; j<5; j++) {
//				System.out.println(i+ " " +j);
//			}
//			
//		}
		
		
		
	}

}
