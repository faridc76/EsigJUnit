package fr.esigelec.tpjunit;

public class Driver {
	
	public static void test() {
		DateGSI d = new DateGSI(1, 1, 1979);
		DateGSI t = new DateGSI(1, 1, 1979);
		System.out.println(t.toString());
		
	}
	
	
	
	public static void main(String[] args) {
		test();
    }
}
