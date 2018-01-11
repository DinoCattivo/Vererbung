import java.util.ArrayList;
/*
 * Testklasse für die BananaList.
 */
public class Banana {
    private String name;
    private int gelb;
    
    //Konstruktoren
    public Banana() {
        this.name = "";
        this.gelb = 5;
    }
    
    public Banana(String name) {
        this.name = name;
        this.gelb = 5;
    }
    
    public String toString() {
        return "Diese Banane mit Namen \"" + name + "\" ist genau " + gelb + " gelb.";
    }
    
    public static void main(String[] args) {
        BananaList <Banana> liste = new BananaList<Banana>();
        
        Banana erste = new Banana("Erste Banane");
        liste.add(new Banana());
        liste.add(erste);
        for (Banana el : liste.toArray()) {
            System.out.println(el);
        }   
        
        if (liste.contains(erste)) {
            System.out.println("Die erste Banane ist in der Liste und steht an der " + (liste.indexOf(erste)+1) + " Stelle.");
        } 
        else {
            System.out.println("Die erste Banane ist nicht in der Liste.")
        }
        
        liste.remove(erste);
        
        if (liste.contains(erste)) {
            System.out.println("Die erste Banane ist in der Liste und steht an der " + (liste.indexOf(erste)+1) + " Stelle.");
        } 
        else {
            System.out.println("Die erste Banane ist nicht in der Liste.")
        }
        
        System.out.println("Das erste Element der Liste: \n" + liste.get(0));
        System.out.println("Die Liste ist jetzt " + liste.size() + " lang.");
        
        if (liste.isEmpty()) {
            System.out.println("Komischerweise ist sie trotzdem leer.");
        }
        else {
            System.out.println("Also ist die Liste nicht leer.")
        }
        
        liste.clear();
        
        if (liste.isEmpty()) {
            System.out.println("Jetzt wurde die gesamte Liste gelöscht. Sie ist leer.");
        }
        else {
            System.out.println("Leider ist die Liste noch nicht leer.")
        }
    }
}
