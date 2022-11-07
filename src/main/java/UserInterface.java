import java.util.Scanner;
import java.util.InputMismatchException;

public class UserInterface {
    private final Database database = new Database();
    private int numberOfSuperheroes = 0;
    Scanner sc = new Scanner(System.in);

    public void startProgram() {
        int userChoice = 0;
        do {
            System.out.println("""
                    VELKOMMEN TIL SUPERHERO-UNIVERSET!
                    1. Opret superhelt
                    2. Se alle superhelte
                    3. Find superhelt
                    4. Rediger superhelt
                    5. Slet superhelt
                    9. Afslut programmet
                        """);

            userChoice = sc.nextInt();
            sc.nextLine();

            if (userChoice == 1) {
                System.out.println("Indtast superheltenavn: ");
                String superheroName = sc.nextLine();
                System.out.println("Indtast rigtige navn: ");
                String realName = sc.nextLine();
                System.out.println("Indtast år skabt: ");
                int yearCreated = readInteger();
                sc.nextLine();
                System.out.println("Indtast superkrafter: ");
                String superPowers = sc.nextLine();
                System.out.println("Er et menneske? j/n: ");
                boolean isHuman = checkBoolean();
                System.out.println("Indtast styrke (tal med decimaler): ");
                double strength = readDouble();
                database.addSuperhero(superheroName, realName, yearCreated, superPowers, isHuman, strength);
                numberOfSuperheroes++;
            } else if (userChoice == 2) {
                System.out.println("Liste af superhelte:\n");
                System.out.println(database.showAllSuperheroes(numberOfSuperheroes));
            } else if (userChoice == 3) {
                System.out.println("Tast navnet. eller del af navnet, på den superhelt, du vil finde:");
                String searchQuery = sc.next();
                database.searchSuperhero(searchQuery);
            } else if (userChoice == 4) {
                if (numberOfSuperheroes == 0){
                    System.out.println("Der er ingen superhelte at redigere.\n");
                }else {
                    System.out.println("Liste af superhelte:\n");
                    System.out.println(database.showAllSuperheroes(numberOfSuperheroes));
                    System.out.println("\n Hvilken superhelt vil du ændre? Tast venligst nummer: ");
                    database.editSuperhero(sc.nextInt());
                    sc.nextLine();
                }
            } else if(userChoice == 5) {

            } else if (userChoice == 9) {
                System.exit(1);
            }
        }while(userChoice != 9);
    }

    public int readInteger(){
        while (!sc.hasNextInt()){
            String text = sc.next();
            System.out.println("Du må ikke indtaste '" + text + "' , tast venligst et nummer.");
        }
        return sc.nextInt();
    }

    public double readDouble(){
        while (!sc.hasNextDouble()){
            String text = sc.next();
            System.out.println("Du må ikke indtaste '" + text + "' , det skal være et tal, med eller uden decimaler.");
        }
        return sc.nextDouble();
    }

    public boolean checkBoolean(){
        boolean shouldContinue = true;
        boolean isHuman = true;
        String isHumanQ;
        do {
            isHumanQ = sc.nextLine();

            if (isHumanQ.equalsIgnoreCase("j")) {
                isHuman = true;
                shouldContinue = false;
            } else if (isHumanQ.equalsIgnoreCase("n")) {
                isHuman = false;
                shouldContinue = false;
            } else {
                System.out.println("Tast venligst 'j' eller 'n'.");
                shouldContinue = true;
            }
        }while (shouldContinue);
        return isHuman;
    }
}