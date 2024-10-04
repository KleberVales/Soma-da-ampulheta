package ampulheta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class EncontrarSoma {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        
        int maxHourGlassSum = Integer.MIN_VALUE;
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                int hourGlassSum = arr.get(y).get(x) + arr.get(y).get(x + 1) + arr.get(y).get(x + 2) +
                                            + arr.get(y + 1).get(x + 1) +
                        arr.get(y + 2).get(x) + arr.get(y + 2).get(x + 1) + arr.get(y + 2).get(x + 2);
    
                maxHourGlassSum = Math.max(maxHourGlassSum, hourGlassSum);
            }
        }
        
        System.out.println(maxHourGlassSum);
        

        bufferedReader.close();
    }
}