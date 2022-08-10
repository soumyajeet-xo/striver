package recursion; //Lect2 Q1
import java.util.*;

public class Ntimes {
	
	static int i=1;
	
	static void print(int i,int n)
	{
		if(i>n) //base condition
			return;
		System.out.println("Hey");
		print(i+1,n); 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many times to be printed?");
		int n=sc.nextInt();
		print(i,n);
		sc.close();

	}

}
