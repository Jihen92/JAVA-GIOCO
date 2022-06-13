public class Game {
    int width;
    int height;
    char[][] griglia;
    int x;
    int y;
    public Game (int width ,int height){
        this.width=width;
        this.height=height;
        this.griglia = new char[width][height];
        this.x=width/2;
        this.y=height/2;
        pulisci();

    }
    
    public void pulisci(){
      for(int i=0; i<width; i++){
          for (int j=0; j<height;j++){
              griglia[i][j]= ' ';

          }
      }
    }
    public void stampa(){
        for(int i=0;i<width+3;i++)
        System.out.print("*");
        System.out.println("");

        for(int i=0; i<width ;i++){
            System.out.print("*");
        for(int j=0; j<height;j++){
            if(i == x && y==j){
               System.out.print("i");
            }
            else
           System.out.print(griglia[i][j]);
          }
          System.out.println("*");
          }
          for (int i=0 ;i<width;i++)
          System.out.println("*");
        
        for(int i=0;i<width+3;i++)
        System.out.print("*");
    }
}
