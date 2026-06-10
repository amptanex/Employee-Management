package day_2;

public class Vehicle {
    private int id;
    private String vehicle_number;
    private String vehicle_type;
    private String owner_name;
    private String price;
    private String manufacturing_year;

    public void addVehicle(){
        System.out.println("Adding vehicle details");
    }

    public void showVehicleDetails(){
        System.out.println("Showing vehicle details");
    }


    public void calculatePremium(){
        System.out.println("Calculating Premium");
    }

    public Vehicle(int id, String vehicle_number, String vehicle_type, String owner_name, String price, String manufacturing_year) {
        this.id = id;
        this.vehicle_number = vehicle_number;
        this.vehicle_type = vehicle_type;
        this.owner_name = owner_name;
        this.price = price;
        this.manufacturing_year = manufacturing_year;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getManufacturing_year() {
        return manufacturing_year;
    }

    public void setManufacturing_year(String manufacturing_year) {
        this.manufacturing_year = manufacturing_year;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getVehicle_type() {
        return vehicle_type;
    }

    public void setVehicle_type(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    public String getVehicle_number() {
        return vehicle_number;
    }

    public void setVehicle_number(String vehicle_number) {
        this.vehicle_number = vehicle_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}
