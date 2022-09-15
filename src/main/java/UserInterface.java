import java.util.Scanner;

public class UserInterface {
    private Database database = new Database();
    private int brugerValg = 0;
    private int numberOfSuperheroes = 0;
    Scanner sc = new Scanner(System.in);
    public void startProgram() {
         System.out.println("""
            VELKOMMEN TIL SUPERHERO-UNIVERSET!
            1. Opret superhelt
            2. Se alle superhelte
            9. Afslut programmet
                                            
                """);
            brugerValg = sc.nextInt();
            sc.nextLine();
            if(brugerValg == 1){
                boolean isHuman;

                System.out.println("Indtast superheltenavn: ");
                String superheroName = sc.nextLine();
                System.out.println("Indtast rigtige navn: ");
                String realName = sc.nextLine();
                System.out.println("Indtast år skabt: ");
                int yearCreated = sc.nextInt();
                sc.nextLine();
                System.out.println("Indtast superkrafter: ");
                String superPowers = sc.nextLine();
                System.out.println("Er et menneske? j/n: ");
                String isHumanQ = sc.nextLine();
                if (isHumanQ.equalsIgnoreCase("j")) {
                    isHuman = true;
                } else {
                    isHuman = false;
                }
                System.out.println("Indtast styrke (tal med to decimaler): ");
                double strength = sc.nextDouble();
                database.addSuperhero(superheroName, realName, yearCreated, superPowers, isHuman, strength);
                numberOfSuperheroes++;
            } else if (brugerValg == 2) {
                System.out.println(database.getArrayList(numberOfSuperheroes));
            } else if (brugerValg == 9) {
                System.exit(1);

            }
        }
    }
