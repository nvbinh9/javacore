import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;

public class Cat implements Animal {
    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

    @Override
    public boolean isParallel() {
        return false;
    }

    @Override
    public BaseStream sequential() {
        return null;
    }

    @Override
    public BaseStream parallel() {
        return null;
    }

    @Override
    public BaseStream unordered() {
        return null;
    }

    @Override
    public BaseStream onClose(Runnable closeHandler) {
        return null;
    }

    @Override
    public void close() {

    }
}
