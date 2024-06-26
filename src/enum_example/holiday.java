package enum_example;

public class holiday {
    public static void main(String[] args) {
        holidayentity h1=new holidayentity("Rday",26,monthEnum.January);
        holidayentity h2=new holidayentity("uttrayan",14,monthEnum.January);
        System.out.println(h1.InSameMonth(h2));
    }

}

class holidayentity{
    String name;
    int day;
    monthEnum month;

   public boolean InSameMonth(holidayentity h){
       return this.month.equals(h.month);
   }

    public holidayentity(String name, int day, monthEnum month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }
}
