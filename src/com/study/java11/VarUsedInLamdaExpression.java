/**
 * 
 */
package com.study.java11;

/**
 * @author 
 *
 */
public class VarUsedInLamdaExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Add cal1=(var a, var b )->a+b;
		Add cal2=(var a, var b )->{
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println(a+" "+b);
			return a*b;};
		System.out.println(cal1.sum(3, 4));
		System.out.println(cal2.sum(3, 4));

	}

}

interface Add{
	int sum(int a, int b);
}
