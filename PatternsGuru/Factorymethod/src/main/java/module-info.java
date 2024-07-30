module io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.factorymethod {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.factorymethod to javafx.fxml;
    exports io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.factorymethod;
}