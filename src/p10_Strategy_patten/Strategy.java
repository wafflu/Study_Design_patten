package p10_Strategy_patten;

public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
