package app;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        DataRepository repository = new DataRepository();
        DataHandler handler = new DataHandler();
        UIOperator uiOperator = new UIOperator();

        List<String> names = repository.getData();
        names.add("Ivan");
        names.add("Sonya");
        names.add("Viktoria");
        names.add("Bohdan");
        names.add("Maksym");

        uiOperator.getOutput(handler.formListOutput(names));
        uiOperator.getOutput(handler.formOutput(names, 2));
    }
}