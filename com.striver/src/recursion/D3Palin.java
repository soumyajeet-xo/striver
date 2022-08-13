package recursion; // check string palindrome or not using recursion 
import java.util.*; //edge case not considered

public class D3Palin {
	
	static boolean isPalin(String s,int i) {
		if(i>=s.length()/2)
			return true;
		if(s.charAt(i)!=s.charAt(s.length()-i-1))
			return false;
		return isPalin(s,i+1);
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(s);
		System.out.println(isPalin(s,0));
		sc.close();

	}

}
