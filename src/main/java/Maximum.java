import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

    public static <T extends Comparable<T>> T testMaximum(T ... args){
        /*return Arrays.stream(args).max(Comparator.naturalOrder()).get();*/
        return Arrays.stream(args).sorted().toList().get(args.length - 1);
    }



}
