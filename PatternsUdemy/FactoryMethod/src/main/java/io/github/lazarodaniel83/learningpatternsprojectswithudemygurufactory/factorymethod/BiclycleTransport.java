package io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.factorymethod;

import io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.factorymethod.vehicles.Biclycle;
import io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.factorymethod.vehicles.IVehicle;

public class BiclycleTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Biclycle();
    }
}
