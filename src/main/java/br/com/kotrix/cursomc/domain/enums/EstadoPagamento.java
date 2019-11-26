package br.com.kotrix.cursomc.domain.enums;

public enum EstadoPagamento {

	PENDENTE(1, "Pendente"),
	QUITADO(2, "Quitado"),
	CANCELADO(3, "Cancelado");
	
	private int cod;
	private String descricao;
	
	private EstadoPagamento(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
		
	}
	
	// Fazendo o GET para não deixar alterar os campos
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static EstadoPagamento toEnum(Integer cod) {
		
		if(cod == null) {
			return null;
		}
		// Faz a busca em COD e retorna um valor
		for (EstadoPagamento x: EstadoPagamento.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		// Excessão que já tem no Java
		throw new IllegalArgumentException("Id inválido: "+ cod);
	}
	
	
	
}
