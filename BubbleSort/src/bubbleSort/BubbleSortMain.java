package bubbleSort;

public class BubbleSortMain {

	public static void main(String[] args) {
		//int [] arr = {9,7,8,5,6,3,4,1,2};
		int [] arr = {19,7,58,5,61,3,104,11,2};
		
		System.out.print("Initial: ");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		
		BubbleSort sort = new BubbleSort();
		
		sort.bubblesort(arr);
		
		System.out.print("Final:   ");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println("\n");
	}
}
