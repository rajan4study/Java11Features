/**
 * 
 */
package com.study.java11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 
 *
 */
public class CollectionFeature {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String>list= new ArrayList<>();
		list.add("test1");
		list.add("test2");
		System.out.println(list);
		String[] arrList1=list.toArray(size->new String[size]);
		System.out.println(Arrays.toString(arrList1));
		String[] arrList2=list.toArray(String[]::new);
		System.out.println(Arrays.toString(arrList2));

	}

}
