package Ex_02_Java_Basics_Part_2;

public class Final_constant_program {
    public static void main(String[] args) {

            final int i=10;// Final keyword is used to assign constant value which can't be changed
                   // i=11; // java: cannot assign a value to final variable i
        final float f=3.14f;

        System.out.println(i);
        System.out.println(f);
    }
}
