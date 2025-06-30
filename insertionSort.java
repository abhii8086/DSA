package sortingAlgorithms;

public class insertionSort {

	public static void main(String[] args) {
		int a[] = { 2, 3, 6, 1, 5 };
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > key) {
				// shift
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}
		for (int x : a) {
			System.out.print(x + " ");
		}


		//////////////////
		package sorting;

public class insertionSort {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 1 };
		int n = arr.length;

		for (int i = 0; i <= n - 1; i++) {
			int j = i;
			while (j > 0 && arr[j - 1] > arr[j]) {
				int temp = arr[j - 1];
				arr[j - 1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
		for (int x : arr) {
			System.out.print(" " + x);
		}

	}
}

	}

}
