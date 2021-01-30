package adapter.exercise;

import java.io.*;
import java.util.Date;
import java.util.Properties;

/**
 * @description: TODO
 * @author: Kanject
 */
public class FileProperties extends Properties implements FileIO {

    private InputStream in;

    private OutputStream out;

    @Override
    public void readFromFile(String filename) throws IOException {
        in = new FileInputStream(new File(filename));
        load(in);
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        out = new FileOutputStream(new File(filename));
        store(out, "written by FileProperties");
        out.close();
        in.close();
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key);
    }
}
