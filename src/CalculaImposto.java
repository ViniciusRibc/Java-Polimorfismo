
public class CalculaImposto {

	public double TotalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.TotalImposto += valor;	
		
	}

	public double getValorImposto() {
		return TotalImposto;
	}


}
