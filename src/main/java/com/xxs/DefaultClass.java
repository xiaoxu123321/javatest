package com.xxs;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DefaultClass {
    public static  void aaa(Comparator<Integer> comparator, Integer i1 , Integer i2 ){
        System.out.println(comparator.compare(i1,i2));
    }

    public static void main(String[] args) {
/*        DefaultInterface defaultInterface = (msg)-> "dsad"+msg;
        //aaa( (i1, i2)-> i2-i1 ,10,20);
       // System.out.println("--------------------------------");
        List<Integer> asList = Arrays.asList(1, 2, 3, 45, 6, 45, 78, 79, 55, 54, 73, 54);
         asList = asList.stream()
                .map(item -> item * 10)
                .filter(item -> item >= 500)   //大于500的留下 小于500的不保留
                .sorted((num1, num2) -> num1 - num2)
                .distinct()
                .collect(Collectors.toList());//  .forEach(System.out::println)*//*

//.reduce((num1, num2) -> num1 + num2)
//.reduce(BinaryOperator.maxBy((num1, num2) -> num1 - num2))
        System.out.println(asList);
     //   System.out.println(reduce.get());
        //;

                //.collect(Collectors.toSet());

*/

/*        List<Double> array = new ArrayList<>();
        for (int i = 0; i <10000000 ; i++) {
            double random = Math.random();
            array.add(random);
        }
        long s1 = System.currentTimeMillis();
        List<Double> collect = array.stream()
                .sorted().collect(Collectors.toList());
        long e1 = System.currentTimeMillis();
        System.out.println(e1-s1);
        System.out.println("---------------------------------------");
        long s2 = System.currentTimeMillis();
        List<Double> collect2 = array.parallelStream()
                .sorted().collect(Collectors.toList());
        long e2 = System.currentTimeMillis();
        System.out.println(e2-s2);*/
        System.out.println("222222222222222222222222222222222222222222");
        System.out.println("3333333333333333333333333333333333333333");
        System.out.println("44444444444444444444444444444444444444444");//hot-fix 分支编写
        System.out.println("hot-fix test");
        System.out.println("111111111111111111111hot-fix test");
    }

}
