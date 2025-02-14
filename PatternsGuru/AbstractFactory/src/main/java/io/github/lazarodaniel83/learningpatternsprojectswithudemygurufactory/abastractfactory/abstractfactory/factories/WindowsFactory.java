
package io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.abastractfactory.abstractfactory.factories;

import io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.abastractfactory.abstractfactory.buttons.Button;
import io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.abastractfactory.abstractfactory.buttons.WindowsButton;
import io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.abastractfactory.abstractfactory.checkboxes.Checkbox;
import io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.abastractfactory.abstractfactory.checkboxes.WindowsCheckbox;


public class WindowsFactory implements GuiFactory{

    @Override
    public Button createButton() {
       return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
    
}
