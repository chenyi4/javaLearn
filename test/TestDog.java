class Animal{
    public void move(){
         System.out.println("动物可以移动");
    }
    void eat(){
        System.out.println("animal : eat");
    }
}

class Dog extends Animal{
   public void move(){
      System.out.println("222");
   }
   void eat() {
      System.out.println("dog : eat");
   }
}

public class TestDog{
    public static void main(String args[]){
       Animal a = new Animal(); // Animal 对象
       Dog b = new Dog(); // Dog 对象
 
       a.move();// 执行 Animal 类的方法
 
       b.move();//执行 Dog 类的方法
       b.eat();
    }
}