
package io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.abastractfactory.abstractfactory.factories;

import io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.abastractfactory.abstractfactory.buttons.Button;
import io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.abastractfactory.abstractfactory.checkboxes.Checkbox;


public interface GuiFactory {

    Button createButton();
    Checkbox createCheckbox();
}
