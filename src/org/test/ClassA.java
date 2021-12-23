package org.test;

public class ClassA {
	public int add(int a,int b) {
		int c=a+b;
		return c;

	}
public static void main(String[] args) {
	ClassA obj=new ClassA();
	obj.add(10,30);
	System.out.println(obj);
}
}
