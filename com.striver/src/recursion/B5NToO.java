package recursion;
import java.util.*;

public class B5NToO {
	
	static void print(int i,int n) {
		if(i>n)
			return;
		print(i+1,n);
		System.out.print(i+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N");
		int n=sc.nextInt();
		print(1,n);
		sc.close();

	}

}
