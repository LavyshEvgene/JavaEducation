public class Pyramid {
  public static void main(String[] args) {
	System.out.println();
	int f=39;
	int d=0;
	boolean tr = true;
	for (int i = 0; i<20; i++) {
		for (int j=0; j<f; j++) { 
			if (tr) {
			for (int k=0; k<=d; k++) {System.out.print(" ");}
			}
			tr = false;
			System.out.print("*");
			}

	System.out.println();
	tr = true;
	f--;
	f--;
	d++;
	}
	
}
}