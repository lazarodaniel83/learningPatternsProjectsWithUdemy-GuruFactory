module br.com.hcode.solid.dip {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.com.hcode.solid.dip to javafx.fxml;
    exports br.com.hcode.solid.dip;
}