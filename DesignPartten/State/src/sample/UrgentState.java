package sample;

public class UrgentState implements State {
    public static UrgentState singleton = new UrgentState();


    private UrgentState() {
    }

    @Override
    public void doClock(Context context, int hour) {
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("Emergency: use the safe in an emergency");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("Emergency: use the alarm in an emergency");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("Emergency: use the phone in an emergency");
    }

    public static UrgentState getInstance() {
        return singleton;
    }
}
