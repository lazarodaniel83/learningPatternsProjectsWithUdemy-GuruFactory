
package builder;

import builder.builders.CarBuilder;
import builder.builders.CarManualBuilder;
import builder.cars.Car;
import builder.cars.Manual;


public class Demo {
    
    public static void main(String[] args){
        Director director = new Director();
        
        CarBuilder builder = new CarBuilder();
        director.constructCityCar(builder);
        
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());
        
        CarManualBuilder manualBuilder = new CarManualBuilder();
        
        director.constructCityCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
       
    }
}
