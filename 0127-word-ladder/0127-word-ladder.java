class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int n=wordList.size();

        HashSet<String> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(wordList.get(i));
        }
        if(!set.contains(endWord))
        return 0;

        Queue<Pair<String,Integer>> pq=new LinkedList<>();
        pq.add(new Pair<>(beginWord,1));

        while(!pq.isEmpty()){
            Pair<String,Integer> p=pq.poll();
            String s=p.getKey();
            int val=p.getValue();

            if(s.equals(endWord))
            return val;
            char[] arr=s.toCharArray();

            for(int i=0;i<arr.length;i++){
                char orginal=arr[i];
                for(char c='a';c<='z';c++){
                    if(c==orginal) 
                    continue;
                    arr[i]=c;

                    String next=new String(arr);
                    if(set.contains(next)){
                        pq.add(new Pair<>(next,val+1));
                        set.remove(next);
                    }

                }
                arr[i]=orginal;
            }
        }
        return 0;


        
    }
}