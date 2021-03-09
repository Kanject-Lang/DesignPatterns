package bridge.exercise3;

public class StepDisplayImpl extends DisplayImpl {
    private String leftStr;
    private String str;
    private String rightStr;

    private int width;

    public StepDisplayImpl(String leftStr, String str, String rightStr) {
        this.leftStr = leftStr;
        this.str = str;
        this.rightStr = rightStr;
    }
    @Override
    public void rawOpen() {
        System.out.print(leftStr);
    }

    @Override
    public void rawPrint() {
        System.out.print(str);
    }

    @Override
    public void rawClose() {
        System.out.println(rightStr);
    }

}
