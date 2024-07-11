package p16_Mediator;

public interface Colleague {
    //중재자 기억
    public abstract void setMediator(Mediator mediator);
    //중재자의 지시
    public abstract void setColleagueEnabled(boolean enabled);
}
