package Application;

import java.util.ArrayList;

public class Bucket {

    ArrayList<Pair> list = new ArrayList<>();

    public void putPair(String key, String value) {
        for (Pair obj : list) {
            if (obj.key.equals(key)) {
                obj.value = value;
                return;
            }
        }
        list.add(new Pair(key, value));
    }

    public String getPair() {
        return null;
    }

}
