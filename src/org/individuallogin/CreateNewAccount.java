package org.individuallogin;

public class CreateNewAccount { // class

	public static void main(String[] args) {
//Syntax of literal String
		String s = "java";

		String s1 = "java";

		String s2 = "Java";
		System.out.println("Working on Branch QA");
		System.out.println("Work done by PERF");
		
		// TO find memory address of the variable
		int i = System.identityHashCode(s);
		System.out.println("Memory address of S variable :" + i);

		int i1 = System.identityHashCode(s1);
		System.out.println("Memory address of S1 variable :" + i1);

		int i2 = System.identityHashCode(s2);
		System.out.println("Memory address of S2 variable :" + i2);

		// Syntax for non literal String

		String s3 = new String("Java");

		String s4 = new String("Java");

		int i3 = System.identityHashCode(s3);
		System.out.println("Memory address of S3 :" + i3);

		int i4 = System.identityHashCode(s4);
		System.out.println("Memory address of S4 :" + i4);
	}

}
//new -->keyword, it is used to allocate new memory