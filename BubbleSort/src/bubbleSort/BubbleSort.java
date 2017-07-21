package bubbleSort;

public class BubbleSort {
	void bubblesort(int[] arr)
	{
		int temp;
		int j = 0;	// Largest value "bubbles" to the top - no need to check against it after initial pass
		Boolean swaps = true;
		
		while (swaps)
		{
			j++;
			swaps = false;
			for (int i = 0; i < arr.length-j; i++)
			{
				if (arr[i] > arr[i+1])
				{
					temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
					swaps = true;
				}
			}
		}
		
		/*
		// Initial Implementation
		for (int i = 0; i < arr.length && swaps; i++)
		{
			for (int j = i+1; j < arr.length; j++)
			{
				if (arr[i] > arr[j])
				{
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
				else
				{
					swaps = false;
				}
			}
		}
		*/
	}
}
