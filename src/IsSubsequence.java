public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0,j = 0;
        StringBuffer sb = new StringBuffer();

        if(s.length()<1){
            return true;
        }

        while(i<s.length()){
            while(j<t.length() && i<s.length()){
                if(s.charAt(i)==t.charAt(j)){
                    sb.append(t.charAt(j));
                    j++;
                    break;
                }
                else{
                    j++;
                }
            }
            i++;

        }
        if(sb.length()==s.length()){
            return true;
        }
        return false;
    }
}
