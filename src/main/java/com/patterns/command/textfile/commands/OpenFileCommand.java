package com.patterns.command.textfile.commands;

import com.patterns.command.textfile.reciever.TextFile;

public class OpenFileCommand implements Command{

    private TextFile textFile;

    public OpenFileCommand(TextFile textFile){
        this.textFile = textFile;
    }

    @Override
    public void execute() {
        textFile.open();
    }
}
