public class Studente extends Persona implements Certificato {
    
    private int annoDiNascita;
    private int classe;
    private char sezioneFrequentata = 'U';
    private String matricola = "";
    private static int numero = 0;
    private String messaggioCertificato;
    private String messaggioMedico;

    public Studente(String nome, String cognome, int annoDiNascita, int classe, char sezioneFrequentata, String matricola, int annoR, String medicoC) {
        super(nome, cognome, annoDiNascita);
        setClasse(classe);
        setSezioneFrequentata(sezioneFrequentata);
        rilascioCertificato(annoR);
        cognomeMedico(medicoC);
    }

    public Studente() {}

    // Inizio Incapsulamento
    public void setAnnodiNascita(int annoDiNascita) {


            if(annoDiNascita >= 2000 && annoDiNascita <= 2018) {
                this.annoDiNascita = annoDiNascita;
            } else {
                System.out.println("Anno di Nascita non valido!! (valido minore di 2018 per gli studenti)");
            }

    }

    public int getAnnodiNascita() {
        return annoDiNascita;
    }

    public void setClasse(int classe) {
        boolean continua = true;

        do {

            if(classe >= 1 && classe <= 5) {
                this.classe = classe;
                continua = false;
            } else {
                System.out.println("Classe non valida!! (valida dalla 1 alla 5)");
                System.out.print("Inserisci classe: ");
                classe = inputNumeri.nextInt();
            }

        } while (continua);

    }

    public int getClasse() {
        return classe;
    }

    public void setSezioneFrequentata(char sezioneFrequentata) {
        boolean continua = true;

        do {

            switch(sezioneFrequentata) {
                case 'A', 'B', 'C':
                this.sezioneFrequentata = sezioneFrequentata;
                continua = false;
                break;
                default:
                System.out.println("Seziona non valida!! (valide: 'A', 'B', 'C')");
                System.out.print("Inserisci sezione: ");
                sezioneFrequentata = inputTesti.nextLine().toUpperCase().charAt(0);
            }

        } while(continua);

    }

    public char getSezioneFrequentata() {
        return sezioneFrequentata;
    }
    // Fine Incapsulamento

    public void generaMatricola() {
       
       String ultimeDue = Integer.toString(getAnnodiNascita()).substring(2);
       numero++;
       if(numero > 999) {
        numero = 1;
       }
       matricola = "" + ultimeDue + String.format("%03d", numero) + getSezioneFrequentata();
    }

    public String getMatricola() {
        return matricola;
    }

    public void rilascioCertificato(int annoR) {
        boolean continua = true;

        do {

            if(annoR >= 2023 && annoR <= 2024) {
                messaggioCertificato = "L'anno di rilascio del certificato è: " + annoR;
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

            if(medicoC.length() > 3) {
                messaggioMedico = "Il cognome del medico è: " + medicoC;
                continua = false; 
            } else {
                System.out.println("Cognome troppo corto!!");
                System.out.print("Inserisci cognome Medico: ");
                medicoC = inputTesti.nextLine();
            }

        } while(continua);

    }

    public void display() {
        System.out.println();
        System.out.println("Nome dello Studente: " + getNome());
        System.out.println("Cognome dello Studente: " + getCognome());
        System.out.println("Anno di nascita dello Studente: " + getAnnodiNascita());
        System.out.println("Classe frequentata dallo studente: " + getClasse());
        System.out.println("Sezione frequentata dallo studente: " + getSezioneFrequentata());
        System.out.println("Numero di Matricola dello Studente: " + getMatricola());
        System.out.println(messaggioCertificato);
        System.out.println(messaggioMedico);
        System.out.println();
    }

}