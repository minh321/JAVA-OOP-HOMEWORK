package Module0.bai11;

public class Subject {
    private String name;
    private int diem;
    private boolean retested;

    public Subject(String name, int diem) {
        this.name = name;
        this.diem = diem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public boolean isRetested() {
        return retested;
    }

    public void setRetested(boolean retested) {
        this.retested = retested;
    }
}
