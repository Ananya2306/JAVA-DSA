package Queues.QueueImplement;

public class QueueUse {
	public static void main(String[] args) throws QueueFullException {
		// TODO Auto-generated method stub
		QueueUsingArray queue= new QueueUsingArray();
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
