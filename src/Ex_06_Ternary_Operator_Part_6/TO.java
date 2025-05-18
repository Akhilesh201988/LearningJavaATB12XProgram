package Ex_06_Ternary_Operator_Part_6;

public class TO {
    public static void main(String[] args) {
        int age=17;
        String CanIgo= age>15 ? "Then NO go" : "GO";
        System.out.println(CanIgo);

//        #### Syntax
//                - result = condition ? expression1 : expression2;
//        - **condition**: This is a boolean expression that is evaluated.
//                - **expression1**: This expression is executed if the condition is true.
//                - **expression2**: This expression is executed if the condition is false.

    }
}
//- The **conditional operator**, commonly known as the **ternary operator** in Java.
//        - evaluate a condition and return one of two values based on the result.
//        - Very similar - `if-else` statement.
