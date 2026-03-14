class Solution {
    ArrayList<String>res=new ArrayList<>();
    public void backtrack(int n,int k,StringBuilder sb){
        if(sb.length()==n){
            res.add(sb.toString());
            return;
        }
        if(sb.isEmpty()||sb.charAt(sb.length()-1)!='a'){
            sb.append("a");
            backtrack(n,k,sb);
            sb.deleteCharAt(sb.length()-1);
        }

        if(sb.isEmpty()||sb.charAt(sb.length()-1)!='b'){
            sb.append("b");
            backtrack(n,k,sb);
            sb.deleteCharAt(sb.length()-1);
        }

        if(sb.isEmpty()||sb.charAt(sb.length()-1)!='c'){
            sb.append("c");
            backtrack(n,k,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public String getHappyString(int n, int k) {
        StringBuilder sb=new StringBuilder();
        backtrack(n,k,sb);
        return res.size()<k?"":res.get(k-1);
    }
}