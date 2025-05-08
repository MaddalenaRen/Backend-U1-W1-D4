package Esercizio1;

public class Dirigente extends Dipendente{
    private double bonus;

    public Dirigente(String matricola, double stipendio, double bonus, Dipartimento dipartimento){
        super (matricola, stipendio, dipartimento);
        this.bonus=bonus;
    }

    @Override
    public double calculateSalary() {
        return getStipendio()+bonus;
    }
}
