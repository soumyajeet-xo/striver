package recursion; //simple sum till n number by brute force approach
import java.util.*;

public class STillN {
	static void print(int i, int n,int s){
		if(i>n) {
			System.out.println(s);
			return;
		}
		print(i+1,n,s+i);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		print(1,n,0);
		sc.close();

	}

}
