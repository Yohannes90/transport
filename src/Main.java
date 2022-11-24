public class Main {
    public static void main(String[] args) {

        Passenger miniVan = new Passenger();

        miniVan.capacity = 7;
        miniVan.transportCapacity();

        miniVan.addPassenger(0,"Abebe");
        miniVan.addPassenger(1,"Kebede");
        miniVan.addPassenger(2,"Abel");
        miniVan.addPassenger(3,"Abubeker");
        miniVan.addPassenger(4,"Hanna");
        miniVan.addPassenger(5,"Zerihun");


        miniVan.viewTotalPassengers();

        miniVan.removePassenger(3);
        miniVan.viewTotalPassengers();


    }
}