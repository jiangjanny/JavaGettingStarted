import java.util.ArrayList;

public class MainArray {
    public static void main(String[] args) {
        // String[] friends = { "Mike", "Grace", "Spencer" };
        // System.out.println(friends); // java.lang.String;@2eafffde

        ArrayList<String> friends = new ArrayList<>();
        friends.add("Mike");
        friends.add("Grace");

        System.out.println(friends.size()); // 2

    }
}
