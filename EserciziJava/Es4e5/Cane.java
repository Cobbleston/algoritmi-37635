import java.time.Year;

public class Cane implements IAnimale {
    int nZampe = 4;
    String verso = "bau";
    String nome;
    Year annoNascita;

    public Cane(String nome, Year annoNascita) {
        this.nome = nome;
        this.annoNascita = annoNascita;
    }

    @Override
    public String getVerso() {
        return this.verso;
    }

    @Override
    public int getNZampe() {
        return this.nZampe;
    }

    @Override
    public int getEta() {
        return Year.now().getValue() - this.annoNascita.getValue();
    }

    @Override
    public String toString() {
        return this.nome + ", che fa " + getVerso() + ", con " + getNZampe() + " zampe, di età " + getEta();
    }

    @Override
    public int confronta(IAnimale a) {
        return getEta() - a.getEta();
    }
}
