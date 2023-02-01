class Displaying_numofVehicles implements TaskController{

    @Override
    public void executeTask() {

        System.out.println("vehicles total number: "+garageInfo.getNumOfVehicles());
    }
}