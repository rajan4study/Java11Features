/**
 * 
 */
package com.study.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * @author
 *
 */
public class FileReadStringAndWriteString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		var url="D:\\workspace\\Java11Feature\\Java11Features\\src\\TestFiles\\Text";
		try {
			Files.writeString(Path.of(url), "\nfile read string and write string", StandardOpenOption.APPEND);
			String data= Files.readString(Path.of(url));
			System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
