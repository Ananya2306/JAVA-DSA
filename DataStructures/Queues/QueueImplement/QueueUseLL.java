package Queues.QueueImplement;

public class QueueUseLL {
    public static void main(String[] args) throws QueueEmptyException{
		
		QueueUsingLL<Integer> queue = new QueueUsingLL<Integer>();
		for(int i=1; i<=5; i++ ) {
			queue.enqueue(i);
			
		}
		while(!queue.isEmpty()) {
			
			try {
				System.out.println(queue.dequeue());
			}catch(QueueEmptyException e) {
				//System.out.println(stack.());
			}
		}
	}
}
