class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n=pushed.length;
        Stack<Integer> result=new Stack<>();
        int j=0;
        for(int i=0;i<n;i++){
            result.push(pushed[i]);
            while(!result.isEmpty() && result.peek()==popped[j]){
                result.pop();
                j++;
            }
        }
        if(result.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}