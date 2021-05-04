package Module0.bai9;

public class CongNhan {
    private int maCN;
    private String mHo;
    private String mTen;
    private int mSoSP;
    private double luong;

    public CongNhan(int maCN, String mHo, String mTen, int mSoSP) {
        this.maCN = maCN;
        this.mHo = mHo;
        this.mTen = mTen;
        this.mSoSP = mSoSP;
    }

    public int getMaCN() {
        return maCN;
    }

    public void setMaCN(int maCN) {
        this.maCN = maCN;
    }

    public String getmHo() {
        return mHo;
    }

    public void setmHo(String mHo) {
        this.mHo = mHo;
    }

    public String getmTen() {
        return mTen;
    }

    public void setmTen(String mTen) {
        this.mTen = mTen;
    }

    public int getmSoSP() {
        return mSoSP;
    }

    public void setmSoSP(int mSoSP) {
        this.mSoSP = mSoSP;
    }
    public Object tinhLuong() {
        if(mSoSP >= 1 && mSoSP<=199){
            luong = mSoSP*0.5;
        }else if(mSoSP >= 200 && mSoSP <= 399){
            luong = mSoSP*0.55;
        }else if (mSoSP >= 400 && mSoSP <= 599){
            luong = mSoSP*0.6;
        }else if (mSoSP>=600){
            luong = mSoSP*0.65;
        }return luong;
    }

    @Override
    public String toString() {
        return String.format("%-5s %-8s %-8s %5s %10s",getMaCN(),getmHo(),getmTen(),getmSoSP(),tinhLuong());
    }
}
