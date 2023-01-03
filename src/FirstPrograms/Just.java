package FirstPrograms;

import java.util.StringJoiner;

public class Just {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(",","[","]");
        joiner.add("A").add("B").add("C");
        System.out.println(joiner);

        StringJoiner joiner1 = new StringJoiner(":");
        joiner1.add("P").add("Q");
        System.out.println(joiner1);
        joiner.merge(joiner1);
        System.out.println(joiner);
    }
}
