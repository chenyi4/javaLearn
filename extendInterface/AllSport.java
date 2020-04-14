interface Sports{
    public void setHomeTeam(String name);
    public void setVisitingTeam(String name);
}

interface Football extends Sports{
    public void setHomeTeam(String name);
}

interface Hockey extends Sports{
   public void homeGoalScored();
   public void visitingGoalScored();
   public void endOfPeriod(int period);
   public void overtimePeriod(int ot);
}

public class AllSport implements Hockey{
    public void homeGoalScored(){
        System.out.println("homeGoalScored");
    }
    public void visitingGoalScored(){
        System.out.println("visitingGoalScored");
    }
    public void endOfPeriod(int period){
        System.out.println("endOfPeriod");
    }
    public void overtimePeriod(int ot){
        System.out.println("overtimePeriod");
    }
    public void setVisitingTeam(String name){
        System.out.println("setVisitingTeam");
    }
    public void setHomeTeam(String name){
        System.out.println("setHomeTeam");
    }
    public static void main(String args[]){
        System.out.println("AllSport");
    }
}