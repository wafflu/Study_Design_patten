package p19_State_patten;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements ActionListener, Context {
    private TextField textClock = new TextField(60);
    private TextArea textScreen = new TextArea(10, 60);
    private Button buttonUse = new Button("금고 사용");
    private Button buttonAlarm = new Button("비상벨");
    private Button buttonPhone = new Button("일반 통화");
    private Button buttonExit = new Button("종료");

    private State state = DayState.getInstance(); // 현재상태

    public SafeFrame(String title){
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);
        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);
        Panel panel = new Panel();
        panel.add(buttonAlarm);
        panel.add(buttonUse);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        add(panel, BorderLayout.SOUTH);
        pack();
        setVisible(true);
        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        if(e.getSource() == buttonUse){
            state.doUse(this);
        } else if(e.getSource() == buttonAlarm){
            state.doAlarm(this);
        } else if(e.getSource() == buttonPhone){
            state.doPhone(this);
        } else if(e.getSource() == buttonExit){
            System.exit(0);
        } else {
            System.out.println("?");
        }
    }

    @Override
    public void setClock(int hour) {
        String clockstr = String.format("현재시간은 %02d:00", hour);
        System.out.println(clockstr);
        textClock.setText(clockstr);
        state.doClock(this, hour);
    }

    @Override
    public void changeState(State state) {
        System.out.println(this.state + "에서"+state+"으로 상태 변화");
        this.state = state;
    }

    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("call! "+msg+"\n");
    }

    @Override
    public void recordLog(String msg) {
    textScreen.append("record... "+msg+"\n");
    }
}
