import java.util.ArrayList;

public class Database {

    private ArrayList<Superhero> database = new ArrayList<>();

    public void addSuperhero(String superheroName, String realName, int yearCreated, String superPowers, boolean isHuman, double strength){
        Superhero superhero = new Superhero(superheroName, realName, yearCreated, superPowers, isHuman, strength);
        database.add(superhero);
    }

    public String showAllSuperheroes(int x){
        for (int i = 0; i < x; i++){
            System.out.println("Nr. " + (i + 1) + ":");
            System.out.println(database.get(i));
        }
        return " ";
    }

    public String searchSuperhero(String searchQuery){
        boolean isPresent = false;
        for(Superhero hero: database){
            if(hero.getSuperheroName().contains(searchQuery)){
                System.out.println(hero);
                isPresent = true;
            }
        }
        if (!isPresent){
            System.out.println("Der findes ikke en superhelt i databasen med det navn.");
        }
        return " ";
    }
    //TODO
    public void editSuperhero(int x){
       Superhero hero = database.get(x - 1);


    }
    //TODO
    public void deleteSuperhero(){

    }

    //methods for test purposes
    public ArrayList<Superhero> getSuperheroes(){
        return database;
    }

    public int getSize(){
        return database.size();
    }
}
