
public class Main {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static void main(String[] args) {

        int[][] twodmap = new int[41][41];

        for (int z=0; z<20; z++){
            for (int s=0; s<41; s++){
                twodmap[s][z] = 5;
            }
        }

        int lines = 20;
        int columns = 20;

        while (lines!=40 && lines!=0 && columns!=40 && columns!=0) {

                double[] ver = {0.1875, 0.4375, 0.125, 0.25};
                int choises = ((int) (Math.random() * 4));

                if (ver[choises] == 0.1875) {
                    columns--;
                    twodmap[lines][columns] = 1;
                    continue;
                }
                if (ver[choises] == 0.4375) {
                    columns++;
                    twodmap[lines][columns] = 1;
                    continue;
                }
                if (ver[choises] == 0.125) {
                    lines++;
                    twodmap[lines][columns] = 1;
                    continue;
                }
                if (ver[choises] == 0.25) {
                    lines--;
                    twodmap[lines][columns] = 1;
                    continue;
                }

        }


        for (int i=0; i<40; i++){
            for (int j=0; j<40; j++){
                if (twodmap[i][j] == 2){
                    System.out.print(ANSI_GREEN +"[" + twodmap[i][j]+"]" + ANSI_RESET);
                }
                if (twodmap[i][j] == 5){
                    System.out.print(ANSI_RED +"[" + twodmap[i][j]+"]" + ANSI_RESET);
                }
                else {System.out.print("[" + twodmap[i][j] + "]");}

            }
            System.out.println();
        }

    }
}