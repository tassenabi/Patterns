package com.patterns.factory.guicomponents.factories;

import com.patterns.factory.guicomponents.buttons.Button;
import com.patterns.factory.guicomponents.buttons.MacOSButton;
import com.patterns.factory.guicomponents.checkboxes.Checkbox;
import com.patterns.factory.guicomponents.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
