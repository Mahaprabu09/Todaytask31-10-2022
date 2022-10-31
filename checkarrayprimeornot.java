package day31102022;

public class checkarrayprimeornot {
	// Java program to find prime and non-prime 
	// numbers in the array

	  public static void main(String[] args) {
	  
	    int flag = 0;

	    int arr[] = {10, 11, 13, 15, 17, 19, 23, 25, 30};

	    for (int i = 0; i< arr.length; i++) {
	      flag = 0;
	      for (int j = 2; j < arr[i] / 2; j++) {
	        if (arr[i] % j == 0) {
	          flag = 1;
	          break;
	        }
	      }
	      System.out.printf("%3d - %s\n", arr[i], (flag == 0 ? "Prime" : "Not Prime"));
	    }
	    System.out.println();
	  }
	}


