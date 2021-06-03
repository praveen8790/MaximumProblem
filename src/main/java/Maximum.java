public class Maximum<T extends Comparable<T>> {
    public T a;
    public T b;
    public T c;

    public Maximum(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public <T extends Comparable<T>> T testMaximum(){

        if(b.compareTo(a)>0 && b.compareTo(c)>0)
          return (T) b;
        else if(c.compareTo(a)>0 && c.compareTo(b)>0)
            return (T) c;
        else
            return (T) a;
    }

}
