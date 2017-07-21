using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InsertionSort
{
    class InsertionSort
    {
        static void Main(string[] args)
        {
            int[] arr = {9, 7, 5, 6, 4, 8};

            Console.Write("Initial:");
            for (int i = 0; i < arr.Length; i++)
            {
                Console.Write(" " + arr[i]);
            }
            Console.WriteLine();

            insertionSort(arr);

            Console.Write("Final:");
            for (int i = 0; i < arr.Length; i++)
            {
                Console.Write(" " + arr[i]);
            }
        }

        static void insertionSort(int [] arr)
        {
            int temp, j;

            for (int i = 1; i < arr.Length; i++)    // Initialize i to 1 in order to compare 2nd to 1st element in array
            {
                j = i;  // Always initially compare ith element to first
                temp = arr[i];  // Value to sift downward - could also use arr[j]

                while (j > 0 && arr[j - 1] > temp)  // Compare ith element with previous elements while staying in bounds
                {
                    arr[j] = arr[j - 1];    // Replace if previous element is greater than temp value
                    j--;                    // Decrement to compare next lower element
                }
                arr[j] = temp;  // Either assigning original value to itself, or lowest current value to proper position
            }
        }
    }
}
