package com.org.tav.observer;

import java.util.function.UnaryOperator;

interface i1{  
    int sum(int x,int y);  
} 
public class Demo {
	public static void main(String[] args) { 
		class test {
            final UnaryOperator<Integer> a = i -> i == 0 ? 1 : i * this.a.apply( i - 1);
        }

       System.out.println(new test().a.apply(5));
	}  
}