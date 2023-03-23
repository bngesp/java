import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class Test{
    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // for (Integer i : list) {
        //     System.out.println(i);
        // }
        Consumer c = (e) -> System.out.println(e);
        list.forEach(c);
        list.stream().map(e -> 2*e).forEach(c);;

    }
}