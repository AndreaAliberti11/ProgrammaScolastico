import java.util.Scanner;

public class Palestra implements Certificato {

    private String nome;
    private String cognome;
    private String messaggioClubA;
    private String messaggioClubB;

    public Palestra(String nome, String cognome, int annoR, String medicoC) {
        rilascioCertificato(annoR);
        cognomeMedico(medicoC);
    }

    public Palestra() {
    }

    Scanner inputNumeri = new Scanner(System.in);
    Scanner inputTesti = new Scanner(System.in);

    public void setNome(String nome) {
        boolean continua = true;

        do {

            if (nome.length() >= 3) {
                this.nome = nome;
                continua = false;
            } else {
                System.out.println("Il nome è troppo corto!!");
                System.out.print("Inserisci nome: ");
                nome = inputTesti.nextLine();
            }

        } while (continua);

    }

    public String getNome() {
        return nome;
    }

    public void setCognome(String cognome) {
        boolean continua = true;

        do {

            if (cognome.length() >= 3) {
                this.cognome = cognome;
                continua = false;
            } else {
                System.out.println("Il cognome è troppo corto!!");
                System.out.print("Inserisci Cognome: ");
                cognome = inputTesti.nextLine();
            }

        } while (continua);

    }

    public String getCognome() {
        return cognome;
    }

    public void rilascioCertificato(int annoR) {
        boolean continua = true;

        do {

            if (annoR >= 2023 && annoR <= 2024) {
                messaggioClubA = "Anno di rilascio del certificato medico: " + annoR;
                continua = false;
            } else {
                System.out.println("L'anno inserito non valido, aggiornare certificato!! (valido 2023 o 2024)");
                System.out.print("Inserisci Anno rilascio certificato: ");
                annoR = inputNumeri.nextInt();
            }

        } while (continua);

    }

    public void cognomeMedico(String medicoC) {
        boolean continua = true;

        do {

            if (medicoC.length() > 3) {
                messaggioClubB = "Cognome del Medico: " + medicoC;
                continua = false;
            } else {
                System.out.println("Cognome troppo corto!!");
                System.out.print("Inserisci cognome Medico: ");
                medicoC = inputTesti.nextLine();
            }

        } while (continua);

    }

    public void display() {
        System.out.println();
        System.out.println("Nome della persona iscritta al Club: " + getNome());
        System.out.println("Cognome della persona iscritta al Club: " + getCognome());
        System.out.println(messaggioClubA);
        System.out.println(messaggioClubB);
        System.out.println();
    }

}