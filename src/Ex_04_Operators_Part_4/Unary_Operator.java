package Ex_04_Operators_Part_4;

public class Unary_Operator {
    public static void main(String[] args) {
        // Unary Operator
        int a = +10; // + is Unary operator we usually don't write it as it takes by default as +
        int a1 = -110; // - is Unary operator
        int result = a+a1;
        System.out.println(a);
        System.out.println(a1);
        System.out.println(result); // a+a1 i.e. +10-110


        int b = -1;
        b = b+1;
        System.out.println(b); //-1+1

//        AND Gate
//        A	B	Output (A AND B)
//        0	0	0
//        0	1	0
//        1	0	0
//        1	1	1
//

        //OR gate
//        A	B	Output (A OR B)
//        0	0	0
//        0	1	1
//        1	0	1
//        1	1	1




    }
}