using System; 

class Bubble 
{ 
	static void bubbleSort(int []arr) 
	{ 
		int n = arr.Length; 
		for (int i = 0; i < n - 1; i++) 
			for (int j = 0; j < n - i - 1; j++) 
				if (arr[j] > arr[j + 1]) 
				{ 
					// swap temp and arr[i] 
					int temp = arr[j]; 
					arr[j] = arr[j + 1]; 
					arr[j + 1] = temp; 
				} 
	} 

	/* Prints the array */
	static void printArray(int []arr) 
	{ 
		int n = arr.Length; 
		for (int i = 0; i < n; ++i) 
			Console.Write(arr[i] + " "); 
		Console.WriteLine(); 
	} 

	// Driver method 
	public static void Main() 
	{ 
		int []arr = {64, 34, 25, 12, 22, 11, 90}; 
		bubbleSort(arr); 
		Console.WriteLine("Sorted array"); 
		printArray(arr); 
	} 

} 
