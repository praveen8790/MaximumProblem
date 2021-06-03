public class Maximum {
    public Integer findMaximum(Integer a, Integer b, Integer c){
        if(b.compareTo(a)>0 && b.compareTo(c)>0)
          return b;
        else if(c.compareTo(a)>0 && c.compareTo(b)>0)
            return c;
        else
            return a;
    }
    public Float findMaximum(Float a, Float b, Float c){
        if(b.compareTo(a)>0 && b.compareTo(c)>0)
            return b;
        else if(c.compareTo(a)>0 && c.compareTo(b)>0)
            return c;
        else
            return a;
    }
    public String findMaximum(String a, String b, String c){
        if(b.compareTo(a)>0 && b.compareTo(c)>0)
            return b;
        else if(c.compareTo(a)>0 && c.compareTo(b)>0)
            return c;
        else
            return a;
    }

}
