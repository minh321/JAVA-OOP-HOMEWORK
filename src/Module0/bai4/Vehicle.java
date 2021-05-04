package Module0.bai4;

public class Vehicle {
    private String name;
    private int triGia;
    private int dungTich;

    public Vehicle(String name, int triGia, int dungTich) {
        this.name = name;
        if(triGia <0) triGia=0;
        else this.triGia = triGia;
        if (dungTich <0) dungTich =0;
        else this.dungTich = dungTich;
    }

    public Vehicle() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTriGia() {
        return triGia;
    }

    public void setTriGia(int triGia) {
        this.triGia = triGia;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }
    public double tax(){
        if(dungTich <=100){
            return triGia*0.01;
        }else if(dungTich>100 && dungTich <=200){
            return triGia*0.03;
        }else return triGia*0.05;
    }
}
