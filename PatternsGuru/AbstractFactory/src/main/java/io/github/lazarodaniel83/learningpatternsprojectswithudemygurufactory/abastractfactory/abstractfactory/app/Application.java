
package io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.abastractfactory.abstractfactory.app;

import io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.abastractfactory.abstractfactory.buttons.Button;
import io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.abastractfactory.abstractfactory.checkboxes.Checkbox;
import io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.abastractfactory.abstractfactory.factories.GuiFactory;


public class Application {
    private Button button;
    private Checkbox checkbox;
    
    public Application(GuiFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }
    
    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
