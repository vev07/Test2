package Classes;

public class ArrayMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{15,68,9,48,498,496,69,4},{44,66},{166,454,5,6,7}};


        for (int x = 0; x<matrix.length;x++){
            for (int y = 0; y<matrix[x].length; y++){
                System.out.print(matrix[x][y]+" ");

            } System.out.println();



        }
        System.out.println();
        String [][] people = {{"Pasha", "Fedy", "Grisha"},{"Misha","Valy","Galy"}, {"Nady","Lily"}};

        for (int x = 0; x<people.length; x++){
            for (int y = 0; y<people[x].length; y++){
                System.out.print(people[x][y]+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------");
        int[][] superNumber = {{1,5},{9,4,23,566,7},{18,1565,455555,4}};
        for (int x = 0; x< superNumber.length; x++){
            for (int y = 0; y<superNumber[x].length; y++){
                System.out.print(superNumber[x][y]+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------------");
        String[][] ss = {{"tfuy","olk","UOIHUOIH"},{"JH","jh","Gkkkk"},{"gY","Dre"}};
        for (int x = 0; x< ss.length; x++){
            for (int y = 0; y<ss[x].length; y++){
                System.out.print(ss[x][y]+" ");
            }
            System.out.println();
        }

    }

}
