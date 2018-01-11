import java.util.ArrayList;

public class Banana {
    private int gelb;
    
    public Banana() {
        this.gelb = 5;
    }
    
   // @override
    public String toString() {
        return "Diese Banane ist genau " + gelb + " gelb.";
    }
    public static void main(String[] args) {
        ArrayList <Banana> al = new ArrayList<Banana>();
        al.add(new Banana());
        al.add(new Banana());
        for (Banana el : al.toArray(new Banana[1])) {
            System.out.println(el);
        }   
    }
}
