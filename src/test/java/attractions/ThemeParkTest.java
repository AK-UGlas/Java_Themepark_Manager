package attractions;

import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark tp;
    Visitor visitor;
    ArrayList<IReviewed> themeParkItems;

    @Before
    public void before() {
        themeParkItems = new ArrayList<>();
        themeParkItems.add(new TobaccoStall("The Blackened Lung", "Evil Al", ParkingSpot.A1));
        themeParkItems.add(new IceCreamStall("Cold & Creamy", "Some creepy dude", ParkingSpot.A4));
        themeParkItems.add(new CandyflossStall("Pink n' Fuzzy", "Another creepy dude", ParkingSpot.B1));
        themeParkItems.add(new Dodgems("Whiplash", 4));
        themeParkItems.add(new Playground("Fun Zone", 7));
        themeParkItems.add(new RollerCoaster("Blue Ridge", 10));
        themeParkItems.add(new Park("Leafy Meadows", 9));

        tp = new ThemePark(themeParkItems);
        visitor = new Visitor(16, 150, 25);
    }

    @Test
    public void canGetAllReviewedAttraction() {
        assertEquals(themeParkItems, tp.getAllReviewed());
    }
}
