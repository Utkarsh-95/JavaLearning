/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Utkarsh Pratap Singh
 */
interface ABC {

    void show();
}

interface MyPredicate<T> {

    boolean operation(T t);
}

public class Lambda {

    public void print() {
        System.out.println("Double Colon is there");
    }

    public static void main(String[] args) {

        List<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
        System.out.println(numbersList);
        List<Integer> listWithoutDuplicates = numbersList.stream().distinct().collect(Collectors.toList());
        System.out.println(listWithoutDuplicates);

        int sum = numbersList.stream().filter(i -> i < 10).mapToInt(i -> i).sum();//by using stream api
        System.out.println("Sum = " + sum);

        System.out.println("---------------------------------------------------------------------------------------");

        FunInterface obj = new FunInterface() {
            @Override
            public void show(int x, int y) {
                System.out.println("Func Interface by anonymous " + (x + y));
            }
        };

        obj.show(100, 200);

//        int x should be only x becz its is inferred by Java 8
        FunInterface lambda = (x, y) -> System.out.println("Func Interface using lambda " + (x + y));
        lambda.show(10, 20);

//        ABC doubleColon = Lambda::print;//for static method
        ABC doubleColon = new Lambda()::print;//for non static method
        doubleColon.show();

//        Sort an arraylist using lambda
        List<Employee> empList = new ArrayList<>();

        empList.addAll(Arrays.asList(
                new Employee(1, "Rad", 50000),
                new Employee(2, "Jad", 10000),
                new Employee(3, "Mad", 30000),
                new Employee(4, "Lad", 90000))
        );

        System.out.println("Printing only " + empList);

        Comparator<Employee> comp = new Comparator<Employee>() {
            @Override
            public int compare(Employee t, Employee t1) {
                return t.getEmpName().compareTo(t1.getEmpName());
            }
        };

        Collections.sort(empList, comp);
        System.out.println("Anonymous class");
        System.out.println(empList);

//        Lambda Expression is enhancement of anonymous class
        Comparator<Employee> compL = (e1, e2) -> e1.getEmpName().compareTo(e2.getEmpName());

        Collections.sort(empList, compL);
        System.out.println("Lambda Expression");
        System.out.println(empList);
//        Double Colon :: Method reference
        Collections.sort(empList, Comparator.comparing(Employee::getEmpName));
        System.out.println("Double Colon :: Method reference");
        System.out.println(empList);
        //        predicate functional interface
        MyPredicate<Employee> empPre = x -> x.getSalary() >= 50000;

        for (Employee emp : empList) {
//            if (empPre.test(emp)) {
//                System.out.println(emp.getEmpId() + "-" + emp.getEmpName());
//            }

//            custom predicate
            if (empPre.operation(emp)) {
                System.out.println(emp.getEmpId() + "-" + emp.getEmpName());
            }
        }

//        Using Stream Api
        long count = empList.stream().count();//for count the size of the list
        System.out.println("Size of the list " + count);
        List<Employee> empLnew = empList.stream().filter(x -> x.getSalary() < 50000).collect(Collectors.toList());

        System.out.println(empLnew);

//        IntStream.range(1, 100).forEach(x -> System.out.print(x + "-"));
        int[] array = {1,1,2};
//        int len = (int)
                Arrays.stream(array)
                .distinct()
//                .count();
//        System.out.println(len);
                .forEach(System.out::print);
    }

}
