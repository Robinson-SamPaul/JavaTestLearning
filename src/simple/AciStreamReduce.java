package simple;

import java.util.Arrays;
import java.util.List;

public class AciStreamReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ls = Arrays.asList(2,3,4,5,6,7);
		Integer res = ls.stream().reduce(0, (c, e) -> c+e); // stream can be used like this. c = carry, e = element, 0 = initial value
		
		System.out.println(res);

	}

}
