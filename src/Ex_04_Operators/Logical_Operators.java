package Ex_04_Operators;

import java.sql.SQLOutput;

public class Logical_Operators {
//    1. **Logical Operators ->  (Digital Electronics)**
//            - `&&`  (AND)
//            - `||`  (OR)
//            - `!`  (NOT) - REVERSE



    public static void main(String[] args) {


        //Written by Sir
        boolean a = true;
        System.out.println(!a);// REVERSE of A; so first A is true and then reverse of A is false

        boolean b = true;
        System.out.println(!!b);

        boolean c= true || false;

        System.out.println(c);

        boolean c1= false && true;
        System.out.println(c1);


        //Written by Me
        Boolean A= true;
        Boolean B=true;

        System.out.println(!A);
        System.out.println(A||B);
        System.out.println(A&&B);


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