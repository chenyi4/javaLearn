public class ReWrite{
    public void test(){
        System.out.println("test");
    }
    
    public void test(int val){
        System.out.println("test overload"); //重载
        System.out.println(val);
    }

    public static void main(String args[]){
        ReWrite one = new ReWrite();
        one.test(23);
        System.out.println("text content rewrite");
    }
}