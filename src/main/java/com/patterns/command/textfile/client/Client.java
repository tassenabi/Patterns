package com.patterns.command.textfile.client;

import com.patterns.command.textfile.commands.Command;
import com.patterns.command.textfile.commands.OpenFileCommand;
import com.patterns.command.textfile.commands.SaveFileCommand;
import com.patterns.command.textfile.invoker.TextFileOperationExecutor;
import com.patterns.command.textfile.reciever.TextFile;

public class Client {

    public static void main(String[] args) {
        TextFile textFile = new TextFile("myFile");

        Command openFileCommand = new OpenFileCommand(textFile);
        TextFileOperationExecutor openExecutor = new TextFileOperationExecutor(openFileCommand);
        openExecutor.executeTextFileOperation();

        Command saveFileCommand = new SaveFileCommand(textFile);
        TextFileOperationExecutor saveExecutor = new TextFileOperationExecutor(saveFileCommand);
        saveExecutor.executeTextFileOperation();

    }
}
