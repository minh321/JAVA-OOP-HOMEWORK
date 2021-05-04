package Module1.bai1;

public abstract class Tour {
    private int tourID;
    private String driverName;
    private String carNum;

    public Tour(int tourID, String driverName, String carNum) {
        this.tourID = tourID;
        this.driverName = driverName;
        this.carNum = carNum;
    }
    public abstract void totalPrice();

    public Tour() {
    }

    public int getTourID() {
        return tourID;
    }

    public void setTourID(int tourID) {
        this.tourID = tourID;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }
}
