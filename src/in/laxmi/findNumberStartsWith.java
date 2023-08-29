package in.laxmi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class findNumberStartsWith {
public static void main(String[] args) {
    List<Integer> list=Arrays.asList(2,22,232,63,74,343,748,287,265);
    System.out.println(list);
    List<Integer> l2 = list.stream().map(i->String.valueOf(i)).
    		filter(c->c.startsWith("2")).map(Integer::valueOf).collect(Collectors.toList());
    List<Integer> l3 = list.stream().map(i->String.valueOf(i)).
    		filter(c->c.endsWith("2")).map(Integer::valueOf).collect(Collectors.toList());
    System.out.println(l3);
}
}
