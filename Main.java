public class Main {
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static void main(String[] args) {

        int[][] twodmap = new int[41][41];

        for (int z=0; z<41; z++){
            for (int s=0; s<41; s++){
                twodmap[s][z] = 0;
            }
        }

        int lines = 20;
        int columns = 20;
        twodmap[lines][columns]++;

        while (lines!=40 && lines!=0 && columns!=40 && columns!=0) {

            double[] ver = {0.1875, 0.4375, 0.125, 0.25};
            int choises = ((int) (Math.random() * 4));

            if (ver[choises] == 0.1875) {
                columns--;
                twodmap[lines][columns]++;
                continue;
            }
            if (ver[choises] == 0.4375) {
                columns++;
                twodmap[lines][columns]++;
                continue;
            }
            if (ver[choises] == 0.125) {
                lines++;
                twodmap[lines][columns]++;
                continue;
            }
            if (ver[choises] == 0.25) {
                lines--;
                twodmap[lines][columns]++;
                continue;
            }

        }

        int maxs = twodmap[0][0];

        for (int j=0; j<41; j++){
            for (int l=0; l<41; l++){
                if (maxs<twodmap[j][l]){
                    maxs = twodmap[j][l];
                }
            }
        }

        for (int i=0; i<41; i++){
            for (int j=0; j<41; j++){
                if (twodmap[i][j] == 0){
                    System.out.print(ANSI_RED + "[" + twodmap[i][j] + "]" + ANSI_RESET);
                }
                else if (i == 20 && j == 20){
                    System.out.print(ANSI_GREEN + "[" + twodmap[i][j] + "]" + ANSI_RESET);
                }
                else if (twodmap[i][j]==maxs){
                    System.out.print(ANSI_PURPLE +"[" + twodmap[i][j] + "]" + ANSI_RESET);
                }
                else {System.out.print("[" + twodmap[i][j] + "]");}
            }
            System.out.println();
        }

        System.out.println(ANSI_GREEN + "[" + twodmap[20][20] + "]" + ANSI_RESET + " - начальная точка пути");
        System.out.println(ANSI_PURPLE + "[" + maxs + "]" + ANSI_RESET + " - точка в которую чаще всего возвращались");
        System.out.println(ANSI_RED + "[" + 0 + "]" + ANSI_RESET + " - точка в которой объект ни разу не был");
    }
}
