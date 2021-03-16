package composite.exercise2;

public abstract class Entry {
    public abstract String getName();

    public abstract String getFullName();

    public abstract void setFullName(String fullname);

    public abstract int getSize();

    public Entry add(Entry entry) {
        throw new FileTreatmentException();
    }

    protected abstract void printList(String prefix);

    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
