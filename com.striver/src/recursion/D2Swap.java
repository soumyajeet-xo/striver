package recursion; //array swap using recursion 1 pointer
import java.util.*;

public class D2Swap {
	
	static void swap1(int i,int[] a, int n) {
		if(i>=(n/2))
			return;
		swap2(i,n-i-1,a);
		swap1(i+1,a,n);
		
		
	}
	
	
	static void swap2(int i,int r,int[] a) {
		int temp=a[i];
	    a[i]=a[r];
	    a[r]=temp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of the arr");
		int l=sc.nextInt();
		int a[]=new int[l];
		System.out.println("enter the values of arr seperated by space");
		for(int i=0;i<l;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		swap1(0,a,l);
		System.out.println(Arrays.toString(a));
		
		sc.close();
		

	}
}
