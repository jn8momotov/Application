package Application;

public class Dictionary {

    public static void main(String[] args) {

        Dictionary dict = new Dictionary();

    }

    Bucket[] buckets = new Bucket[26];

    public Dictionary() {
        for (Bucket obj : buckets)
            obj = new Bucket();
    }

    public int h(String word) {
        int hc = word.hashCode();
        return Math.abs(hc % buckets.length);
    }

    public void putPair() {

    }

    public String getValue() {
        return null;
    }

}
