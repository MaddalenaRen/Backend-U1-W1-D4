package Esercizio1;

public class Volontario implements CheckIn{
    private String nome;
    private int eta;
    private String CV;

    public Volontario(String nome, String CV, int eta) {
        this.nome = nome;
        this.CV = CV;
        this.eta = eta;
    }

    @Override
    public void checkIn() {
        System.out.println("Volontario " + nome + ": inizio servizio.");
    }

    @Override
    public String toString() {
        return "Volontario{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                ", CV='" + CV + '\'' +
                '}';
    }
}
