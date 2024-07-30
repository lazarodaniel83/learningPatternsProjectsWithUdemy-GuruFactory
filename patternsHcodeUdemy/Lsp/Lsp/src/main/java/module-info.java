module br.com.hcode.solid.lsp {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.com.hcode.solid.lsp to javafx.fxml;
    exports br.com.hcode.solid.lsp;
}