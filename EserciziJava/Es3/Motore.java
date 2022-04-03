public class Motore {
    protected tipoMotore carburante;
    protected int cilindrata;
    protected int numero_cilindri;

    public Motore(tipoMotore carburante, int cilindrata, int numero_cilindri) {
        this.carburante = carburante;
        this.cilindrata = cilindrata;
        this.numero_cilindri = numero_cilindri;
    }

    public tipoMotore getTipoMotore() {
        return this.carburante;
    }

    public int potenza() {
        switch (this.carburante) {
            case benzina:
                return (int)((this.cilindrata / this.numero_cilindri) * 0.1);
            case diesel:
                return (int)((this.cilindrata / this.numero_cilindri) * 0.2);
            case metano:
                return (int)(((this.cilindrata * 0.8) / this.numero_cilindri) * 0.25);
        }
        return 0;
    }

    public String toString() {
        return "Motore a " + this.carburante + ", con una cilindrata pari a " + this.cilindrata + " e " + this.numero_cilindri + " cilindri";
    }
}
