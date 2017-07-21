package quicksort;

public class QuickSort {
	public static void main(String[] arg) {
		int[] theArray = {9, 101, 16, 4, 27, 1, 54, 55, 2};

		System.out.print("theArray:");
		for (int i = 0; i < theArray.length; i++)
		{
			System.out.print(" "+theArray[i]);
		}
		System.out.println("\n");
		
		quicksort(theArray, 0, theArray.length-1);
		
		System.out.print("theArray:");
		for (int i = 0; i < theArray.length; i++)
		{
			System.out.print(" "+theArray[i]);
		}
	}
	
	public static void quicksort(int[] myArray, int left, int right)
	{
		int temp;		// Temp int for copy purposes	
		int i = left;	// 1st Element in Array
		int j = right;	// Last Element in Array
		int pivot = myArray[(left+right)/2];	// Arbitrary pivot point chosen in middle of array
		
		// Logging
		System.out.println("Left: "+left);
		System.out.println("Right: "+right);
		System.out.println("Pivot Index: "+(left+right)/2);
		System.out.println("Pivot: "+pivot);
		System.out.println();
		
		while (i <= j) // Partition complete when i <= j
		{
			while (myArray[i] < pivot)	// Increment i until [i] > pivot
			{
				i++;
			}
			
			while (myArray[j] > pivot) // Decrement j until [j] < pivot
			{
				j--;
			}
			
			if (i <= j)	// Additional check as i and j have changed from initial values ~ [i] > pivot and [j] < pivot so [i] > [j] ~ swap values
			{
				temp = myArray[i];
				myArray[i] = myArray[j];
				myArray[j] = temp;
				i++;
				j--;
			}
		}
		
		// Recursive function calls
		if (left < j)
		{
			quicksort(myArray, left, j);
		}
		if (i < right)
		{
			quicksort(myArray, i, right);
		}
		
		/* Naive Implementation:
		
		Used for loop instead of while loop - could not increment i and decrement j at same time
		for (; i < myArray.length && i < j; i++)
		{
			System.out.println("myArray[i]: "+myArray[i]);
			if (myArray[i] > myArray[pivot])
			{
				// Decrement j until [j] <= [i] ~ DID NOT COMPARE WITH PIVOT 
				while (myArray[i] < myArray[j])
				{
					j--;
				}

				// Swap [i] and [j] ~ Essentially the same
				temp = myArray[j];
				
				System.out.println("myArray[i]: "+myArray[i]);
				System.out.println("myArray[j]: "+myArray[j]);
				System.out.println("temp: "+temp);
				
				myArray[j] = myArray[i];
				myArray[i] = temp;
				
				System.out.println("myArray[i]: "+myArray[i]);
				System.out.println("myArray[j]: "+myArray[j]);
			}
		}
		
		// Had no reasonable way to utilize recursion
		int[] loArray = new int[i];
		int[] hiArray = new int[myArray.length - i];
		
		System.out.print("loArray[]:");
		for (int n = 0; n < i-1; n++)
		{
			loArray[n] = myArray[n];
			System.out.print(" "+loArray[n]);
		}

		System.out.println();
		System.out.print("hiArray[]:");
		for (int n = 0; n < hiArray.length; n++)
		{
			hiArray[n] = myArray[j+n];
			System.out.print(" "+hiArray[n]);
		}
		System.out.println();
		
		if (loArray.length > 1)
		{
			sort(loArray);
		}
		
		if (hiArray.length > 1)
		{
			sort(hiArray);
		}
		*/
	}
}
