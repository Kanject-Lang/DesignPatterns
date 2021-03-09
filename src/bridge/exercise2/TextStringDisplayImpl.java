package bridge.exercise2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TextStringDisplayImpl extends DisplayImpl {
    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        try {
            InputStream is = new FileInputStream("src\\bridge\\text");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(is));
            String str = null;
            while (true) {
                str = reader.readLine();
                if(str!=null)
                    System.out.println("|" + str + "|");
                else
                    break;
            }
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.println("-------------------");
    }
}
