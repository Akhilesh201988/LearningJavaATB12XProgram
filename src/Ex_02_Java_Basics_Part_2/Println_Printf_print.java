package Ex_02_Java_Basics_Part_2;

public class Println_Printf_print {
    public static void main(String[] args) {
        //Println-> will print on next line in end
         //Print-> will print on same line
         //Printf-> Basically add formatting to the output

        int i=10;
       // System.out.println(i);
       // System.out.print(i);
        System.out.printf("This is your variable %d", i);

        // %d will store value of i and display with message
        // %d will be use for Datatype- int, byte, long, short
        // %s will be use for Datatype- String,
        // %f will be use for Datatype- Float,
        // %b will be use for Datatype- Boolean,

    }
}
