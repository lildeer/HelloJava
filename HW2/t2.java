package HW2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//у меня такое ощущение, что я тут пошел каким-то "чизовым" путем, сначала распарсил строку просто по принципу кавычек, азбираю  нужные элементы по номерам
//потом в другом методе с помощью Стрингбилдера вставляем сразу на нужные позиции элементы
public class t2 {
    public static void main(String[] args) throws IOException {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/HW2/list.txt");
        File file = new File(pathFile);
        BufferedReader bufReader = new BufferedReader(new FileReader(file));

        String line = bufReader.readLine();
        while (line != null) {
            
        
        List<String> qwe = getarg(Arrays.asList(line.split("\"")));

        System.out.println(MakeAStr(qwe));
        line = bufReader.readLine();
        }

        bufReader.close();
    }

    public static List<String> getarg(List<String> parts) {
        List<String> onlyarg = new ArrayList<>();

        for (int i = 3; i < parts.size(); i = i + 4) {//забираем только нужные нам аргументы из строки, это 3, 7 и 11
            onlyarg.add(parts.get(i));
        }

        return onlyarg;
    }

    public static String MakeAStr(List<String> str) {
        StringBuilder str1 = new StringBuilder("Студент  получил  по предмету .");
        int[] getInd = { 8, 17, 30};
        for (int i = str.size()-1; i >= 0; i--) {
            str1.insert(getInd[i], str.get(i));
        }
        return str1.toString();

    }
}
