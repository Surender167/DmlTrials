package encapsulation;

public class Calculatoren {

private	int a ;
private	int b;
public	void add(){
		int t = a + b;
		System.out.println(t);
	}
	
public	void setvalues(int x , int y ) {
		
		a = x;
		b = y;
		
		
	}

 public   int getvalue(){
		return a;
    	 
     }
 
 private  void adding(){
    	
    	int l = 30;
    	int j = 45;
    	int t = l + j;
    	System.out.println(t);
    }
 
  public  void display(){
    	adding();
    }
    
       
}
