class Solution {
    public int minimumPushes(String word) {
        int fre[] = new int[26];
        for(char ch:word.toCharArray()){
            fre[ch-'a']++;
        }
        Arrays.sort(fre);
        int n=fre.length;
        int rank=0;
        int ans=0;
        for(int i=n-1;i>=0;i--){
            if(fre[i]==0)
            break;

            ans+=((rank/8)+1)*fre[i];
            rank++;
        }
        return ans;

    }
}