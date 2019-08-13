import java.util.*;
public class Hw{



        public static int dynamic(int[] data, int pounds){
                int[][] cell = new int[data.length][pounds];
                for(int i = 0; i < cell.length; i ++){
                        for(int j = 0; j < cell[0].length; j ++){
                                try{
                                        cell[i][j] = Math.max(cell[i-1][j], cell[i - 1][j - data[i]] + values.get(data[i]));
                                }
                                catch(ArrayIndexOutOfBoundsException e){
                                        if(j + 1 >= data[i]){
                                                cell[i][j] = values.get(data[i]);
                                        }
                                        else{
                                                cell[i][j] = cell[i-1][j];
                                        }
                                }
                        }
                }
                int max = 0;
                for(int i = 0; i < cell.length; i ++){
                        if(cell[i][pounds - 1] > max){
                                max = cell[i][pounds - 1];
                        }
                }
                return max;
        }

        static HashMap<Integer, Integer> values = new HashMap<>();
        public static void main(String[] args) {
                values.put(1, 1500);
                values.put(3, 2000);
                values.put(4, 3000);

                int[] weights = {1, 4, 3};


                int n = dynamic(weights, 4);
                System.out.println(n);
        }
}
