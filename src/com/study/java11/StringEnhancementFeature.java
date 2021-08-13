/**
 * 
 */
package com.study.java11;

import java.util.stream.Collectors;

/**
 * @author
 *
 */
public class StringEnhancementFeature {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String test1=" study ";
		//isBlank()
		System.out.println(test1.isBlank());
		System.out.println("".isBlank());
		//lines()
		String test2="Ich heisse Rajan.\n "
				+ "Ich bin enine java entwickler.\n"
				+ "Ich moechte nach Deutschland reisen.";
		//Stream<String> testList=test2.lines();
		System.out.println(test2.lines().collect(Collectors.toList()));
		//strip()
		System.out.println(test1.strip());
		//stripLeading()
		System.out.println(test1.stripLeading());
		//stripTrailing()
		System.out.println(test1.stripTrailing());
		//repeat()
		System.out.println(test1.repeat(10));

	}

}
