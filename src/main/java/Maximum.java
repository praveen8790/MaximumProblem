public class Maximum<T extends Comparable<T>> {
    public <T extends Comparable<T>> T findMaximum(T a, T b, T c){
        if(b.compareTo(a)>0 && b.compareTo(c)>0)
          return b;
        else if(c.compareTo(a)>0 && c.compareTo(b)>0)
            return c;
        else
            return a;
    }

}
