public class MainB {
    public static void main(String[] args) {
        String name = "Wilson";
        System.out.println(name.length()); // method

        System.out.println(name.toLowerCase()); // 全部小寫
        System.out.println(name.toUpperCase()); // 全部大寫
        System.out.println(name.charAt(0)); // for any String , index 0,1,2,3 ...,
        // n-1 , where n = string.lenght()
        System.out.println(name.charAt(name.length() - 1));
        System.out.println(name.indexOf('s'));

        String age = "25";

        System.out.println((5 > 3) && (3 < 2));
        System.out.println(Integer.parseInt(age));
    }
}
