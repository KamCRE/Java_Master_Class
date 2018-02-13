/**
 * 
 */
package com.mytestjar.demo;

/**
 * @author lancre
 *
 */
public class Series {
	
	private static int[] results;

	//  ((n *(n + 1)) / 2
	// nSum(int n) returns the sum of all numbers from 0 to n.
	public static int nSum(int n) {
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += i; 
			System.out.print(sum+", ");
		}
		
		return sum;
	}
	
	 // factorial(int n) returns the product of all numbers from 1 to n
	public static long factorial(int n) {
		if(n==0) {
			return 0;
		}
		long product = 1;
		for(int i = 1; i<=n; i++) {
			product *= i;
			System.out.print(product +", ");
		}
		
		return product;
	}

	
	// fibonacci(n) returns the nth Fibonacci number. These are defined as:
    // f(0) = 0
    // f(1) = 1
    // f(n) = f(n-1) + f(n-2)
	public static int fibonacci(int n) {
		
		if(n==0) {
			return 0;
		}if(n==1) {
			return 1;
		}
			
		int[] results = new int[n+1];
		results[0] = 0;
		results[1] = 1;
		
		for(int i = 2; i<=n;i++) {
			results[i] = results[i-1] + results[i-2];
		}
		
		return results[n];
	}
	

}
