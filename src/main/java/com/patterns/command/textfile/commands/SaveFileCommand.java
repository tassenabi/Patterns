package com.patterns.command.textfile.commands;

import com.patterns.command.textfile.reciever.TextFile;

public class SaveFileCommand implements Command {

    private TextFile textFile;

    public SaveFileCommand(TextFile textFile){
        this.textFile = textFile;
    }

    @Override
    public void execute() {
        textFile.save();
    }
}
