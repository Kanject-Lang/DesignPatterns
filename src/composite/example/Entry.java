package composite.example;

public abstract class Entry {
    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) {
        throw new FileTreatmentException();
    }

    protected abstract void printList(String prefix);

    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
