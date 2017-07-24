using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MergeSort
{
    class MergeSort
    {
        static void Main(string[] args)
        {
            List<int> myList = new List<int>();
            int[] myInts = { 9, 5, 7, 3, 8, 1};
            int[] myInts2 = { 38, 27, 43, 3, 9, 82, 10 };
            myList = myInts.ToList<int>();

            Console.Write("Initial: ");
            for (int i = 0; i < myInts2.Length; i++)
            {
                Console.Write(" "+myInts2[i]);
            }
            Console.WriteLine();

            mergeSort(myInts2, 0, myInts2.Length - 1);

            Console.Write("Final: ");
            for (int i = 0; i < myInts2.Length; i++)
            {
                Console.Write(" " + myInts2[i]);
            }
            Console.WriteLine();
        }

        static void mergeSort(int[] arr, int left, int right)
        {
            int middle;

            if (right > left)
            {
                middle = (left + right) / 2;    // Determine nominal middle

                mergeSort(arr, left, middle);       // Recurse left half
                mergeSort(arr, middle + 1, right);  // Recurse right half

                merge(arr, left, middle, right);    // Merge
            }
        }

        static void merge(int[] arr, int left, int middle, int right)
        {
            // Determine size of arrays
            int i = 0, j = 0;
            int size1 = middle - left + 1;
            int size2 = right - middle;

            // Create temporary arrays
            int[] L = new int[size1];
            int[] R = new int[size2];

            // Copy split data into temp arrays
            for (i = 0; i < size1; i++)
            {
                L[i] = arr[left + i];
            }
            for (j = 0; j < size2; j++)
            {
                R[j] = arr[j + middle + 1];
            }

            // Merge temp arrays in order
            int k = left;
            i = 0;
            j = 0;
            
            while (i < size1 && j < size2)
            {
                if (L[i] <= R[j])
                {
                    arr[k] = L[i];
                    i++;
                }
                else
                {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }

            // Remaining elements as necessary
            while (i < size1)
            {
                arr[k] = L[i];
                i++;
                k++;
            }
            while (j < size2)
            {
                arr[k] = R[j];
                j++;
                k++;
            }
        }
    }
}
