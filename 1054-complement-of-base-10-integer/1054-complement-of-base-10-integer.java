class Solution {
    public int bitwiseComplement(int n) {
        String s="";
        while(n!=0){
            int dig=n%2;
            s+=dig;
            n/=2;
        }
        char[]ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='0'){
                ch[i]='1';
            }
            else if(ch[i]=='1'){
                ch[i]='0';
            }
        }
            String str="";
            for(int i=ch.length-1;i>=0;i--){
                str+=ch[i];
            }
            if(str.length()==0){
                return 1;
            }
            return Integer.parseInt(str,2);
        }
    }