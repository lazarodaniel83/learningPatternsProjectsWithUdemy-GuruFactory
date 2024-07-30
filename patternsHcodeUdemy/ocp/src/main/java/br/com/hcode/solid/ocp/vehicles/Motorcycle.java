package br.com.hcode.solid.ocp.vehicles;

public class Motorcycle  extends Vehicle{
    public Motorcycle(String color, String year, double engine){
        this.color = color;
        this.year = year;
        this.engine = engine;
        configureMotorCycle();
    }

    public void configureMotorCycle(){
        System.out.println("Criando uma moto: "+ year + " " + engine+ " Cilindradas");
        startVehicle();
    }

}
