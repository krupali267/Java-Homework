public class Calculator1 {

    static int a = 25;
    static int b = 10;
    static int total;
    static int sub;


    public static void main(String[] args) {

        total = (a + b);
        sub = (a - b);

        System.out.println("Addition " + "Of " + "25 " + "& " + "10 " + "= " + total);
        System.out.println("Subtraction " +"Of " + a +" "+ "& "+ b +" " +"= " + sub);
        System.out.println("Multiplication " + "Of " + a +" " +"& "+ b +" " + "= " + a * b);
        System.out.println("Division " +"Of "+ a +" "+ "& " + b +" " +"= " + a / b);


    }
}