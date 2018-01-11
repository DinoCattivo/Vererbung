/*
 * Testklasse für die BananaList.
 */
public class Banana {
    private String name;
    private int gelb;

    //Konstruktoren
    public Banana() {
        this.name = "";
        this.gelb = (int) (Math.random() * 100);
    }

    public Banana(String name) {
        this.name = name;
        this.gelb = 5;
    }

    public Banana(int gelb) {
        this.name = "Banane aus dem anderen Konstruktor";
        this.gelb = gelb;
    }

    public String toString() {
        return "Diese Banane mit Namen \"" + name + "\" ist genau " + gelb + " gelb.";
    }

    public static void main(String[] args) {
        BananaList <Banana> liste = new BananaList<Banana>();

        Banana erste = new Banana("Erste Banane");
        liste.add(new Banana());
        liste.add(erste);
        for (Object el :  liste.toArray()) {
            System.out.println(el);
        }
        if (liste.contains(erste)) {
            System.out.println("Die erste Banane ist in der Liste und steht an der " + (liste.indexOf(erste)+1) + " Stelle.");
        }
        else {
            System.out.println("Die erste Banane ist nicht in der Liste.");
        }
        liste.remove(erste);
        if (liste.contains(erste)) {
            System.out.println("Die erste Banane ist in der Liste und steht an der " + (liste.indexOf(erste)+1) + " Stelle.");
        }
        else {
            System.out.println("Die erste Banane ist nicht in der Liste.");
        }
        System.out.println("Das erste Element der Liste: \n" + liste.get(1));
        System.out.println("Die Liste ist jetzt " + liste.size() + " lang.");
        if (liste.isEmpty()) {
            System.out.println("Komischerweise ist sie trotzdem leer.");
        }
        else {
            System.out.println("Also ist die Liste leer.");
        }
        // Banana[] testArray = liste.toArray();
        // Banana[] testArray2 = liste.toArray(new Banana[5]);
        for (int i = 0; i < 200; i++) {
            liste.add(new Banana(i));
        }
    }
}