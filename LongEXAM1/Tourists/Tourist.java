package Tourists;

import Locations.Boracay;
import Locations.Locations;
import Locations.Bohol;
import Locations.Cebu;
import Locations.Palawan;
import Locations.Siargao;
import Locations.Vigan;

public interface Tourist {

    int budget = 1000;

    void visit();

    void visit(Boracay boracay);

    void visit(Bohol bohol);
    
    void visit(Cebu cebu);

    void visit(Palawan palawan);

    void visit(Siargao siargao);

    void visit(Vigan vigan);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}