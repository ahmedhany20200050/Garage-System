class Slot{
    private int ID;
    private double width;
    private double depth;
    private Boolean Isavaliable;

    public Slot(int ID, double width, double depth, Boolean isavaliable) {
        this.ID = ID;
        this.width = width;
        this.depth = depth;
        Isavaliable = isavaliable;
    }
    public Slot(){}

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

    public Boolean getIsavaliable() {
        return Isavaliable;
    }

    public void setIsavaliable(Boolean isavaliable) {
        Isavaliable = isavaliable;
    }
}