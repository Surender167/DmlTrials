package methodoverloading;

public class Calcioverloading {

	void add() {
		
	}
	
	void add(int a,int b ) {
		
		int t =a + b;
		System.out.println(t);
		
	}
	
	void add(float a , float b) {
		
		float t = a +b;
		System.out.println(t);
	}
	
	void add (int a, int b , int c) {
		
		
		int t = a + b + c;
		System.out.println(t);
		
	}
}
