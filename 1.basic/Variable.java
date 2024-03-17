//two slash can make comment
/* slash star can make comment */

// there is two data type. 
// 8 primitives and references.

public class Variable{
    public static class References{
        //string is literal too but not in primitives.
        String asset="wld, solana, bit, nasdaq, semiconductor";
        boolean upwardRight=true;
        char myScore='A';
        int myAccount=50000000;
    }
    public static void main(String[] args){
        References myReferences = new References();
        //logical
        boolean boolean_variable = true;
        //character
        char character_variable = 'A';
        //integer number
        byte byte_variable=1;
        short short_variable=1;
        int int_variable=1;
        long long_variable=1L;
        //real number
        float float_variable=1.1F;
        double double_variable=1.1;

        System.out.println("boolean : "+ boolean_variable);
        System.out.println("char : "+ character_variable);
        System.out.println("byte : "+ byte_variable);
        System.out.println("short : "+short_variable);
        System.out.println("int : "+int_variable);
        System.out.println("long : "+long_variable);
        System.out.println("float : "+float_variable);
        System.out.println("double : "+double_variable);
        System.out.println("Let's go "+myReferences.asset);
        System.out.println("asset will go upward right. ture? "+myReferences.upwardRight);
    }
}