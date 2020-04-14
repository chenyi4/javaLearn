class Animal{
   public void move(){
       System.out.println("animal can vo");
   } 
}

class Dog extends Animal{
    public void move(){
        System.out.println("dog can move");
    }
    public void bark(){
        System.out.println("dog can ask");
    }
}

public class TestDogBug{
    public static void main(String args[]){
        Animal a = new Animal();
        Animal b = new Dog();

        a.move();
        b.move();
        b.bark();
        /* no bark method*/
    }
}