public class MainBreakContinue {
    public static void main(String[] args) {
        // breack => loop
        // continue => loop

        int i = 0;
        // while (true) {
        // if (i == 5) {
        // break;
        // }

        // System.out.println(i);
        // i++;
        // }

        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 5) {
                continue; // 跳過
            }
            System.out.println("here");
        }
    }
}
