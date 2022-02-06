import java.util.ArrayList;

public class TouristTest {
    public static void main(String[] args) {
        TravelActivity ta1 = new TravelActivity("asdf", 20);
        TravelActivity ta2 = new TravelActivity("zxcv", 30);
        ArrayList<TravelActivity> catalog = new ArrayList<TravelActivity>();
        catalog.add(ta1);
        catalog.add(ta2);
        int numAct = calculateNumActivities(catalog, 30.0, 0);
        System.out.println(numAct);
    }
}