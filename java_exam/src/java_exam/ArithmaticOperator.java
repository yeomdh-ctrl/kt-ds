package java_exam;

public class ArithmaticOperator {

	public static void main(String[] args) {
		
		int n = 0;
		
		System.out.println(n);
		n++; // n=n+1; , n+=1
		System.out.println(n);
		
		System.out.println(n++); // System.out.println(n+=1);
		System.out.println(n);
		
		
		n = 0;
		System.out.println(n);
		n--; // n= n-1; , n-=1; 
		System.out.println(n); // = -1
		System.out.println(n--); // = -1
		System.out.println(n); // -2
		
		int m = 10;
		System.out.println(++m); // = 11
		System.out.println(m++); // = 11
		System.out.println(m); // = 12
		
		System.out.println(--m); // = 11
		System.out.println(m--); // = 11
		System.out.println(m); // = 10
		
	}

}
