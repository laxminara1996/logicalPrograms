package in.laxmi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateNumbersInArrayWithStream {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(2,22,232,63,22,343,63,287,2);
    System.out.println(list);
    Set<Integer> l2 = list.stream().filter(i->Collections.frequency(list, i)>1).collect(Collectors.toSet());
    System.out.println(l2);
}
}
