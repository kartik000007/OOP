package Assignment;

public class company {
    public static void main(String[] args) {
        employee e1=new employee(1,"aaa",jobtitleEnum.HOD,40000);
        employee e2=new employee(2,"bbb",jobtitleEnum.Peon,20000);
        employee e3=new employee(3,"ccc",jobtitleEnum.Peon,10000);
        employee e4=new employee(4,"ddd",jobtitleEnum.Prof,50000);
        employee e5=new employee(5,"eee",jobtitleEnum.Peon,20000);
        employee e6=new employee(6,"fff",jobtitleEnum.HOD,80000);
        employee e7=new employee(7,"ggg",jobtitleEnum.Prof,50000);
        employee e8=new employee(8,"hhh",jobtitleEnum.Principal,90000);
        employee e9=new employee(9,"iii",jobtitleEnum.Prof,70000);
        employee e10=new employee(10,"jjj",jobtitleEnum.Peon,30000);
        employee[] empdata=new employee[10];
        empdata[0]=e1;
        empdata[1]=e2;
        empdata[2]=e3;
        empdata[3]=e4;
        empdata[4]=e5;
        empdata[5]=e6;
        empdata[6]=e7;
        empdata[7]=e8;
        empdata[8]=e9;
        empdata[9]=e10;

        totalSalary(empdata);

    }
    public static  void totalSalary(employee[] emp){
        int sapeon=0;
        int sapro=0;
        int sahod=0;
        int sapri=0;

        for (int i = 0; i < emp.length; i++) {
           if(emp[i].jobname==jobtitleEnum.HOD){
               sahod+=emp[i].salary;
           }
            if(emp[i].jobname==jobtitleEnum.Peon){
                sapeon+=emp[i].salary;
            }
            if(emp[i].jobname==jobtitleEnum.Prof){
                sapro+=emp[i].salary;
            }
            if(emp[i].jobname==jobtitleEnum.Principal){
                sapri+=emp[i].salary;
            }
        }
        System.out.println("HOD: "+ sahod);
        System.out.println("Principle: "+ sapri);
        System.out.println("Peon: "+ sapeon);
        System.out.println("Professor: "+ sapro);
    }
}

class employee{
    int empid;
    String name;
    jobtitleEnum jobname;
    int salary;

    public employee(int empid, String name, jobtitleEnum jobname, int salary) {
        this.empid = empid;
        this.name = name;
        this.jobname = jobname;
        this.salary = salary;
    }
//
//    public void totalSalary(employee[] empdata) {
//    }

//    public static void totalSalary(employee[] emp){
//        for (int i = 0; i < emp.length; i++) {
//            System.out.println(emp[i].empid);
//        }
//    }
}

enum jobtitleEnum{
    Peon, Prof, HOD, Principal
}