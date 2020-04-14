interface Animal {
    public void test();
    public void eat();
}

public class MammalInt implements Animal{
    public MammalInt(){
         System.out.println("Mammal implement Animal");
    }
    public void test(){
        System.out.println("Mammal test");
    }

    public void eat(){
        System.out.println("Mammal eat");
    }
    
    public static void main(String args[]){
       MammalInt m = new MammalInt();
       m.test();
       m.eat();
    }
}