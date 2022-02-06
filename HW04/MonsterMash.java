import java.util.ArrayList;

public class MonsterMash {
    public static void main(String[] args) {
        ArrayList<Monster> guests = new ArrayList<Monster>(5);
        Monster m1 = new Monster("A", 0);
        guests.add(m1);
        String a = new String("asdf, zxcv, asdf, zxcv, ");
        System.out.println(a.substring(0, a.length() - 2));
    }
}