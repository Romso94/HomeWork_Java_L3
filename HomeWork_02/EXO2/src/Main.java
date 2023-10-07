public class Main {
    public static void main(String[] args) {

        Vehicle car1 = new Vehicle("4WD", "Crysler");
        Vehicle car2 = new Vehicle("SUV", "Ford");

        System.out.println("Motor type of "+ car1.getVehicleNom() + " is "+ car1.motor.getMotorType());
        System.out.println("Motor type of "+ car2.getVehicleNom() + " is "+ car2.motor.getMotorType());

        car1.setDoor(3,1);
        car2.setDoor(4,1);


        System.out.println("Number of doors in " + car1.getVehicleNom() + " is "+ car1.getTotalDoors());
        System.out.println("Number of doors in " + car2.getVehicleNom() + " is "+ car2.getTotalDoors());


    }
}