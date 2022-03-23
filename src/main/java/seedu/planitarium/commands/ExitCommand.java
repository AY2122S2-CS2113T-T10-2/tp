package seedu.planitarium.commands;

import seedu.planitarium.person.PersonList;
import seedu.planitarium.storage.Storage;

import java.io.IOException;

/**
 * Executes exit command and exit the program.
 */
public class ExitCommand extends Command {

    public ExitCommand(String userInput, PersonList personList) {
        super(userInput, personList);
    }

    @Override
    public void execute() throws IOException {
        ui.exit();
        System.out.println(ui.HORI_LINE);
        Storage.saveData(personList);
        System.exit(0);
    }
}
