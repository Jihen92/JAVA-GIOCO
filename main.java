import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Game g=new Game (20,20);
        g.stampa();
        int input=0;
        Scanner sc=new Scanner(System.in);
        do {
           System.out.println("Scegli un opzione\n\t1.muovi su \n\t2.muovi.giu \n\t3 muovi a destra \n\t4 muovi a sinistra \n\t9 esci");
           input=sc.nextInt();
           switch(input){
               case 1:
               g.muovi(-1,0);
               break;
               case 2:
               g.muovi(-1,0);
               break;
               case 3:
               g.muovi(0,1);
               break;
               case 4:
               g.muovi(0,-1);
               break;
               default:
               break;
           }
        }while (input !=9);
    }
}