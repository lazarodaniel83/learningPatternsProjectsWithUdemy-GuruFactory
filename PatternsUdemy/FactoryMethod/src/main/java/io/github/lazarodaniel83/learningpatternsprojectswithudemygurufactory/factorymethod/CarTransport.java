package io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.factorymethod;

import io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.factorymethod.vehicles.Car;
import io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.factorymethod.vehicles.IVehicle;

public class CarTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }

}
