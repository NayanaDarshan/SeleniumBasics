package Generics;

import java.util.Collections;

public class Bubblesort {

	public static void main(String[] args) {
     int a[] = {30,23,67,89,56,45};
     
     int length =a.length;
     
     for(int i=0; i<length-1; i++) {
    	 System.out.println(a[i]);
     }
     
     System.out.println("**************************************************");

		/*
		 * bubbleSortTest(a);
		 * 
		 * for (int k=0; k<length-1; k++) { System.out.println(a[k]); }
		 */    
     
     
	}
	
	public static void bubbleSortTest(int arr[])
	{
		
		int len= arr.length;
		int temp;
		
		for (int i=0; i<len; i++) {
			for(int j=1; j<(len-1); j++) {
				if( arr[j-1]> arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]= temp;
				}
			}
			
		}
		
	}
}
