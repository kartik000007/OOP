package Abstraction;

interface vehicle {
    public void ChangeGear();
}
public class assignment {
    public static void main(String[] args) {
//        Bicycle b1 = new Bicycle();
//        b1.ChangeGear();
//        b1.ChangeGear();
//        b1.ChangeGear();

        bike bike = new bike();
        bike.ChangeGear();
        bike.ChangeGear();
        bike.ChangeGear();
        bike.ChangeGear();
        bike.ChangeGear();
    }
}

class Bicycle implements vehicle {
    int gear = 1;

    @Override
    public void ChangeGear() {
        if (gear <= 2) {
            System.out.println(" Bicycle Gear No = " + gear);
            gear++;
        } else {
            System.out.println("Bicycle Only 2 gear allowed");
            return;
        }
    }
}


class bike implements vehicle {
    int gear = 1;

    @Override
    public void ChangeGear() {
        if (gear <= 3) {
            System.out.println("Bike gear No = " + gear);
            gear++;
            return;
        } else {
            System.out.println("Bike Only 5 gear allowed");
        }
    }
}


class Car implements vehicle {
    int gear = 1;

    @Override
    public void ChangeGear() {
        if (gear <= 5) {
            System.out.println("Car gear No = " + gear);
            gear++;
            return;
        } else {
            System.out.println("Car Only 5 gear allowed");
        }
    }
}