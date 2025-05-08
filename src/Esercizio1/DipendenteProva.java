package Esercizio1;

public  class DipendenteProva {

    public static void main(String[] args) {

        Dipendente d1 = new DipendenteFullTime( "A1234", 3800.00, Dipartimento.VENDITE);
        Dipendente d2= new DipendentePartTime("B2459",30.00,50, Dipartimento.AMMINISTRAZIONE);
        Dipendente d3= new Dirigente("C5987", 4200.00, 500, Dipartimento.PRODUZIONE);
        Volontario v1 = new Volontario("Anna Rossi", "CV di Anna", 28);

        Dipendente[] dipendenti= {d1,d2,d3};

        CheckIn[] persone = {d1, d2, d3, v1};

        for (int i = 0; i < dipendenti.length; i++) {
            dipendenti[i].stampaInfo();

        }

        for (int i = 0; i < persone.length; i++) {
            persone[i].checkIn();

        }
    }
}