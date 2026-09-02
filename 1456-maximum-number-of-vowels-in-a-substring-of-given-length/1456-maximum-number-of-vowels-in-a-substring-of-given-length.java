class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int left=0;
        int count=0;
        int max=0;
        
        for(int i=0;i<k;i++){
            if(vowel(s.charAt(i))==true){
                count++;
            }
        }
        max=count;

        for(int right=k;right<n;right++){
            if(vowel(s.charAt(right))==true){
                count++;

            }
            if(vowel(s.charAt(left))){
                count--;
            }
            left++;
            max=Math.max(count,max);

        }
        return max;
    }
    boolean vowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        return true;
        return false;
    }
}