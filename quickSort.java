package sortingAlgorithms;

public class quickSort {

	public static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		i++;
		int temp = arr[i];
		arr[i] = arr[high];
		arr[high] = temp;
		return i;
	}

	public static void QuickSort(int arr[], int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);

			QuickSort(arr, low, pi - 1);
			QuickSort(arr, pi + 1, high);
		}
	}

	public static void main(String[] args) {

		int arr[] = { 3, 2, 5, 4, 1 };
		int n = arr.length;
		QuickSort(arr, 0, n - 1);

//		printing sorted array
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}

}
