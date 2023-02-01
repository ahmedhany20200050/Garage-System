class VehicleOwner{
    private String name;
    private Vehicle vehicle;
    //note that Departure time is in seconds
    private double DepartureTime;
    //note that Arrival time is in seconds
    private int arrivalTime;
    public VehicleOwner(){}
    public VehicleOwner(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public double getDepartureTime() {
        return DepartureTime;
    }

    public void setDepartureTime(double departureTime) {
        DepartureTime = departureTime;
    }


    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}