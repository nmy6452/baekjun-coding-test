
import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, List<String>> clotheMap = new HashMap<>();

        //Map 초기화
        for (String[] clothe : clothes) {
            if (clotheMap.containsKey(clothe[1])) {
                clotheMap.get(clothe[1]).add(clothe[0]);
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(clothe[0]);
                clotheMap.put(clothe[1], list);
            }
        }

        //경우의 수 계산
        List<Integer> clotheCase = new ArrayList<>();
        Set<String> KeyStore = clotheMap.keySet();

        for (String key: KeyStore){
            List<String> clotheList = clotheMap.get(key);
            clotheCase.add(clotheList.size()+1);
        }

        int result = clotheCase.remove(0);
        for (Integer item: clotheCase){
            result = result*item;
        }
        
        return result-1;
    }

}