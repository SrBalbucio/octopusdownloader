module octopusdownloader.main {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.swing;
    requires javafx.base;
    requires javafx.media;
    requires javafx.web;
    requires java.desktop;
    requires javafx.fxml;
    opens org.octopus to javafx.graphics,javafx.fxml;
    opens org.octopus.alerts to javafx.graphics,javafx.fxml;
    opens org.octopus.settings to javafx.graphics,javafx.fxml;
    opens org.octopus.dialogs.setting to javafx.graphics,javafx.fxml;
    opens org.octopus.dialogs.newdownload to javafx.graphics,javafx.fxml;
    opens org.octopus.core to javafx.graphics,javafx.fxml;
    opens org.octopus.downloads to javafx.graphics,javafx.fxml;
    opens org.octopus.controller to javafx.graphics,javafx.fxml;
    opens org.octopus.exceptions to javafx.graphics,javafx.fxml;
}