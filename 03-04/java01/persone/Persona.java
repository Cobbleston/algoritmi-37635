package persone;

public class Persona {
	private String nome;
	private Cittadinanza cittadinanza;
	
	public Persona(String nome, Cittadinanza cittadinanza) {
		this.nome         = nome;
		this.cittadinanza = cittadinanza;
	} 

	public Persona(String nome) {
		this.nome         = nome;
		this.cittadinanza = Cittadinanza.Italiana;
	}
	
	public String getInfo() {
		return "Mi chiamo " + this.nome + " e ho cittadinanza " + this.cittadinanza;
	}
}
