class Solution {
    public int romanToInt(String s) {
        int result=0;
        for(int i=0;i<s.length();i++){
            int c=value(s.charAt(i));
            if(i+1<s.length()&&c<value(s.charAt(i+1))){
            result-=c;
            }else
            {
                result+=c;
            }
           }
           return result;
    }
    int value(char d){
        if(d=='I')return 1;
        if(d=='V')return 5;
        if(d=='X')return 10;
        if(d=='L')return 50;
        if(d=='C')return 100;
        if(d=='D')return 500;
        if(d=='M')return 1000;
        return 0;
    }

}