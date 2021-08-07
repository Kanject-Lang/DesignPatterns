package state.exercise2;

public class LunchState implements State {
    private static LunchState singleton = new LunchState();
    private LunchState() {

    }
    public static State getInstance() {
        return singleton;
    }
    @Override
    public void doClock(Context context, int hour) {
        if ((hour >= 9  && hour < 12) || (hour >= 13 && hour < 17)) {
            context.changeState(DayState.getInstance());
        } else if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("紧急：中午使用金库");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("紧急：中午使用金库");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("紧急通话（中午）");
    }
    public String toString() {
        return "[中午]";
    }
}
