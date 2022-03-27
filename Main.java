/*Given an integral number, determine if it's a square number:
        Examples
        -1  =>  false
        0  =>  true
        3  =>  false
        4  =>  true
        25  =>  true
        26  =>  false*/
public class Main {
    public static void main(String[] args)
    {
        int s=26;
        if (isSquare(s))
        {System.out.println("true");}
        else System.out.println("false");

    }

        public static boolean isSquare(int n) {

            return Math.sqrt(n) % 1 == 0;

        }

}
