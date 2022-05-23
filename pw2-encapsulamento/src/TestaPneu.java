
public class TestaPneu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bomba bomba = new Bomba();
		bomba.setPressaoDesejada(30);
		bomba.setPressaoLida(20);
		
		System.out.println(bomba.obterResultado());
	}

}
