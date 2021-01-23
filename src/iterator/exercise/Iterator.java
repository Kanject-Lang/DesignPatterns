package iterator.exercise;

public interface Iterator {
    /** 判断是否存在下一个元素 */
    public abstract boolean hasNext();

    /** 返回集合中的下一个元素 */
    public abstract Object next();
}
