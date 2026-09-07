class Solution {
    public boolean isValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        String p1 = "()";
        String p2 = "{}";
        String p3 = "[]";
        int idx;
        while ((idx = sb.indexOf(p1)) != -1 
                || (idx = sb.indexOf(p2)) != -1 
                || (idx = sb.indexOf(p3)) != -1) {

            if ((idx = sb.indexOf(p1)) != -1) {
                sb.delete(idx, idx + 2);
            } else if ((idx = sb.indexOf(p2)) != -1) {
                sb.delete(idx, idx + 2);
            } else if ((idx = sb.indexOf(p3)) != -1) {
                sb.delete(idx, idx + 2);
            }
        }
        return sb.length() == 0;
    }
}