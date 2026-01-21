package exam;

public class Parameter12 {
	public static String getCharacters(char type1, char type2) {

		for(char i = 1; i<=type2; i++) {
			System.out.println(i);
		}
		return getCharacters + "";
	}
	 

	public static void main(String[] args) {
		String result = getCharacters('a','d');
		System.out.println(result);

	}

}
