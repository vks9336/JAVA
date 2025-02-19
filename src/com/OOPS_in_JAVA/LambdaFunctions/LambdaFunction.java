package com.OOPS_in_JAVA.LambdaFunctions;

import java.util.ArrayList;
import java.util.function.Consumer;


public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i + 1);
        }

        //() -> statement; this is lambda expression
        // ()-> this is lambda function
        //no need to mention the name of the function
        // lambda expression is applied when we want our code to be one-liner
        // we can only use lambda expression when we use functional interfaces

        list.forEach((item) -> System.out.print(item * 2 + "\t"));
        System.out.println();
        //method of printing list using for each method with lambda expression

        Consumer<Integer> fun = (item) -> System.out.print(item * 2 + "\t");
        list.forEach(fun);

        //another method for using lambda expression

        Operation sum = Integer::sum;
        Operation product = (a,b) -> a * b;
        Operation subtract = (a,b) -> a - b;
        System.out.println();

        LambdaFunction calculate = new LambdaFunction();
        System.out.println(calculate.operate(2,4,product));
    }


    private int operate(int a,int b, Operation op){
        return op.operation(a,b);
    }

}
