package newcode;

public class InversePairs {
    public int InversePairs2(int [] array) {
        int count = 0;
        for(int i = 0 ; i < array.length ; i++){
            int res = 0;
            for(int j = i + 1 ; j <array.length ; j++){
                if(array[j] < array[i]){
                    res ++;
                    continue;
                }else continue;
            }
            count += res;
        }
        return count % 1000000007;
    }
    //正解 利用归并排序的思想
    public int InversePairs(int [] array) {
        //不存在逆序对直接返回
        if(array==null || array.length<=0){
            return 0;
        }
        //归并排徐
        int pairsNum=mergeSort(array,0,array.length-1);
        //返回
        return pairsNum;
    }

    public int mergeSort(int[] array,int left,int right){
        if(left==right){
            return 0;
        }
        int mid=(left+right)/2;
        //分治
        int leftNum=mergeSort(array,left,mid);
        int rightNum=mergeSort(array,mid+1,right);
        //返回
        return (Sort(array,left,mid,right)+leftNum+rightNum)%1000000007;
    }

    public int Sort(int[] array,int left,int middle,int right){
        int current1=middle;
        int current2=right;
        int current3=right-left;
        //辅助数组
        int temp[]=new int[right-left+1];
        int pairsnum=0;
        while(current1>=left && current2>=middle+1){
            //左边大于右边 构成了逆序对
            if(array[current1]>array[current2]){
                temp[current3--]=array[current1--];
                //个数是右边位置 - 中间位置
                pairsnum+=(current2-middle);     //这个地方是current2-middle！！！！
                if(pairsnum>1000000007)//数值过大求余
                {
                    pairsnum%=1000000007;
                }
            }else{
                temp[current3--]=array[current2--];
            }
        }
        while(current1>=left){
            temp[current3--]=array[current1--];
        }
        while(current2>=middle+1){
            temp[current3--]=array[current2--];
        }
        //将临时数组赋值给原数组
        int i=0;
        while(left<=right){
            array[left++]=temp[i++];
        }
        //返回
        return pairsnum;
    }
}
