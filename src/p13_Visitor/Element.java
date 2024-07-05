package p13_Visitor;

public interface Element {
    public abstract void accept(Visitor v);
}
