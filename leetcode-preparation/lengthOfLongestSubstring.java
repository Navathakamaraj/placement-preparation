public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        String longs="";
        for(int i=0;i<n;i++){
            String r=s.charAt(i)+""; 
            for(int j=i+1;j<n;j++){
                if (r.indexOf(s.charAt(j)) == -1) { 
                    r+=s.charAt(j);
                    if(longs.length()<r.length()){
                        longs=r;
                    }
                
            }
            else{
                break;
            }
        }
        if(longs.length()==0){
                        longs=r;
                }
        
    }
    return longs.length();
    }
}