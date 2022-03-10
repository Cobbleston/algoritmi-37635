import colori.*;

public class CoppiaMistaColorabile<A extends IColorabile, B extends IColorabile> extends CoppiaMista<A, B> {

	public void coloraTutti(Colore c){
		this.primo.setColor(c);
		this.secondo.setColor(c);
	}
	
	public Boolean stessoColore(){
		return (this.primo.getColor() == this.secondo.getColor());
	}
	
	
	public CoppiaMistaColorabile(A primo, B secondo, Colore c) {
		super(primo, secondo);
		this.coloraTutti(c);
	}

}
