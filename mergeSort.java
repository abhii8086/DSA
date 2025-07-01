package sortingAlgorithms;

public class mergeSort {

	public static void divide(int arr[], int si, int ei) {
		if (si >= ei) // only one element in array
			return;

		int mid = si + (ei - si) / 2;
		divide(arr, si, mid);
		divide(arr, mid + 1, ei);

		conquer(arr, si, mid, ei);
	}

	public static void conquer(int arr[], int si, int mid, int ei) {
		int merged[] = new int[ei - si + 1]; // size of new array

		int idx1 = si;
		int idx2 = mid + 1;
		int x = 0; // x is for filling new array

		while (idx1 <= mid && idx2 <= ei) {
			if (arr[idx1] <= arr[idx2]) {
				merged[x++] = arr[idx1++];
			} else {
				merged[x++] = arr[idx2++];

			}
		}

		while (idx1 <= mid) {
			merged[x++] = arr[idx1++];
		}
		while (idx2 <= ei) {
			merged[x++] = arr[idx2++];

		}
		for (int i = 0, j = si; i < merged.length; i++, j++) {
			arr[j] = merged[i];
		}

	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 5, 1 };
		int n = arr.length;

		divide(arr, 0, n - 1);

//print

		for (int x : arr) {
			System.out.print(x + " ");
		}

	}

}
////////////////////////////////////// new code

package sorting;

public class mergeSort {

	public static void main(String[] args) {
		int arr[] = { 5, 4, 1, 3, 2 };
		int n = arr.length;
		int low = 0;
		int high = n - 1;

		ms(arr, low, high);

		for (int x : arr)
			System.out.print(" " + x);
	}

	public static void ms(int arr[], int low, int high) {

		if (low >= high)
			return;
		int mid = low + (high - low) / 2;
		ms(arr, low, mid);
		ms(arr, mid + 1, high);
		mrg(arr, low, mid, high);

	}

	public static void mrg(int arr[], int low, int mid, int high) {
		int temp[] = new int[high - low + 1];
		int left = low;
		int right = mid + 1;
		int k = 0;

		while (left <= mid && right <= high) {
			if (arr[left] < arr[right]) {
				temp[k++] = arr[left++];
			} else {
				temp[k++] = arr[right++];
			}
		}
		while (left <= mid) {
			temp[k++] = arr[left++];
		}
		while (right <= high) {
			temp[k++] = arr[right++];
		}

		for (int i = 0; i < temp.length; i++) {
			arr[low + i] = temp[i];
		}

	}

}
