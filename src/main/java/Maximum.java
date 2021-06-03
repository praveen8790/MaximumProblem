public class Maximum<T extends Comparable<T>> {
    T a;
    T b;
    T c;

    public Maximum(T a,T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public T max(){
       return Maximum.testMaximum(a,b,c);
    }
    public static <T extends Comparable<T>> T testMaximum(T a, T b, T c){

        if(b.compareTo(a)>0 && b.compareTo(c)>0)
          return (T) b;
        else if(c.compareTo(a)>0 && c.compareTo(b)>0)
            return (T) c;
        else
            return (T) a;
    }

}
