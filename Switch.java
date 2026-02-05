import java.util.Scanner;
public class Switch{
    public static void main(String args[]){
        Scanner sc= new Scanner(System .in);
        System.out.print("Play\nSetting\nAbout\nExit\nEnter your choice ");
          int n = sc.nextInt();

          switch (n){
            case 1 :
                System.out.println("Game started");
                break;
                case 2:
                     System.out.println("Settings opened");
                      System.out.print("Mouse\nKeyboard\nAudio\n Video\n");
         n = sc.nextInt();
          
          switch (n){
            case 1 :
                   System.out.println("Mouse setting is opened");
                   break;
                   case 2 :
                   System.out.println("keyboard setting is opened");
                   break;
                   case 3:
                   System.out.println("Audio setting is opened");
                   break;

                   case 4 :
                   System.out.println("Video setting is opened");
                   break;
          }
          break;
           case 3 :
                System.out.println("About the game ");
                break;
                 case 4 :
                System.out.println(" Game is Exiting");
                break;

                default :
                System.out.println("Invalid option");
                break;


          }
    }


}