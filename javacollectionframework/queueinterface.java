package javacollectionframework;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Deque;

public class queueinterface {
    public static void main(){
        //queue interface as linkedlist
        Queue<Integer> q = new LinkedList<>();

        q.offer(10);
        q.offer(17);
        q.offer(50);
        q.offer(90);
        System.out.println(q);

        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());

        //queue as arraydeque

        Deque<Integer> qd = new ArrayDeque<>();
        qd.offerLast(56);
        qd.offerFirst(23);
       System.out.println(qd);

       qd.pollFirst();
       System.out.println(qd);

       //queue as priorityqueue
       Queue<Integer> pq=new PriorityQueue<>();
       pq.add(10);
       pq.add(10);
       pq.add(10);
       pq.add(20);
       pq.add(10);
       System.out.println(pq);




    }
}
