package Programs;

import java.util.*;

public class SortSumMerge {

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();			
	}
	
	public static int sumArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static void mergeArray(int[] arr1,int[] arr2) {
		int totalLen = arr1.length + arr2.length;
		int[] arr = new int[totalLen];
		int k = 0;
		for (int i = 0; i < arr1.length; i++) {
			arr[k] = arr1[i];
			k++;
		}
		for (int i = 0; i < arr2.length; i++) {
			arr[k] = arr2[i];
			k++;
		}
		printArray(arr);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {2,-6,8,1,19,6,-5};
		int[] arr2 = {-2,6,-8,11,-19,16,-15};
		
		while(true) {
			Scanner s = new Scanner(System.in);
			System.out.println("1.) Sort \n2.) Sum \n3.) Merge ");
			System.out.print("enter the choice: ");
			int n = s.nextInt();
			
			switch (n) {
			case 1: {
				System.out.println("before arr1");
				printArray(arr1);
				Arrays.sort(arr1);
				System.out.println("after arr1");
				printArray(arr1);
				System.out.println();
				System.out.println();
				System.out.println("before arr2");
				printArray(arr2);
				System.out.println("after arr2");
				printArray(arr2);
				break;
			}case 2: {
				System.out.println("sum of the elements of the arr1 : "+sumArray(arr1));
				System.out.println("sum of the elements of the arr2 : "+sumArray(arr2));
				break;
			}case 3: {
				mergeArray(arr1, arr2);
				break;
			}	
			default:
				throw new IllegalArgumentException("Unexpected value: " + n);
			}
		}
		
	}

}
