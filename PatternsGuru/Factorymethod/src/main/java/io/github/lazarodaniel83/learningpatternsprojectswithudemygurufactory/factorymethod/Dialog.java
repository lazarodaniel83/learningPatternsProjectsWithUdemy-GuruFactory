package io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.factorymethod;

import io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.factorymethod.button.Button;

public  abstract class Dialog {
    public void renderWindow(){
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
