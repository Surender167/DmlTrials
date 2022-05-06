package practicemethodparameters;

public class Runwithparameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Surendercalci Si = new Surendercalci();
		Si.add(12, 13);
		int f = Si.sub(20, 30);
		System.out.println(f);
		int k = Si.div(100, 20);
		System.out.println(k);

		int l = f + k;
		System.out.println(l);

		int z = Si.mul(12, 14);
		System.out.println(z);

		int a= l + z;
		System.out.println(a);
		
	}

}
