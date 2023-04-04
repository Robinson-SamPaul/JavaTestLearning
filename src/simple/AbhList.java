package simple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
//import java.util.Collection;
import java.util.List;

public class AbhList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList - unsorted, ordered, duplicate
//		Collection<Integer> val = new ArrayList<Integer>();
//		val.add(89);
//		val.remove(89);
		List<Integer> val = new ArrayList<>(); // default size is 10 {, 15, 20, etc} and it'll extend
		val.add(6);
		val.add(7);
		val.add(1);
		val.add(88);
		val.add(88);
		System.out.println(val);
		val.add(0, 89);
		for(int i : val) {
			System.out.print(i + " ");
		}
		System.out.println();
		val.remove(2);
		System.out.println(val.get(1) + " " + val.size());
		for(int i : val) { // Integer -> int auto-unboxing
			System.out.print(i + " ");
		}
		System.out.println();
		Collections.sort(val);
		Iterator<Integer> i = val.iterator();
//		System.out.println(i);
		while(i.hasNext()) {
			System.out.print(i.next() + " ");
		}
	}

}
