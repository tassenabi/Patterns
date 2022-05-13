package com.patterns.factory.guicomponents.factories;

import com.patterns.factory.guicomponents.buttons.Button;
import com.patterns.factory.guicomponents.checkboxes.Checkbox;

public interface GUIFactory {

    Button createButton();
    Checkbox createCheckbox();
}
