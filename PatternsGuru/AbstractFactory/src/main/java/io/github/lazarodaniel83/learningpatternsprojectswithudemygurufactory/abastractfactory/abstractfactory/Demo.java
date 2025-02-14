
package io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.abastractfactory.abstractfactory;

import io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.abastractfactory.abstractfactory.app.Application;
import io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.abastractfactory.abstractfactory.factories.GuiFactory;
import io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.abastractfactory.abstractfactory.factories.MacOSFactory;
import io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.abastractfactory.abstractfactory.factories.WindowsFactory;


public class Demo {

    private static Application configureApplication(){
        Application app;
        GuiFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac")){
            factory = new MacOSFactory();
        }else{
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }
    
    public static void main(String[] args){
        Application app = configureApplication();
        app.paint();
    }
}
