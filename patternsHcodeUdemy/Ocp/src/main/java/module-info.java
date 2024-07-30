module br.com.hcode.solid.ocp.ocp {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.com.hcode.solid.ocp.ocp to javafx.fxml;
    exports br.com.hcode.solid.ocp.ocp;
}