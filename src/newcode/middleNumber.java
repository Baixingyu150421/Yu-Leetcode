package newcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class middleNumber {

    class minHeapComparartor implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
    }

    class maxHeapComparartor implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }
    //优先级队列就是堆结构
    PriorityQueue<Integer> maxHeap = null;

    PriorityQueue<Integer> minHeap = null;
    public middleNumber(){
        maxHeap = new PriorityQueue<Integer>(new maxHeapComparartor());
        minHeap = new PriorityQueue<Integer>(new minHeapComparartor());
    }
    public void Insert(Integer num) {
        if(maxHeap.isEmpty()|| num < maxHeap.peek() ){
            maxHeap.add(num);
        }else {
            minHeap.add(num);
        }
        modifyHeap();
    }


    public Double GetMedian() {
        if(maxHeap.isEmpty()){
            return null;
        }
        if(maxHeap.size() == minHeap.size()){
            return (double)(minHeap.peek() + maxHeap.peek())/2;
        }else {
            return maxHeap.size() > minHeap.size() ?(double) maxHeap.peek() : (double)minHeap.peek();
        }
    }
    private void modifyHeap(){
        if(maxHeap.size() == minHeap.size() + 2){
            minHeap.add(maxHeap.poll());
        }
        if(minHeap.size() == maxHeap.size() + 2){
            maxHeap.add(minHeap.poll());
        }
    }
}
