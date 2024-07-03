public class ReverseVowelOfaString {
    public String reverseVowels(String s) {
        StringBuffer sb = new StringBuffer();
        StringBuffer vow = new StringBuffer();

        sb.append(s);
        int i = 0;
        while(i<sb.length()){
            if(sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o'  || sb.charAt(i) == 'u' || sb.charAt(i) == 'A' || sb.charAt(i) == 'E' || sb.charAt(i) == 'I' || sb.charAt(i) == 'O' || sb.charAt(i) == 'U'){
                vow.append(sb.charAt(i));
            }
            i++;
        }
        vow.reverse();


        i = 0;
        int j = 0;
        while(i<sb.length()){
            if(sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o' || sb.charAt(i) == 'u' || sb.charAt(i) == 'A' || sb.charAt(i) == 'E' || sb.charAt(i) == 'I' || sb.charAt(i) == 'O' || sb.charAt(i) == 'U'){
                sb.setCharAt(i,vow.charAt(j));
                j++;

            }
            i++;

        }
        return sb.toString();
    }
}
