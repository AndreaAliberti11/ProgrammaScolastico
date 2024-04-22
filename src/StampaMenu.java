import java.util.ArrayList;
import java.util.Scanner;

public class StampaMenu {

    private int scegli;

    public void stampe() {
        Scanner inputNumeri = new Scanner(System.in);
        Scanner inputTesti = new Scanner(System.in);
        boolean continua = true;
        ArrayList<Studente> listaStudenti = new ArrayList<>();
        ArrayList<Docente> listaDocenti = new ArrayList<>();
        ArrayList<Palestra> listaPalestra = new ArrayList<>();

        do {
            System.out.println("**********Menù**********");
            System.out.println("1. Aggiungi Studente");
            System.out.println("2. Aggiungi Docente");
            System.out.println("3. Aggiungi iscritti al club di pallavolo");
            System.out.println("4. Visualizza elenco studenti");
            System.out.println("5. Visualizza elenco docenti");
            System.out.println("6. Visualizza elenco di iscritti al club pallavolo");
            System.out.println("0. Per uscire dal programma");
            System.out.println();

            scegli = inputNumeri.nextInt();

            switch (scegli) {
                case 1:
                    Studente mioStudente = new Studente();
                    System.out.print("Nome dello studente: ");
                    mioStudente.setNome(inputTesti.nextLine());
                    System.out.print("Cognome dello studente: ");
                    mioStudente.setCognome(inputTesti.nextLine());
                    System.out.print("Anno di Nascita dello studente: ");
                    mioStudente.setAnnodiNascita(inputNumeri.nextInt());
                    if (mioStudente.getAnnodiNascita() != 0) {
                        System.out.print("Classe: ");
                        mioStudente.setClasse(inputNumeri.nextInt());
                        System.out.print("Sezione Frequentata: ");
                        mioStudente.setSezioneFrequentata(inputTesti.nextLine().toUpperCase().charAt(0));
                        mioStudente.generaMatricola();
                        System.out.println("Numero Matricola: " + mioStudente.getMatricola());
                        System.out.print("Anno di rilascio certificato: ");
                        mioStudente.rilascioCertificato(inputNumeri.nextInt());
                        System.out.print("Cognome Medico che ha rilasciato il certificato: ");
                        mioStudente.cognomeMedico(inputTesti.nextLine());
                        listaStudenti.add(mioStudente);
                        System.out.println();
                    } else {
                        System.out.println("Lo studente non può essere iscritto!");
                    }
                    break;
                case 2:
                    Docente mioDocente = new Docente();
                    System.out.print("Nome del Docente: ");
                    mioDocente.setNome(inputTesti.nextLine());
                    System.out.print("Cognome del Docente: ");
                    mioDocente.setCognome(inputTesti.nextLine());
                    System.out.print("Anno di nascita del Docente: ");
                    mioDocente.setAnnodiNascita(inputNumeri.nextInt());
                    if (mioDocente.getAnnodiNascita() != 0) {
                        System.out.print("Materia insegnata: ");
                        mioDocente.setMateria(inputTesti.nextLine());
                        listaDocenti.add(mioDocente);
                        System.out.println();
                    } else {
                        System.out.println("Il docente non può essere preso in carica!");
                    }
                    break;
                case 3:
                    Palestra miaPalestra = new Palestra();
                    System.out.print("Nome della persona iscritta al Club: ");
                    miaPalestra.setNome(inputTesti.nextLine());
                    System.out.print("Cognome della persona iscritta al Club: ");
                    miaPalestra.setCognome(inputTesti.nextLine());
                    System.out.print("Anno di rilascio del certificato medico: ");
                    miaPalestra.rilascioCertificato(inputNumeri.nextInt());
                    System.out.print("Cognome del Medico che ha rilasciato il certificato: ");
                    miaPalestra.cognomeMedico(inputTesti.nextLine());
                    listaPalestra.add(miaPalestra);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Elenco Studenti: ");
                    if (listaStudenti.size() == 0) {
                        System.out.println("Nessun studente iscritto!");
                    } else {
                        for (Studente listaUno : listaStudenti) {
                            listaUno.display();
                        }
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Elenco Docenti: ");
                    if (listaStudenti.size() == 0) {
                        System.out.println("Nessun Docente preso in carica!");
                    } else {
                        for (Docente listaUno : listaDocenti) {
                            listaUno.display();
                        }
                    }
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Elenco Iscritti Club Pallavolo: ");
                    if (listaStudenti.size() == 0) {
                        System.out.println("Nessun iscritto al Club!");
                    } else {
                        for (Palestra listaUno : listaPalestra) {
                            listaUno.display();
                        }
                    }
                    System.out.println();
                    break;
                case 0:
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida, riprovare!");
            }

        } while (continua);

        inputNumeri.close();
        inputTesti.close();
    }

}
