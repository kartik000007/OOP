package Assignment;

public class employeeSlip {
    public static void main(String[] args) {
        salarySlip aa1 = new salarySlip(1001, 1, "aaa", 20000);
        salarySlip aa2 = new salarySlip(1001, 2, "aaa", 3000);
        salarySlip aa3 = new salarySlip(1001, 3, "aaa", 4000);
        salarySlip aa4 = new salarySlip(1001, 4, "aaa", 5000);
        salarySlip aa5 = new salarySlip(1001, 5, "aaa", 6000);
        salarySlip aa6 = new salarySlip(1001, 6, "aaa", 7000);

        salarySlip bb1 = new salarySlip(1002, 1, "bbb", 20000);
        salarySlip bb2 = new salarySlip(1002, 2, "bbb", 80000);
        salarySlip bb3 = new salarySlip(1002, 3, "bbb", 80000);
        salarySlip bb4 = new salarySlip(1002, 4, "bbb", 90000);
        salarySlip bb5 = new salarySlip(1002, 5, "bbb", 10000);
        salarySlip bb6 = new salarySlip(1002, 6, "bbb", 90000);

        salarySlip cc1 = new salarySlip(1003, 1, "ccc", 90000);
        salarySlip cc2 = new salarySlip(1003, 2, "ccc", 37000);
        salarySlip cc3 = new salarySlip(1003, 3, "ccc", 44000);
        salarySlip cc4 = new salarySlip(1003, 4, "ccc", 54000);
        salarySlip cc5 = new salarySlip(1003, 5, "ccc", 95000);
        salarySlip cc6 = new salarySlip(1003, 6, "ccc", 80000);

        salarySlip dd1 = new salarySlip(1004, 1, "ddd", 23000);
        salarySlip dd2 = new salarySlip(1004, 2, "ddd", 37000);
        salarySlip dd3 = new salarySlip(1004, 3, "ddd", 43000);
        salarySlip dd4 = new salarySlip(1004, 4, "ddd", 70000);
        salarySlip dd5 = new salarySlip(1004, 5, "ddd", 90000);
        salarySlip dd6 = new salarySlip(1004, 6, "ddd", 76000);

        salarySlip ee1 = new salarySlip(1005, 1, "eee", 70000);
        salarySlip ee2 = new salarySlip(1005, 2, "eee", 67000);
        salarySlip ee3 = new salarySlip(1005, 3, "eee", 87000);
        salarySlip ee4 = new salarySlip(1005, 4, "eee", 98000);
        salarySlip ee5 = new salarySlip(1005, 5, "eee", 95500);
        salarySlip ee6 = new salarySlip(1005, 6, "eee", 74000);

        salarySlip ff1 = new salarySlip(1006, 1, "fff", 40000);
        salarySlip ff2 = new salarySlip(1006, 2, "fff", 35000);
        salarySlip ff3 = new salarySlip(1006, 3, "fff", 70000);
        salarySlip ff4 = new salarySlip(1006, 4, "fff", 53000);
        salarySlip ff5 = new salarySlip(1006, 5, "fff", 64000);
        salarySlip ff6 = new salarySlip(1006, 6, "fff", 20000);

        salarySlip[][] salarySlips = {
                {aa1, aa2, aa3, aa4, aa5, aa6},
                {bb1, bb2, bb3, bb4, bb5, bb6},
                {cc1, cc2, cc3, cc4, cc5, cc6},
                {dd1, dd2, dd3, dd4, dd5, dd6},
                {ee1, ee2, ee3, ee4, ee5, ee6},
                {ff1, ff2, ff3, ff4, ff5, ff6}
        };



        salarySlip.calculateTop2Highest(salarySlips);
    }
}

class salarySlip {
    int empId;
    int month;
    String name;
    double salary;

    public salarySlip(int empId, int month, String name, double salary) {
        this.empId = empId;
        this.month = month;
        this.name = name;
        this.salary = salary;
    }

    public static void calculateTop2Highest(salarySlip[][] salaryArray) {

        int row = salaryArray.length;
        int col = salaryArray[0].length;
        int max1 = 0;
        int max2 = 0;
        int eid1=0;
        int eid2=0;
        int k = 0;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (salaryArray[j][i].salary > max1) {
                    max2 = max1;
                    max1 = (int) salaryArray[j][i].salary;
                    eid1=salaryArray[j][i].empId;
//                    eid2=salaryArray[j][i].empId;
                } else if (salaryArray[j][i].salary > max2 && salaryArray[j][i].salary != max1) {
                    max2= (int) salaryArray[j][i].salary;
                    eid2=salaryArray[j][i].empId;
                }

            }
            System.out.print(salaryArray[i][k].month+"--> "+max1+ " "+ max2 + " "+ eid1+" "+" "+eid2);
            k++;
            max1 = 0;
            max2=0;
            eid1=0;
            eid2=0;

            System.out.println();
            }
        }

//    public static void calculateTop2Highest(salarySlip[] salaryArray, int month) {
//        double max1 = Double.MIN_VALUE;
//        double max2 = Double.MIN_VALUE;
//        int empId1 = 0;
//        int empId2 = 0;
//
//        for (salarySlip slip : salaryArray) {
//            if (slip.month == month) {
//                if (slip.salary > max1) {
//                    max2 = max1;
//                    empId2 = empId1;
//                    max1 = slip.salary;
//                    empId1 = slip.empId;
//                } else if (slip.salary > max2 && slip.salary != max1) {
//                    max2 = slip.salary;
//                    empId2 = slip.empId;
//                }
//            }
//        }
//        System.out.println("Month " + month + ": " + empId1 + " - " + empId2);
//    }


//        salarySlip[] salaryArray=new salarySlip[36];
//
//        salaryArray[0] = aa1;
//        salaryArray[1] = aa2;
//        salaryArray[2] = aa3;
//        salaryArray[3] = aa4;
//        salaryArray[4] = aa5;
//        salaryArray[5] = aa6;
//        salaryArray[6] = bb1;
//        salaryArray[7] = bb2;
//        salaryArray[8] = bb3;
//        salaryArray[9] = bb4;
//        salaryArray[10] = bb5;
//        salaryArray[11] = bb6;
//        salaryArray[12] = cc1;
//        salaryArray[13] = cc2;
//        salaryArray[14] = cc3;
//        salaryArray[15] = cc4;
//        salaryArray[16] = cc5;
//        salaryArray[17] = cc6;
//        salaryArray[18] = dd1;
//        salaryArray[19] = dd2;
//        salaryArray[20] = dd3;
//        salaryArray[21] = dd4;
//        salaryArray[22] = dd5;
//        salaryArray[23] = dd6;
//        salaryArray[24] = ee1;
//        salaryArray[25] = ee2;
//        salaryArray[26] = ee3;
//        salaryArray[27] = ee4;
//        salaryArray[28] = ee5;
//        salaryArray[29] = ee6;
//        salaryArray[30] = ff1;
//        salaryArray[31] = ff2;
//        salaryArray[32] = ff3;
//        salaryArray[33] = ff4;
//        salaryArray[34] = ff5;
//        salaryArray[35] = ff6;
////        salarySlip._2MonthHightest(salaryArray,1);
////        salarySlip._2MonthHightest(salaryArray,2);
////        salarySlip._2MonthHightest(salaryArray,3);
//        salarySlip.calculateTop2Highest(salaryArray,4);
//        salarySlip.calculateTop2Highest(salaryArray,5);
////        salarySlip._2MonthHightest(salaryArray,6);
    }
