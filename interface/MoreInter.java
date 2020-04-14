interface face1{
    public void name();
}

interface face2{

}

public class MoreInter implements face1, face2{
    public void name(){
        System.out.println("name init");
    }
    public static void main(String args[]){
        System.out.println("MoreInter Init");
    }
}