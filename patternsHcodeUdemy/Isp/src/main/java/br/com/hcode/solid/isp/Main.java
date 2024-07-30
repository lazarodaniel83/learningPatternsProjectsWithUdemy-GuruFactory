package br.com.hcode.solid.isp;


import br.com.hcode.solid.isp.vehicles.Car;
import br.com.hcode.solid.isp.vehicles.MotorCycle;

public class Main {

    private static String type;

    public static void main(String[] args) {

        type = "Car";
        if(type == "Car"){
            Car car = new Car("AZUL","2022",2.6,4);
        }else{
            MotorCycle  motorcicle = new MotorCycle("branca","2022",250);
        }

    }
}