public class Docente extends Persona {
    
    private int annoDiNascita;
    private String materia;

    public Docente(String nome, String cognome, int annoDiNascita, String materia) {
        super(nome, cognome, annoDiNascita);
        setMateria(materia);
    }

    public Docente() {}

    // Inizio Incapsulamento
    public void setAnnodiNascita(int annoDiNascita) {

            if(annoDiNascita >= 1964 && annoDiNascita <= 1994) {
                this.annoDiNascita = annoDiNascita;
            } else {
                System.out.println("Anno di nascita non valido!! (valido per i docenti anno dal 1964 al 1994)");
            }

    }

    public int getAnnodiNascita() {
        return annoDiNascita;
    }

    public void setMateria(String materia) {
        boolean continua = true;

        do {

            switch(materia) {
                case "italiano", "inglese", "matematica", "religione", "educazione fisica":
                this.materia = materia;
                continua = false;
                break;
                default:
                System.out.println("Materia non disponibile!! (Scegliere una tra 'italiano', 'inglese', 'matematica', 'religione', 'educazione fisica')");
                System.out.print("Inserisci materia: ");
                materia = inputTesti.nextLine();
            }

        } while(continua);

    }

    public String getMateria() {
        return materia;
    }
    // Fine Incapsulamento

    public void display() {
        System.out.println();
        System.out.println("Nome del Docente: " + getNome());
        System.out.println("Cognome del Docente: " + getCognome());
        System.out.println("Anno di nascita del Docente: " + getAnnodiNascita());
        System.out.println("Materia insegnata: " + getMateria());
        System.out.println();
    }

}