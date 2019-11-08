/******************************************************************************
 *  Rule05 - OBJ03
 *
 ******************************************************************************/

public class R05_OBJ03_Compilable{
    public static void main(String[] args) { 
        // Determine whether object auth has required/expected class object
        Object auth = "hello";
        System.out.println("Class Name is " + auth.getClass().getName());
        if(auth.getClass().getName().equals("java.lang.String")) {
            System.out.println("Expected class object");
        }
        else{
            System.out.println("Unexpected class object");
        }
    }
}



