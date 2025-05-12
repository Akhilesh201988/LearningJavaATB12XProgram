package Ex_02_Java_Basics_Part_2;

public class Program_Println_Printf_print {
    public static void main(String[] args) {
        //Println-> will print on next line in end
        //Print-> will print on same line
        //Printf-> Basically add formatting to the output

        int i=10;
        byte b=11;
        long l=9773747807l;
        short s= 101;
        float f= 3.14f;
        char c='s';
        boolean Are_we_good= true;


        // System.out.println(i);
        // System.out.print(i);

       // System.out.printf ("This is your int variable %d",  "this is 2 value %d",i, b)
    System.out.printf("This is your int variable %d", i); // %d will be use for Datatype- int, byte, long, short
        System.out.printf("This is your byte variable %d", b); // %d will be use for Datatype- int, byte, long, short
        System.out.printf("This is your long variable %d", l); // %d will be use for Datatype- int, byte, long, short
        System.out.printf("This is your short variable %d", s); // %d will be use for Datatype- int, byte, long, short
        System.out.printf("This is your boolean variable %b", b); // %b will be use for Datatype- Boolean,
        System.out.printf("This is your string variable %s", c); // %s will be use for Datatype- String,
        System.out.printf("This is your float variable %f", f); //%f will be use for Datatype- Float,

        // %d will store value of i and display with message
        // %d will be use for Datatype- int, byte, long, short
        // %s will be use for Datatype- String,
        // %f will be use for Datatype- Float,
        // %b will be use for Datatype- Boolean,

    }
}
