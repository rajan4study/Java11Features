/**
 * 
 */
package com.study.java11;

import java.util.Optional;

/**
 * @author 
 *
 */
public class OptionalIsEmpty {
	public static void main(String[]args) {
		Optional<String> opt= Optional.of("ssss");
		System.out.println(opt.isEmpty());
		opt= Optional.empty();
		//Optional.isEmpty()
		System.out.println(opt.isEmpty());
	}

}
