package sample;

public class NoonState implements State {
    private static NoonState singleton = new NoonState();
    private NoonState(){}

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        } else if (9 <= hour && hour < 12 || 13 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("Emergency: this lunch time");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("Emergency: this lunch time");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("Call recording in the noon");
    }
}
