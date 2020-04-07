class Animal{
    private String name;
    public String testString;
    public Animal(){
        System.out.println("this is constructor");  //constructor 
    }
    
    void setName() {  //吃东西方法的具体实现  
        this.name = "format";
        this.testString = "aaaaa";
        System.out.println(this.name);
    }
}

class Dog extends Animal {
    void setName() {  //吃东西方法的具体实现  
          System.out.println("my Name is Dog");   
    }
    void ask(){
        this.setName();
        super.setName();
        // System.out.println(this.name); private 的变量只能在自己的类中读取，不能被外部所读取
        System.out.println(this.testString); //继承了父元素的testString
    }
}


public class Penuin {
    public static void main(String args[]){
         System.out.println("1u82ukk");
         Dog test = new Dog();
         test.ask();
    }
} 