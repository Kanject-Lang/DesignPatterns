package strategy.exercise4;

public class Main {
    public static void main(String[] args) {
        String[] data = {
                "Dumpty", "Bowman", "Carroll", "Elfland", "Alice",
        };
        SortAndPrint sap = new SortAndPrint(data, new SelectionSorter());
        sap.excute();
        SortAndPrint sap2 = new SortAndPrint(data, new SelectionDescSorter());
        sap2.excute();
    }
}
