package returntypemethods;

public class Runparameters {

	public static void main(String[] args) {
 
		Calculatorr cr = new Calculatorr();
		int d = cr.adding();
		System.out.println(d);
		int e = cr.hashCode();
		System.out.println(e);
		 Class<?> f = cr.getClass();
		 System.out.println(f);
		 int g =  cr.add(10,11);
		 System.out.println(g);
		 
         int l = cr.multi();
         System.out.println(l);
         int h = cr.multiplying(11, 12);
         System.out.println(h); 
         
            int z= cr.div();
            System.out.println(z);
            
            
             int k = cr.sub();
             System.out.println(k);	
             
             int t = cr.subtraction(10, 11);
             System.out.println(t);
	}

}
