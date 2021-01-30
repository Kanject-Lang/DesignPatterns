package adapter.exercise;

import java.io.IOException;

/**
 * @description: TODO
 * @author: Kanject
 */
public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("other/file.txt");
            f.setValue("year", "2021");
            f.setValue("month", "1");
            f.setValue("day", "30");
            f.writeToFile("other/newFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
