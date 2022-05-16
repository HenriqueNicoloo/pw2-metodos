
public class Atleta {
	public double peso;
	public double altura;
	
	public double obterIMC()
	{  
		double imc = peso / (altura * altura);
		return imc;
	}
	
	public String classificar()
	{
		if(this.obterIMC() < 18.5)
			return "Abaixo do peso";
		else if(this.obterIMC() >= 18.5 && this.obterIMC() <= 24.9)
			return "Peso normal";
		else if(this.obterIMC() >= 25 && this.obterIMC() <= 29.9)
			return "Pré-obesidade";
		else if(this.obterIMC() >= 30 && this.obterIMC() <= 34.9)
			return "Obesidade Grau I";
		else if(this.obterIMC() >= 35 && this.obterIMC() <= 39.9)
			return "Obesidade Grau II";
		else 
			return "Obesidade Grau III";
		
	}
}
