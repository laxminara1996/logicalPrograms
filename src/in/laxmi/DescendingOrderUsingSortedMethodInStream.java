package in.laxmi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingOrderUsingSortedMethodInStream {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(2,22,232,63,22,343,63,287,2);
    System.out.println(list);
    //descending order
    List<Integer> l2 = list.stream().sorted((i1,i2)->(i1>i2)?-1:(i2<i1)?-1:0).collect(Collectors.toList());
System.out.println(l2);
//ascending order
List<Integer> l3 = list.stream().sorted((i1,i2)->(i1<i2)?-1:(i2>i1)?-1:0).collect(Collectors.toList());
System.out.println(l3);
    
}
}
