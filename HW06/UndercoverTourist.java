import java.util.ArrayList;
/**
 * Create UndercoverTourist class.
 * @author Phillip Kim
 * @version 1.0
 */
public class UndercoverTourist {
    /**
     * Method that takes in 3 parameter and returns an int.
     * @param catalog A list of possible activities.
     * @param budget The budget of the trip.
     * @param activities The number of activities possible.
     * @return An int representing the number of activities possible.
     */
    public static int calculateNumActivities(ArrayList<TravelActivity> catalog,
        double budget, int activities) {
        int idx = searchCatalog(catalog);
        if (catalog.size() == 0 || (catalog.get(idx)).getPrice() > budget) {
            return activities;
        } else {
            double newBudget = budget - (catalog.get(idx)).getPrice();
            catalog.remove(idx);
            return calculateNumActivities(catalog, newBudget, activities) + 1;
        }
    }

    /**
     * Helper method that takes in 1 parameter and returns an int.
     * @param catalog A list of possible activities.
     * @return An int representing the index of the cheapest activity.
     */
    public static int searchCatalog(ArrayList<TravelActivity> catalog) {
        int index = 0;
        double currentPrice = 0;
        if (catalog.size() != 0) {
            currentPrice = (catalog.get(index)).getPrice();
        }
        for (int i = 0; i < catalog.size(); i++) {
            TravelActivity activity = catalog.get(i);
            if (activity.getPrice() < currentPrice) {
                index = i;
                currentPrice = activity.getPrice();
            }
        }
        return index;
    }
}