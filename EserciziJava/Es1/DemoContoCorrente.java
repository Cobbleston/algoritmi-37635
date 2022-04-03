public class DemoContoCorrente {
    public static void main(String[] args) {
        ContoCorrente cc1 = new ContoCorrenteInternazionale(Valute.euro);
        ContoCorrente cc2 = new ContoCorrenteInternazionale(10, Valute.pound);
        ContoCorrente cc3 = new ContoCorrenteInternazionale(0.52, Valute.dollar);

        ContoCorrente T[] = {cc1, cc2, cc3};

        for (ContoCorrente i : T) {
            i.versare(20.25);
            i.prelevare(10);
        }

        System.out.println(cc1);;
        System.out.println(cc2);;
        System.out.println(cc3);;
    }
}
