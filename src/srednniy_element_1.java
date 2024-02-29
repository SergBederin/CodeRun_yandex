/*Рассмотрим три числа a,b и c. Упорядочим их по возрастанию.
Какое число будет стоять между двумя другими?
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class srednniy_element_1 {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String[] inputNums = reader.readLine().split(" ");
    int[] num = new int[inputNums.length];
    int[] sortNuw;

    public srednniy_element_1() throws IOException {
    }

    void inputNums() throws IOException {
        for (int i = 0; i < num.length; i++) {

            num[i] = Integer.parseInt(inputNums[i]);
        }
        sortNuw = Arrays.stream(num).sorted().toArray();

        System.out.println(sortNuw[1]);
        reader.close();
    }

}

