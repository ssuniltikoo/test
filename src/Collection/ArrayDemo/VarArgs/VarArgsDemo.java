package Collection.ArrayDemo.VarArgs;

import java.util.Arrays;

public class VarArgsDemo {

    static int doSum(int[] data){
        int sum = 0;
        for(int i = 0;i<data.length;i++){
            sum+=data[i];
        }
        return sum;
    }

    static int dosum2(int ... data){
        int sum = 0;
        for(int i = 0;i<data.length;i++){
            sum+=data[i];
        }
        return sum;
    }


    public static void main(String ... args) {
        int [] intarr={10,55, 24,62,20,30,40};
        System.out.println(VarArgsDemo.doSum(intarr));
        System.out.println(VarArgsDemo.dosum2(2,3,4,5,6,7,8,9,10));
        System.out.println(VarArgsDemo.doSum(new int[]{10,20}));
        System.out.println(VarArgsDemo.dosum2());
        Arrays.sort(intarr);
        System.out.println(intarr.toString());
    }
}
