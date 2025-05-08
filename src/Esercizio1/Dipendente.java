package Esercizio1;

public abstract class Dipendente implements CheckIn{
    private String matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    public Dipendente(String matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento= dipartimento;

    }

    public double getStipendio() {
        return stipendio;
    }

    public String getMatricola() {
        return matricola;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public abstract double calculateSalary();

    public void stampaInfo() {
        System.out.println(this.getClass().getSimpleName() +
                " | Matricola: " + getMatricola() +
                " | Dipartimento: " + getDipartimento() +
                " | Salario Calcolato: " + calculateSalary() + " €");
    }

    @Override
    public void checkIn() {
        System.out.println("Dipendente " + getMatricola() + " si è presentato.");
    }
    }