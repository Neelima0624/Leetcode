class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int right = 0;
        while(right< chars.length)
        {
            char curr = chars[right];
            int count = 0;
        while(right<chars.length && chars[right]==curr)
        {
            count=count+1;
            right=right+1;
        }
        chars[index] = curr;
        index = index+1;
        if(count>1)
        {
            String co = String.valueOf(count);
            for(char k:co.toCharArray())
            {
              chars[index] = k;
              index++;
            }
        }
    }
    return index;
    }
}