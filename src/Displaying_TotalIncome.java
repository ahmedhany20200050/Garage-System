class Displaying_TotalIncome implements TaskController{

    @Override
    public void executeTask() {

        System.out.println("total income: "+garageInfo.getTotal_income());

    }
}