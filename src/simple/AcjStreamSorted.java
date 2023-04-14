package simple;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AcjStreamSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ls = Arrays.asList(2,3,4,5,6,7);
		Stream<Integer> s = ls
				.parallelStream() // helps to run on multiple threads
				.filter(n -> n>0)
				.sorted(); // gives sorted values, while sorting parallelstream doesn't make any sense
		s.forEach(n -> System.out.println(n));
	}

}
