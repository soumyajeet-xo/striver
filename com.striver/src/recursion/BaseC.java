package recursion;// l1 p2

public class BaseC {

	static int count=0;
	static void print() {
		if(count==3)
			return;
		System.out.println(count);// will print count and there wont be StackOverFlow as there exist a base condition
		count++;
		print(); //updated
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();

	}

}
