package in.laxmi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindOutEvenNumberInArrayUsingStream {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(21);
		l.add(7);
		l.add(0);
		l.add(12);
		l.add(13);
		System.out.println(l);
		List<Integer> l2 =l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l2);
	}

}
