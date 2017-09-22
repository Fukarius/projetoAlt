package br.sceweb.model;

public class Empresa {

	String cnpj;
	String nomeDaEmpresa;
	String nomeFantasia;
	String enedereco;
	String telefone;
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNomeDaEmpresa() {
		return nomeDaEmpresa;
	}
	public void setNomeDaEmpresa(String nomeDaEmpresa) {
		if (nomeDaEmpresa.equals("")) {
			throw new IllegalArgumentException("Nome da empresa inválido!");
		} 
		else {
			this.nomeDaEmpresa = nomeDaEmpresa;
		}
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getEnedereco() {
		return enedereco;
	}
	public void setEnedereco(String enedereco) {
		this.enedereco = enedereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}
