package net.media.training.live.lsp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 11, 2011
 * Time: 12:56:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class PersistentObject<T> {
    private T data;

    public PersistentObject(T data) {
        //if (!(data instanceof String))
        //    throw new IllegalArgumentException("Element type should be string, but you passed : " + data.toString());
        this.data = (T) data; // Parent class can take any type of data. so this functionality should be retained in child classes
    }

    public Object getData() {
        return this.data;
    }

    @Override
    public int hashCode() {
        return data != null ? data.hashCode() : 0;
    }

    public boolean equals(Object other) {
        return this.data.equals(other);
    }

    public void serialize() {

    }

    public void deSerialize() {

    }
}
