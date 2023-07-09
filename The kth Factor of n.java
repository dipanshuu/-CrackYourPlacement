class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                a.add(i);
            }
        }
        Collections.sort(a);
        if(k>a.size())
        return -1;
        for(int i=0;i<k;i++){
            if(i==k-1)
            return a.get(i);
        }
        return -1;
    }
}