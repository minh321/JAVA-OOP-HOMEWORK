package Module0.bai8;

import java.util.ArrayList;

public class CDList {
    private ArrayList<CD> cd = new ArrayList<>();
    private CD disk;

    public void addCD(CD disk) {
        for (int i = 0; i < cd.size(); i++) {
            if (cd.contains(cd.get(i).getMaCD())) {
                System.out.println("Ma CD da ton tai");
            } else cd.add(disk);
        }
    }

    @Override
    public String toString() {
        return "CDList{" +
                "cd=" + cd +
                ", disk=" + disk +
                '}';
    }
}