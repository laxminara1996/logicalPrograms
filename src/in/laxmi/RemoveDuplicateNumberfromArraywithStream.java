package in.laxmi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateNumberfromArraywithStream {
public static void main(String[] args) {
    List<Integer> list=Arrays.asList(2,22,232,63,22,343,63,287,2);
    System.out.println(list);
    List<Integer> l1 = list.stream().distinct().collect(Collectors.toList());
    System.out.println(l1);
}
}
