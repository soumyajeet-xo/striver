package recursion; //array swap using 2 pointer
import java.util.*;

public class D1Swap {
	static void swap1(int i,int r,int[] a) {
		if(i>=r)
			return;
		swap2(i,r,a);
		swap1(i+1,r-1,a);
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
		swap1(0,l-1,a);
		System.out.println(Arrays.toString(a));
		
		sc.close();
		

	}

}
