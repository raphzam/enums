public class Main {
    public static void main(String[] args){

        Day today = Day.TUE;

        System.out.println(today);

        System.out.println(today.toString());

//        Does not work because today is of ENUM type
        // String tuesday = today;

        String tuesday = today.toString();

        System.out.println(tuesday);
    }

}
