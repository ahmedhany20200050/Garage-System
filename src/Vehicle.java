class Vehicle{
    private String modelName;
    private int modelYear;
    private int ID;
    private double width;
    private double depth;
    public Vehicle(){}
    public Vehicle(String modelName, int modelYear, int ID, double width, double depth) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.ID = ID;
        this.width = width;
        this.depth = depth;
    }
    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public int getModelYear() {
        return modelYear;
    }
    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
}