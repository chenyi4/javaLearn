public class Test {
    
    public static void main(String[] args){
        Animal a = new Cat();
        a.eat();
        Cat c = (Cat)a;
        c.work();
    }
}

abstract class Animal { 
    abstract void eat();
}

class Cat extends Animal {
    public void eat() {
        System.out.println("eatFish");
    }
    public void work() {  
        System.out.println("getMouse");  
    }
}

class Dog extends Animal {
    public void eat() {  
        System.out.println("eatTome");  
    } 
    public void work() {  
        System.out.println("lookHome");  
    } 
}

