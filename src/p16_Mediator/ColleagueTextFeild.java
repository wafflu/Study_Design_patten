package p16_Mediator;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleagueTextFeild extends TextField implements TextListener, Colleague {
    private Mediator mediator;

    public ColleagueTextFeild(String text, int colnums){
        super(text, colnums);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
        setBackground(enabled ? Color.white : Color.lightGray);
    }
    //문자열이 바뀌면 알림
    @Override
    public void textValueChanged(TextEvent e) {
        mediator.colleagueChanged();
    }
}
