package com.patterns.factory.guicomponents.app;

import com.patterns.factory.guicomponents.buttons.Button;
import com.patterns.factory.guicomponents.checkboxes.Checkbox;
import com.patterns.factory.guicomponents.factories.GUIFactory;
import com.patterns.factory.guicomponents.factories.MacOSFactory;
import com.patterns.factory.guicomponents.factories.WindowsFactory;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

    public static Application configureApplication() {

        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }
}
