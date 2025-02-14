
package io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.abastractfactory.abstractfactory.factories;

import io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.abastractfactory.abstractfactory.buttons.Button;
import io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.abastractfactory.abstractfactory.buttons.MacOSButton;
import io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.abastractfactory.abstractfactory.checkboxes.Checkbox;
import io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.abastractfactory.abstractfactory.checkboxes.MacOSCheckbox;


public class MacOSFactory implements GuiFactory{

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
    
}
