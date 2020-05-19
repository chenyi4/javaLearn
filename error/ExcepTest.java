import java.io.*;
public class ExcepTest{
    public static void main(String args[]){
        try{
            int a[] = new int[2];
            System.out.println(a[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("bad" + e);
        }finally{
            System.out.println("this message must be show");
        }

        System.out.println("Out of the block");
    }
}