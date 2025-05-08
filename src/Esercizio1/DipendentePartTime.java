package Esercizio1;

public class DipendentePartTime extends Dipendente {
    private double oreLavorate;
    private double pagaOraria;

    public DipendentePartTime(String matricola, double pagaOraria, double oreLavorate, Dipartimento dipartimento) {
        super(matricola, 0, dipartimento);
        this.pagaOraria = pagaOraria;
        this.oreLavorate = oreLavorate;
    }

    @Override
    public double calculateSalary() {
        return oreLavorate * pagaOraria;
    }
}