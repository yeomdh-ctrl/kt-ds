package exam;

public class Parameter11 {
	public static String nextChar(char lang) {
		char nexrChar =(char)(lang + 1);
		return nexrChar + "";
			
	}

	public static void main(String[] args) {
	String result = nextChar('c');
	System.out.println(result);

	}

}
