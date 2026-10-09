class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();

        int i = s.length()-1;

        while(i >= 0){
            // remove spaces
            while(i >= 0 && s.charAt(i) == ' '){
                i--;
            }
            if(i < 0){
                break;
            }
            int j = i;
            // find the start index of the word
            while(j >= 0 && s.charAt(j) != ' '){
                j--;
            }
            // jaise hi j spcace wale index pr aaya to ruk jayega
            // ab is word ko  apne ans me appecnd krdena
            ans.append(s.substring(j+1, i+1));
            // remove space 
            while(j >= 0 && s.charAt(j) == ' '){
                j--;
            }  
            // j < 0 iska mtlb first word k upar tha main -> no space needed
            // j >= 0 , space needed
            if(j >= 0){
                ans.append(' ');
            }
            // place i at last index of the remainging string
            i = j;
        }
        return ans.toString();
    }
}