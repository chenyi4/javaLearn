class EncapTest{
    private String name;
    private String idNum;
    private int age;

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public void setName(String newName){
        name = newName;
    }
}

public class RunEncap{
    public static void main(String args[]){
        EncapTest test = new EncapTest();
        test.setName("nametest");
        test.setAge(12);
        
        System.out.print("Name : " + test.getName()+ 
                             " Age : "+ test.getAge());
    }
}