/*
Esercizio 1

Scrivere una classe Java per gestire un conto corrente, su cui sono possibili le seguenti operazioni:
    • Aprire conto corrente vuoto (con 0 euro)
    • Aprire conto corrente con X euro
    • Versare X euro nel conto
    • Prelevare X euro dal conto
    • Stampare un messaggio con il saldo attuale (nel metodo toString())

Estendere la classe ContoCorrente per poter gestire conti con valute diverse, aggiungendo un campo valuta che può assumere valori “euro”, “dollar”, “pound” (usare Enumeration).
Definire il costruttore che prende in input il saldo iniziale e la valuta e sovrascrivere il metodo toString()per mostrare i dati appropriati.
Implementare una classe test in cui sono istanziati tre conti di valute diverse e mostrato il saldo di ognuna.
*/

//import java.util.ArrayDeque;
//import java.util.LinkedList;
//import java.util.ArrayList;

public class ContoCorrente {
    protected double saldo;

    public ContoCorrente() {
        this.saldo = 0;
    }

    public ContoCorrente(double saldo) {
        this.saldo = saldo;
    }

    public void versare(double x) {
        if (x > 0)
            this.saldo += x;
    }

    public void prelevare(double x) {
        if (x > 0)
            this.saldo -= x;
    }

    public String toString() {
        return "Saldo attuale del conto: " + this.saldo + " euro";
    }
}