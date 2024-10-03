class Solution {
    public int solution(String[] spell, String[] dic) {
        for (int i = 0; i < dic.length; i++) {
            if (fun(spell,dic[i])){
                return 1;
            }
        }
        return 2;
    }

    public boolean fun(String[] spell, String dic){
        int cnt = 0;

        if (dic.length() == spell.length){
            for (int i = 0; i < spell.length; i++) {
                if (dic.contains(spell[i])){
                    cnt++;
                }
            }
            if (cnt == spell.length){
                return true;
            }
        }
        return false;
    }
}