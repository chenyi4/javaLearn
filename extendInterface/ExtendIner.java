
interface Face1{
    public void Face1();
}

interface Face2{
    public void Face2();
}

interface ExtendIner2 extends Face1, Face2{
    public void Face2();
    public void homeGoalScored();
}


public class ExtendIner implements ExtendIner2{
    public void Face1(){

    }
    public void Face2(){

    }
    public void homeGoalScored(){

    }
    public static void main(String args[]){
        System.out.println("main Function");
    }
}
