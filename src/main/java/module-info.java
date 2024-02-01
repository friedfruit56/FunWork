module com.weiliang.funworkfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.weiliang.funworkfx to javafx.fxml;
    exports com.weiliang.funworkfx;
}