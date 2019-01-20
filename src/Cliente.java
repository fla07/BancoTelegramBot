
/**
 * @author Flavia Pino
 * Projeto final DESENVOLVIMENTO DE APLICAÇÕES JAVA SOA E INTERNET DAS COISAS
 * FUNDAMENTOS DA TECNOLOGIA JAVA E MODELAGEM VISUAL UML 2.0
 * Turma 32SCJ
 *  
 */

public class Cliente {
      private String nome;
      private String celular;
      private String email;
      private String endereco;
      
    public Cliente(String n, String e){
    	nome=n;
    	email=e;
    }
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
