package recursion; //Lect2 Q3 Print from N to 1
import java.util.*;

public class NToO {
	
	static int i=1;
	
	static void print(int i,int n) // i is getting the value of n #function anatomy
	{
		if(i<1) //base condition as the sequence shall print number till 1 
			return;
		System.out.println(i);
		print(i-1,n); // i-1 as it is decreasing sequence
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter until how to be printed backward");
		int n=sc.nextInt();
		print(n,n); // as the first number to be printed will be the number itself
		sc.close();

	}

}
