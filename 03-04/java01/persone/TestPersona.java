package persone;

public class TestPersona {
	public static void main(String[] args) {
		Persona mrossi   = new Persona("Mario Rossi");
		Persona gbianchi = new Persona("Giuseppe Bianchi",Cittadinanza.ExtraEU);
	
		System.out.println(mrossi.getInfo());
    System.out.println(gbianchi.getInfo());
  }
}
