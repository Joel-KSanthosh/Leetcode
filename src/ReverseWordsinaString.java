public class ReverseWordsinaString {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        StringBuffer sb = new StringBuffer();
        int i;
        for(i = arr.length-1; i>0;i--){
            sb.append(arr[i]+" ");
        }
        sb.append(arr[i]);
        return sb.toString();
    }
}
