class Solution {
    public boolean isAnagram(String s, String t) {

        char [] sL = s.toCharArray();
        char [] tL = t.toCharArray();

        Arrays.sort(sL);
        Arrays.sort(tL);

        if (sL.length != tL.length){
            return false;
        }
        
        for(int i = 0; i < sL.length; i++){
            if (sL[i] != tL[i]){
                return false;
            }
        }
        return true;
    }
}
