package object;

public class Object {

	public static void main(String[] args) {
		funcaoOB objeto = new funcaoOB();
		String modeloCelular = null;
		
		double resp = objeto.quant(0);
		System.out.printf("o armazenamento do celular:%.1f Gigas%n",resp);
		
		String resp2 = objeto.model(modeloCelular);
		System.out.println("Modelo do celular: "+resp2);
		objeto.situacao();
		objeto.color();
		objeto.marc();
		objeto.batery();
		
		
		

	}

}
