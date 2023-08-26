// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer> hm=new HashMap<>();
        int ans=-1;
        int i=0;
        for(int j=0;j<s.length();j++){
          hm.put(s.charAt(j),hm.getOrDefault(s.charAt(j),0)+1);
            if(hm.size()==k)
            {
                ans=Math.max(ans,j-i+1);
                 
            }
            else if(hm.size()>k){
                while(hm.size()>k){
                    hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)-1);
                    if(hm.get(s.charAt(i))==0)hm.remove(s.charAt(i));
                    i++;
                }
              
            }
            // System.out.println(hm);
        }
        return ans;
    }
}
