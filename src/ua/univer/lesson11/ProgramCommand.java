package ua.univer.lesson11;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

interface Command{
    void execute(String value);
}
class MyCommand{
    public static void create(String param){}
}
public class ProgramCommand {
    public static void main(String[] args) {

        Map<String, Command> availableCommands = new HashMap<>();
// Old style with anonymous class
        availableCommands.put("lower",new Command() {
            @Override
            public void execute(String value) {
                System.out.println(value.toLowerCase());
            }
        });
// New style with lambdas
        availableCommands.put("UPPER", value -> {
            System.out.println(value.toUpperCase());
        });

        availableCommands.put("Create", MyCommand::create);


        availableCommands.get("lower").execute("Helo");
    }
}
