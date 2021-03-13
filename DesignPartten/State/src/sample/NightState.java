package sample;

public class NightState implements State {
    private static NightState singleton = new NightState();



    private NightState() {
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour >= 9 && hour < 17)
            context.changeState(DayState.getInstance());
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("Emergency: use the vault at night");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("click alarm(night)");
        context.changeState(UrgentState.getInstance());
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("Call recording in the evening");
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public String toString() {
        return "[night]";
    }
}
