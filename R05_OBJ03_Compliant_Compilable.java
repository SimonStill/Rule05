/******************************************************************************
 *  Rule05 - OBJ03
 *  Compliant
 ******************************************************************************/

public class R05_OBJ03_Compliant_Compilable{
    public static void main(String[] args) { 
        // Determine whether object auth has required/expected class object
        Object auth = "hello";
        if (auth.getClass() == java.lang.String.class) {
            System.out.println("Expected class object");
        }
        else{
            System.out.println("Unexpected class object");
        }
    }
}



