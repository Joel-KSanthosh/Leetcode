public class StringCompression {
    public int compress(char[] chars) {
        int len = chars.length;
        if(len==1){
            return 1;
        }
        int count = 1;
        StringBuffer sb = new StringBuffer();
        sb.append(chars[0]);
        for(int i = 1;i<len;i++){
            if(chars[i-1]==chars[i]){
                count++;
            }
            else{
                if(count!=1){
                    sb.append(count);
                    count=1;
                }
                sb.append(chars[i]);
            }
        }
        if(count!=1){
            sb.append(count);
        }

        for(int i=0;i<sb.length();i++){
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}
