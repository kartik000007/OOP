package package1;

public class studentStatic {
    public static void main(String[] args) {
        stud s1 = new stud();
        s1.input("aaa", 50, 45, 34, 23, 55);
        stud s2 = new stud();
        s2.input("bbb", 60, 45, 74, 83, 25);
        stud s3 = new stud();
        s3.input("ccc", 70, 65, 44, 93, 25);

        s1.displayDetail();
        s2.displayDetail();
        s3.displayDetail();
        System.out.println();
        stud.totalStudent();





//           s1.show();
//        System.out.println(s1.Totalmarks());
//        System.out.println(s1.getHighest());
//        System.out.println(s1.getLowest());
//        System.out.println(s1.getAverage());
//        System.out.println(s1.getPassCount());
//        stud s4=new stud();

//        System.out.println(s3.rollNo);
//        stud.totalStudent();
    }
}

class stud {
    static int number;

    static {
        number = 0;
    }

    int rollNo;
    String name;
    int[] marks = new int[5];

    stud() {
        rollNo = ++number;
    }

    static void totalStudent() {
        System.out.println("total Student: " + number);
    }

    void input(String name, int sub1, int sub2, int sub3, int sub4, int sub5) {
        this.name = name;
        this.marks[0] = sub1;
        this.marks[1] = sub2;
        this.marks[2] = sub3;
        this.marks[3] = sub4;
        this.marks[4] = sub5;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll N0.: " + rollNo);
        for (int i = 0; i < marks.length; i++) {
            System.out.println((i + 1) + " subject: " + marks[i]);
        }
    }

    int Totalmarks() {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        return sum;
    }

    int getHighest() {
        int max = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        return max;
    }

    int getLowest() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < min) {
                min = marks[i];
            }
        }
        return min;
    }

    double getAverage() {
        return (double) Totalmarks() / marks.length;
    }

    int getPassCount() {
        int count = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 50) {
                count++;
            }
        }
        return count;
    }
    
    void displayDetail(){
        System.out.println("student Name: "+name);
        System.out.println("Student Roll No.: "+rollNo);
        System.out.println("Marks: "+ marks[0]+" "+ marks[1]+ " "+marks[2]+" "+ marks[3]+" "+ marks[4]);
        System.out.println("Total Mark: "+Totalmarks());
        System.out.println("Highest Mark: "+getHighest());
        System.out.println("Lowest Mark: "+getLowest());
        System.out.println("Average Mark: "+getAverage());
        System.out.println("Pass subject: "+getPassCount());
    }
}
