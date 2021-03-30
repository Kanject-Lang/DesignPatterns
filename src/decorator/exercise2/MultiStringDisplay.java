package decorator.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MultiStringDisplay extends Display{
    private List<String> stringList = new ArrayList<>();

    @Override
    public int getColumns() {
        List<Integer> strSizeList = stringList.stream().map(s -> s.getBytes().length).collect(Collectors.toList());
        strSizeList.sort((o1, o2) -> o2 - o1);
        return strSizeList.get(0);
    }

    @Override
    public int getRows() {
        return stringList.size();
    }

    @Override
    public String getRowText(int row) {
        return stringList.get(row);
    }

    public void add(String string) {
        stringList.add(string);
    }
}
