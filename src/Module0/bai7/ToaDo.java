package Module0.bai7;

public class ToaDo {
    private String name;
    private float x;
    private float y;

    public ToaDo() {
    }

    public ToaDo(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "ToaDo{" +
                 '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
