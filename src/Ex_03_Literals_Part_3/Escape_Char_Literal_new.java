package Ex_03_Literals_Part_3;

public class Escape_Char_Literal_new {

    public static void main(String[] args) {

        // Escape Char
        char new_line = '\n'; // variable can be anything like new or n
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("PramodDutta");
        System.out.println("Pramod" + new_line + "Dutta");
        System.out.println("Pramod\nDutta");
        System.out.println("Pramod" + tab_line + "Dutta");
        System.out.println("Pramod" + back_space + "Dutta");
        System.out.println(" ----- ");

        System.out.println("Pramod is " + carriage_return + "Dutta");

        System.out.println("Hi, This is a First line" + new_line + "This is second line\n This is Third line");

    }
}