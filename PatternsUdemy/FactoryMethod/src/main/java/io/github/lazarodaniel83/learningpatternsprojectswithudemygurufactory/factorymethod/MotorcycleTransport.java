package io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.factorymethod;

import io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.factorymethod.vehicles.IVehicle;
import io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.factorymethod.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
