public class MaximumNumberofVowelsinaSubstringGivenLength {
    public int maxVowels(String s, int k) {
        if(s.length()<k){
            return 0;
        }
        int count = 0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }



        int max = count;
        int i = 0;
        int j = k;

        if(max==k){
            return k;
        }

        while(j<s.length()){
            if(isVowel(s.charAt(i))){
                count--;
            }

            i++;

            if(isVowel(s.charAt(j))){
                count++;
            }
            j++;


            max = Math.max(max,count);
        }
        return max;
    }

    public boolean isVowel(char sb){
        if(sb == 'a' || sb == 'e' || sb == 'i' || sb == 'o' || sb == 'u'){
            return true;
        }
        return false;
    }
}
