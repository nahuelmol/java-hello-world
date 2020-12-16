import java.util.*;

//this is a commmon menu to be more familiarilized with the java loops
//specificly with do, while... loops

class HelloWorld {
    public static void main(String[] args) {

        int opc = 0;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Choose an option below!");
            System.out.println("1.Hello");
            System.out.println("2.what's going on");
            System.out.println("3.hello! what's time is?");
            System.out.println("4.exit");

            System.out.println("Enter the option:\n");
            opc = sc.nextInt();

            if(opc == 3){
              System.out.println("The hour is.. something\n\n");
            };
            
            if(opc == 1){
              System.out.println("Hi! my friend, you're not alone! little shit\n\n");
            };
            
            if(opc == 2){
              System.out.println("i trying to create an UX confortable for you\n\n");
            };

        }while(opc != 4);



        

        
        
    }
}




