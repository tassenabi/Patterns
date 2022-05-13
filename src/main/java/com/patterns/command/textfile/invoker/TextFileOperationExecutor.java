package com.patterns.command.textfile.invoker;

import com.patterns.command.textfile.commands.Command;

public class TextFileOperationExecutor {
    Command command;

    public TextFileOperationExecutor(Command command){
        this.command = command;
    }

    public void executeTextFileOperation(){
        command.execute();
    }
}
