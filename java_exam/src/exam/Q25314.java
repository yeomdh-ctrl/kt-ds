package exam;

import java.util.Scanner;

public class Q25314 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//String type = "long";
		//type = type + "long";
		//System.out.println(type);
		
		int n = 16;
		
		String type = "";
		
		while(n >= 4) {
			type += "long";
			n -= 4;
		}
		
		type += "int";
		System.out.println(type);
	}

}
