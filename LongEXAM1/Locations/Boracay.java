package Locations;

import Tourists.Tourist;

public class Boracay implements Locations {

    public int airFare = 200;

    
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}