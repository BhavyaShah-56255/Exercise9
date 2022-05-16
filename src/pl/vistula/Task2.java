package pl.vistula;

public class Task2 {

    public static void main(String[ ] args) {
        int[] Bhavya56255 = {1, 2, 3, 6 , 8 , 21};
        System.out.println(Bhavya56255[7]);


        try {
            Bhavya56255 = new int[]{1, 2, 3, 6 , 8 , 21};

            System.out.println(Bhavya56255[7]);
        } catch (Exception e) {
            System.out.println("Something is off.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }


    }
}
