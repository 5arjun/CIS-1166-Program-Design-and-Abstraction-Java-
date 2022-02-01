
public class AsciiArt {
    //this program creates a parking lot with a stadium built under it.
    // the stadium has many rows of bleachers
    public static String space = Character.toString(32);
    public static String underscore = Character.toString(95);
    public static String verticalbar = Character.toString(124);
    public static String star = Character.toString(42);
    public static String backslash = Character.toString(92);
    public static String slash = Character.toString(47);
    public static String dash = Character.toString(45);
    public static String caret = Character.toString(94);
    public static String period = Character.toString(46);


    //TO CHANGE THE SCALE OF EVERYTHING, CHANGE THE VARIABLE BELOW
    //LOOKS BEST FOR VALUES >=9
    static final int SIZE = 13;
    //^^^^^^^
    public static void main(String[] args)   {
        parkingLot();
        topHalf();
        footballField();
        bottomHalf();
    }
    

    public static void parkingLot() {
        for (int i = 0; i < SIZE * 1.5; i++){ //how many rows of parking
            for(int l = 0; l < SIZE; l++){ //centers the parking lot with the tip of the stadium
                System.out.print(space);
            }
            for (int j = 0; j < SIZE / 1.5; j++){  //How many columns wide
                System.out.print(verticalbar);
                for (int k = 0; k < SIZE / 3; k++){  // how wide each individual parking spot is
                    System.out.print(underscore);
                }
                
                System.out.print(verticalbar);
            }
            System.out.println();
        }
    }
    public static void footballField() {
        for(int i = 0; i < SIZE *1.5; i++){
            
            for(int j = 0; j < SIZE * 1.5; j++){
                System.out.print(verticalbar);// prints the bleachers to the left
            }
            for(int k = 0; k < SIZE; k++){
                System.out.print(underscore + space);//prints the stars for the field
            }
            for(int p = 0; p < SIZE * 1.5; p++){
                System.out.print(verticalbar);// prints the bleachers to the rigth
            }
            
            System.out.println();
            
        }

    }
    public static void topHalf() {
        int k;
        double num = SIZE * 1.3;
    
        for(int p = 0; p < SIZE * 5; p++){
            System.out.print(dash);
        }
        System.out.println();
        for(int i = 1; i <= num; i++)  {  
            System.out.print(verticalbar);

            for( k = 1; k <= (num-i); k++)  {  //prints slashes left of the pyramid
                System.out.print(slash);
                System.out.print(space);
            }  
            System.out.print(space);
            for(int j = 1; j <= (2*i-1); j++)  {  
                System.out.print("\""); 
                System.out.print(space);
            }
            for(int l = 1; l < k; l++){ //prints slashes right of the pyramid
                System.out.print(backslash);
                System.out.print(space);
            }
            System.out.print(space);
            System.out.print(verticalbar);
            System.out.println();  
        }    
    }
  
    public static void bottomHalf() {
        int n = (int)(SIZE*1.3);
        int ones = 1;
        for(int i=n;i>=1;i--){
            System.out.print(verticalbar);
            for(int j = i; j < n; j++){//slashes to left of pyramid
                System.out.print(backslash);
                System.out.print(space);
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("\"");
                System.out.print(space);
            }
            
            for(int l = 0; l < ones; l++){ //prints slashes right of the pyramid
                System.out.print(slash);
                System.out.print(space);
            }
            System.out.print(verticalbar);
            System.out.println();
            ones++;

        }
        for(int p = 0; p < SIZE * 5; p++){
            System.out.print(dash);
        } 
    }
   
}


