package br.com.kotrix.cursomc.domain.enums;

public enum TipoCliente {
	
	PESSOAFISICA (1, "Pessoa Física"),
	PESSOAJURIDICA (2, "Pessoa Jurídica");

	private int cod;
	private String descricao;
	
	private TipoCliente(int cod, String descricao) {
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
	
	public static TipoCliente toEnum(Integer cod) {
		
		if(cod == null) {
			return null;
		}
		// Faz a busca em COD e retorna um valor
		for (TipoCliente x: TipoCliente.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		// Excessão que já tem no Java
		throw new IllegalArgumentException("Id inválido: "+ cod);
	}
	
}
