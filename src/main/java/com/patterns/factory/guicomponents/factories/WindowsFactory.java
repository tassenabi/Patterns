package com.patterns.factory.guicomponents.factories;

import com.patterns.factory.guicomponents.buttons.Button;
import com.patterns.factory.guicomponents.buttons.WindowsButton;
import com.patterns.factory.guicomponents.checkboxes.Checkbox;
import com.patterns.factory.guicomponents.checkboxes.WindowsCheckbox;

import javax.xml.parsers.DocumentBuilderFactory;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
