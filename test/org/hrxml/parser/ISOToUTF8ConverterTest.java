package org.hrxml.parser;

public class ISOToUTF8ConverterTest {
	public static void main(String[] args) {
		String s = "A fun��o, �ugent???";
		System.out.println(ISOToUTF8Converter.removeNonUTF8Characters(s));
	}
}
