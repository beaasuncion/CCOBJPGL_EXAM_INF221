package Tourists;


import Locations.*;

public class Me implements Tourist {

    static int budget = 1000;
    

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
        System.out.println("I have " + getBudget() + " in my wallet, i want to travel! ");

        if ( budget > boracay.airFare  ){
            System.out.println("I can go to Boracay!" );
            budget -= boracay.airFare;
            
        }else{
            System.out.println("No more gala :< ");
        }

      checkBudget();
        
    }

    public void visit(Bohol bohol) {

        if(budget >bohol.airFare){
            System.out.println("I can still go to Boracay!");
            budget -= bohol.airFare;
        }else{
            System.out.println("No more gala :<");
        }

        checkBudget();
    }
    public void visit(Cebu cebu) {
        if(budget >cebu.airFare){
            System.out.println("Let's go to Cebuuuu!");
            budget -= cebu.airFare;
        }else{
            System.out.println("No more gala :< ");
        }

        checkBudget();
    }

    public void visit(Palawan palawan) {
        if(budget >palawan.airFare){
            System.out.println("Here i go, PALAWAN!");
            budget -= palawan.airFare;
        }else{
            System.out.println("No more gala :<");
        }

        checkBudget();
    }

    public void visit(Siargao siargao) {
        if(budget >siargao.airFare){
            System.out.println("I still have money! wait for me Siargao!");
            budget -= siargao.airFare;
        }else{
            System.out.println("No more gala :<");
        }

        checkBudget();
    }

    public void visit(Vigan vigan) {
        if(budget >vigan.airFare){
            System.out.println("I really love VIGAN! ");
            budget -= vigan.airFare;
        }else{
            System.out.println("No more gala :<");
        }

        checkBudget();
    }

    public void checkBudget() {
        System.out.println("I only have " + budget + " in my wallet");
    }

    public static int getBudget() {
        return budget;
    }


} 
    

