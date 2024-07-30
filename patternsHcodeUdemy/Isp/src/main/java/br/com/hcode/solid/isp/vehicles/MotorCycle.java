package br.com.hcode.solid.isp.vehicles;

public class MotorCycle implements IVehicles, IVehicleMotorcycle{

    private String color;
    private String year;
    private double engine;

    public MotorCycle(String color, String year, double engine){
        configureMotorcycle(color,year,engine);
    }

    @Override
    public void configureMotorcycle(String color, String year, double engine) {
        this.color = color;
        this.year = year;
        this.engine = engine;

        System.out.println("Criando um carro: " + engine + " " + color + " " + year + " ");
        startVehicle();
    }

    @Override
    public void startVehicle() {

    }
}
