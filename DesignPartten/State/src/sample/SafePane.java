package sample;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import sample.Context;
import sample.DayState;
import sample.State;

public class SafePane extends Pane implements Context {
    private TextField textClock = new TextField();
    private TextArea textScreen = new TextArea();
    private Button btnUse = new Button("use safe");
    private Button btnAlarm = new Button("alarm");
    private Button btnPhone = new Button("phone");
    private Button btnExit = new Button("exit");
    private Context context = this;


    private State state = DayState.getInstance();


    public SafePane(String title) {
        super();

        getChildren().add(textClock);
        textClock.setEditable(false);

        getChildren().add(textScreen);
        textScreen.setEditable(false);

        HBox pane1 = new HBox(5);
        pane1.getChildren().addAll(btnUse, btnAlarm, btnPhone, btnExit);

        btnUse.setOnAction(e->state.doUse(this));
        btnAlarm.setOnAction(e->state.doAlarm(this));
        btnPhone.setOnAction(e->state.doPhone(this));
        btnExit.setOnAction(e->System.exit(0));

        getChildren().add(pane1);
    }

    @Override
    public void setClock(int hour) {
        String clockstring = "now time is: ";
        if (hour < 10) {
            clockstring += "0" + hour + ":00";
        } else {
            clockstring += hour + ":00";
        }

        System.out.println(clockstring);
        textClock.setText(clockstring);
        state.doClock(this, hour);
    }

    @Override
    public void changeState(State state) {
        System.out.println("from " + this.state + " state to " + state + " state");
        this.state = state;
    }

    @Override
    public void callSecurityCenter(String msg) {
        textScreen.appendText("call:" + msg + "\n");
    }

    @Override
    public void recordLog(String msg) {
        textScreen.appendText("record..." + msg + "\n");
    }
}
