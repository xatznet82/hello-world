package gr.haec.hello;

public class staticExample {
	
	static int count = 9; 
	
	public staticExample() {
		
		}
	
	public staticExample(int x) {
		staticExample.count = x;
		}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		staticExample.count = count;
	}
	
	public static void printCount () {
		System.out.println(count);
	}

	
	public static void main (String [] args) {
		
		// staticExample test2 = new staticExample();
		// test2.printCount();
		
		staticExample.printCount();
		
		
		staticExample test1 = new staticExample();
		test1.setCount(13);
		test1.printCount();
		
	
	}
}
