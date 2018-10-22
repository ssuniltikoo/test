package DemoGenerics;

public class GenericsDemo<T> {
    private T t;

    public T get(){
        return this.t;
    }

    public void set(T t1){
        this.t=t1;
    }

    public T sum(T ... x){
        T sum;
        System.out.println(x);
        return  t;
    }

}
