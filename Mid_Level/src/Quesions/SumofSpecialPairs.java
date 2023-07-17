package Quesions;

import java.util.Iterator;

public class SumofSpecialPairs {
	
	public static int sumOfPairs(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				int prime = j-i;
				int count= 0;
				for (int k = 1; k <= prime; k++) {
					if(prime%k==0) {
						count++;
					}
				}
				if(count==2) {
					sum+=Math.abs(arr[i]-arr[j]);
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] inputArr = {1,3,4,5,6,7,8,76};
		int answer = sumOfPairs(inputArr);
		System.out.println(answer);
	}
}
