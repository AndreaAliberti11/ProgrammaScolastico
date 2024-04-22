import java.util.Scanner;

public abstract class Persona {
    
    private String nome;
    private String cognome;
    protected int annoDiNascita;

    public Persona(String nome, String cognome, int annoDiNascita) {
        setNome(nome);
        setCognome(cognome);
    }

    public Persona() {}

    Scanner inputNumeri = new Scanner(System.in);
    Scanner inputTesti = new Scanner(System.in);

    // Inizio Incapsulamento
    public void setNome(String nome) {
        boolean continua = true;

        do {

            if(nome.length() >= 3) {
                this.nome = nome;
                continua = false;
            } else {
                System.out.println("Il nome è troppo corto!!");
                System.out.print("Inserisci nome: ");
                nome = inputTesti.nextLine();
            }

        } while(continua);

    }

    public String getNome() {
        return nome;
    }

    public void setCognome(String cognome) {
        boolean continua = true;

        do {

            if(cognome.length() >= 3) {
                this.cognome = cognome;
                continua = false;
            } else {
                System.out.println("Il cognome è troppo corto!!");
                System.out.print("Inserisci Cognome: ");
                cognome = inputTesti.nextLine();
            }

        } while(continua);

    }

    public String getCognome() {
        return cognome;
    }

    public abstract void setAnnodiNascita(int annoDiNascita);

    public abstract int getAnnodiNascita();
    // Fine Incapsulamento

    public void display() {
        System.out.println();
        System.out.println("Nome: " + getNome());
        System.out.println("Cognome: " + getCognome());
        System.out.println("Anno di nascita: " + getAnnodiNascita());
        System.out.println();
    }

}