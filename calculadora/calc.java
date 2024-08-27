package calculadora;

public class calc {

	public static void main(String[] args) {
		op op = new op();
		double numberOne = 50;
		double numberTwo = 43;
		
		
		
		
		System.out.println(op.soma(numberOne, numberTwo));
		System.out.println(op.subtracao(numberOne, numberTwo));
		System.out.println(op.divisao(numberOne, numberTwo));
		System.out.println(op.multiplicacao(numberOne, numberTwo));
	
		

	}

}
