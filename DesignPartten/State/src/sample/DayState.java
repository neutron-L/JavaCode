package sample;

public class DayState implements State {
    private static DayState singleton = new DayState();



    private DayState() {
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || hour >= 17)
            context.changeState(NightState.getInstance());
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("use safe(day)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("click alarm(day)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("usual call(day)");
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public String toString() {
        return "[daytime]";
    }
}
