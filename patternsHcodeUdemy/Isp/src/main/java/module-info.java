module br.com.hcode.solid.isp {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.com.hcode.solid.isp to javafx.fxml;
    exports br.com.hcode.solid.isp;
}