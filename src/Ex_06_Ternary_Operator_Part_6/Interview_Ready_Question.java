package Ex_06_Ternary_Operator_Part_6;

public class Interview_Ready_Question {
    public static void main(String[] args) {


        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
        int number = 21;
        String result = number > 18 ? number > 25 ? "In Goa, You can drink" : "You can't Drink" : "You can't go GOA";
       // String result = number > 18 ?  "You can't go GOA"; --> 1st Expression
        // number > 25 ? "In Goa, You can drink" : "You can't Drink" :--> 2nd Expression Nested
        System.out.println(result);

    }
}
