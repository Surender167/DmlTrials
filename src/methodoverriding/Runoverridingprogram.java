package methodoverriding;

public class Runoverridingprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rajireddyor ro = new Rajireddyor();
		ro.add();
		Surenderor so = new Surenderor();
		so.add();
		Rajireddyor rr = new Surenderor();
		rr.add();
		rr.sub();
	}

}
