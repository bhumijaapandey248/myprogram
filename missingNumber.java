import java.util.Scanner;

class missingNumber 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N, i, ans, sum1 = 0, sum2 = 0, n;
		System.out.println("Enter the value of N: ");
		N = sc.nextInt();

		/* Size of the array: 
			The size of the array will be 1 less than N because it contains all the numbers 
			from 1 to N (may be random order ) except one number that we have to find.
		*/
		// Let the new size be n

		n = N-1;

		// Array Declaration
		int arr[] = new int[n];				// Note- The size of the array is N-1

		// Input Array from User
		System.out.println("Enter the array:");
		for( i = 0; i < n; i++ ) {
			arr[i] = sc.nextInt();
		}

		/* Logic Starts here.....
			Step 1:- Find the sum of numbers from 1 to N 
			This sum will definitely include the missing number because the missing number
			is in between [1-N].
			Now, To find the sum...
		*/

		for( i = 1; i <= N; i++ ) {				// i is used for adding numbers from 1 to N
			sum1 = sum1 + i;
		}

		/* Step 2:- Find the sum of elements of the array
			This sum will not include the missing number because the missing number is not 
			present in the user entered array.
		*/

		for( i = 0; i < n; i++ ) {		// i is used as a index of elements of the array
			sum2 = sum2 + arr[i];
		}

		/* Now, we have both the sum, one includes the missing number i.e. sum1 and 
			other which does not include the missing number i.e. sum2 
			So, it is clear that sum1 > sum2 because it contains the missing number and the
			numbers that are present in the user entered array. 
		*/

		ans = sum1 - sum2;
		System.out.println("Missing number: "+ans);


	}
}