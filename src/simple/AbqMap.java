package simple;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class AbqMap {
	
	public enum Value {
		ONE, TWO, THREE;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Object, String> val1 =  new HashMap<>();
		val1.put(1, "One");
		val1.put("2", "Two");
		val1.put("3", "Three");
		System.out.println(val1);
		EnumMap<Value, String> val2 = new EnumMap<>(Value.class);
		val2.put(Value.ONE, "1");
		val2.put(Value.TWO, "2");
		val2.put(Value.THREE, "3");
		System.out.println(val2);
		TreeMap<Integer, String> val3 = new TreeMap<>();
		val3.put(1, "One");
		val3.put(2, "Two");
		val3.put(3, "Three");
		System.out.println(val3);
		LinkedHashMap<Object, String> val4 = new LinkedHashMap<>();
		val4.put(1, "One");
		val4.put(2, "Two");
		val4.put(3, "Three");
		System.out.println(val4);
		Hashtable<Object, String> val5 = new Hashtable<>();
		val5.put(1, "One");
		val5.put(2, "Two");
		val5.put(3, "Three");
		System.out.println(val5);

	}
}
