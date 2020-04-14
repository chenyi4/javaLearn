class Animal{
   public void move(){
       System.out.println("animal can vo");
   } 
}

class Dog extends Animal{
    public void move(){
        super.move();
        System.out.println("dog can move");
    }
}

public class TestDogSuper{
    public static void main(String args[]){
        Animal a = new Animal();
        Animal b = new Dog();

        a.move();
        b.move();
    }
}