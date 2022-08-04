package sec06.ex01_interfaceExtends;

public class Example {

	public static void main(String[] args) {
		
		ImplementationC impI = new ImplementationC();
		
		A ia = impI;
		ia.methA();
		System.out.println();
		
		B ib = impI;
		ib.methB();
		System.out.println();
		
		C ic = impI;
		ic.methA();
		ic.methB();
		ic.methC();
		System.out.println();

	}

}
