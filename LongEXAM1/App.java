import Locations.*;
import Tourists.*;


public class App {
    public static void main(String[] args) throws Exception {

        Locations Bohol = new Bohol();
        Locations Boracay = new Boracay();
        Locations Cebu = new Cebu();
        Locations Palawan = new Palawan();
        Locations Siargao = new Siargao();
        Locations Vigan = new Vigan();

        Tourist Me = new Me();

        Boracay.accept(Me);
        Bohol.accept(Me);
        Cebu.accept(Me);
        Palawan.accept(Me);
        Siargao.accept(Me);
        Vigan.accept(Me);



    }
}