package visitor.example;

public interface Element {
    public abstract void accept(Visitor visitor);
}
