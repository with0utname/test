package list;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author tututyl
 * @Date 2022-02-21
 */
public class TestList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            list.add(i);
        }
        int gap = 50;
        for (int i = 0, j = 0; i < list.size(); ) {
            if (i + gap > list.size()) {
                i = list.size();
            } else {
                i += gap;
            }
            List<Integer> tempList = list.subList(j, i);
            for (int i1 = 0; i1 < tempList.size(); i1++) {
                System.out.println(tempList.get(i1));
            }
            j = i;
        }
    }
}
