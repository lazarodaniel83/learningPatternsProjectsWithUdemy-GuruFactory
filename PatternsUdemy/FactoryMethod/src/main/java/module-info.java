module io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.factorymathod {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.factorymethod to javafx.fxml;
    exports io.github.lazarodaniel83.learningpatternsprojectswithudemygurufactory.factorymethod;
}