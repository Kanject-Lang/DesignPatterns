package decorator.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MultiStringDisplay_answer extends Display{
    private List<String> body = new ArrayList<>();
    private int columns = 0;

    public void add(String msg) {
        body.add(msg);
        updateColumn(msg);
    }
    @Override
    public int getColumns() {
        return columns;
    }

    @Override
    public int getRows() {
        return body.size();
    }

    @Override
    public String getRowText(int row) {
        return body.get(row);
    }

    private void updateColumn(String msg) {
        if (msg.getBytes().length > columns) {
            columns = msg.getBytes().length;
        }
        for (int row = 0; row < body.size(); row++) {
            int fills = columns - body.get(row).getBytes().length;
            if (fills > 0) {
                body.set(row, body.get(row) + spaces(fills));
            }
        }
    }

    private String spaces(int count) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(' ');
        }
        return buf.toString();
    }
}
