package attractions;

import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> parkItems;

    public ThemePark(ArrayList<IReviewed> parkItems) {
        this.parkItems = parkItems;
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return parkItems;
    }

    public void visit(Visitor visitor, Attraction attraction) {
        attraction.incrementVisitCount();
        visitor.addToVisited(attraction);
    }
}
