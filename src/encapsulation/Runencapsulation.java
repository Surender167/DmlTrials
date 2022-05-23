package encapsulation;

public class Runencapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculatoren cr = new Calculatoren();
	//	cr.a = 20;
	//	cr.b = 40;
		cr.setvalues(10, 30);
		
		cr.add();
	int d=	cr.getvalue();
	System.out.println(d);
	}

}
