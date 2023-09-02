//String token for reading and counting token
package main.Main.it.unipd.dei.eis;

import java.util.ArrayList;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class CountingWords {
    public void CountingTokens(String Title, String bodyArticle) {
        StringTokenizer strTitle = new StringTokenizer(Title);
        StringTokenizer strBodyArticle = new StringTokenizer(bodyArticle);
        ArrayList<String> list = new ArrayList<>();
        Map<String, Integer> map = new TreeMap<>();
        int count = 0;
        while (strTitle.hasMoreTokens()) {
            list.add(strTitle.nextToken());
        }
        while (strBodyArticle.hasMoreTokens()){
            list.add(strBodyArticle.nextToken());
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
            }
            map.put(list.get(i), count);
            System.out.println(map + "\n");
            count=0;
            break;
        }

    }
}