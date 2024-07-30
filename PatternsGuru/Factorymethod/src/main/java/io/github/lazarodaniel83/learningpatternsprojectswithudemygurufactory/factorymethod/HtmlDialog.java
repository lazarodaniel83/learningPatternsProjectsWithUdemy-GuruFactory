package io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.factorymethod;

import io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.factorymethod.button.Button;
import io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.factorymethod.button.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
