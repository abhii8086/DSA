package non_linearDataStructure;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();

//	insert
		hm.put(1, "Abhijeet");
		hm.put(2, "Sayan");
		hm.put(3, "Kiran");

// search via key
		System.out.println(hm.get(2));

// remove 

		hm.remove(3);
		System.out.println(hm.get(3));
		System.out.println(hm);

// remove all
		hm.clear();
		System.out.println(hm);

//size
		System.out.println(hm.size());

	}

}
