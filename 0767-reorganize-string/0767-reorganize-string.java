class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<int[]>pq=new PriorityQueue<>(
            (a,b)->b[0]-a[0]
        ) ;
        for(char key:map.keySet()){
            pq.add(new int[] {map.get(key),key});
        }
        StringBuilder sb= new StringBuilder();
        int[] prev=null;

        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            sb.append((char)curr[1]);
            curr[0]--;
            if(prev!=null && prev[0]>0){
                pq.add(prev);
            }
            prev=curr;
        }
        String ans=sb.toString();
        if(ans.length()==s.length()){
            return ans;
        }else{
            return "";
        }

    }

}