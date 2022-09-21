import java.util.ArrayList;

public class Database {

    private ArrayList<Superhero> database = new ArrayList<>();

    public void addSuperhero(String superheroName, String realName, int yearCreated, String superPowers, boolean isHuman, double strength){
        Superhero superhero = new Superhero(superheroName, realName, yearCreated, superPowers, isHuman, strength);
        database.add(superhero);
    }

    public String getArrayList(int x){
        for (int i = 0; i < x; i++){
            System.out.println(database.get(i));
        }
        return " ";
    }

    public String searchSuperhero(String searchQuery){
        boolean isPresent = false;
        for(Superhero hero: database){
            if(hero.getSuperheroName().equals(searchQuery)){
                System.out.println(hero);
                isPresent = true;
            }
        }
     if (!isPresent){
         System.out.println("Der findes ikke en superhelt i databasen med det navn.");
     }
        return " ";
    }
}
