package sortingAlgorithms;

public class bubbleSort {

	public static void main(String[] args) {
		int a[] = { 7, 5, 2, 3, 1 };
		int size = a.length;
		System.out.println("array befor sort: ");
		for (int x : a) {
			System.out.print(x + " ");
		}

//bubble sort logic
		int temp = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
				System.out.println("geater element :" + a[j]);
			}
		}

		System.out.println("\narray after sort: ");
		for (int x : a) {
			System.out.print(x + " ");
		}

	}

}
