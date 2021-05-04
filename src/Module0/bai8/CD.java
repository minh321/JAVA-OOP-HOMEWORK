package Module0.bai8;

public class CD {
    private int maCD;
    private String name;
    private int songNum;
    private double price;

    public CD(int maCD, String name, int songNum, double price) {
        this.maCD = maCD;
        this.name = name;
        this.songNum = songNum;
        this.price = price;
    }

    public CD() {
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        if (maCD > 0) {
            this.maCD = maCD;
        } else maCD = 99999;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) throws Exception {
        if (!name.equals("")) {
            this.name = name;
        } else throw new Exception("Vui long nhap ten ");
    }

    public int getSongNum() {
        return songNum;
    }

    public void setSongNum(int songNum) throws Exception {
        if (songNum > 0) {
            this.songNum = songNum;
        } else throw new Exception("Khong hop le");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws Exception {
        if ((price > 0)) {
            this.price = price;
        } else throw new Exception("Vui long nhap lai");
    }

    @Override
    public String toString() {
        return "CD{" +
                "maCD=" + maCD +
                ", name='" + name + '\'' +
                ", songNum=" + songNum +
                ", price=" + price +
                '}';
    }
}
