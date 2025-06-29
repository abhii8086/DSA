package sortingAlgorithms;

public class selctionSort {

	public static void main(String[] args) {

		int a[] = { 2, 1, 3, 7, 4 };
		int size = a.length;
		for (int i = 0; i < size - 2; i++) {
			int smallest = i;
			for (int j = i ; j < size-1; j++) {
				if (a[smallest] > a[j])
					smallest = j;
			}

//			swap

			int temp = a[i];
			a[i] = a[smallest];
			a[smallest] = temp;

		}

		for (int x : a) {
			System.out.print(x);
		}

	}

}
