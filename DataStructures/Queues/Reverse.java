package Queues;

import java.util.Scanner;

import Queues.QueueImplement.QueueEmptyException;
import Queues.QueueImplement.QueueUsingLL;

public class Reverse {
    public static QueueUsingLL<Integer> takeInput() 
    {
        Scanner sr = new Scanner(System.in);
        
    	int size = sr.nextInt();
    	QueueUsingLL<Integer> input = new QueueUsingLL<>();

    	

    	for(int i = 0; i < size; i++) 
    	{
    	    int var = sr.nextInt();
    		input.enqueue(var);
    	}
    	sr.close();
    	return input;
    }
	
	public static void Rev(QueueUsingLL<Integer> data) throws QueueEmptyException {
		if(data.isEmpty()) {
			return;
		}
		int front = data.dequeue();
		Rev(data);
		data.enqueue(front);
	}

	public static void main(String[] args) throws QueueEmptyException {
		
		QueueUsingLL<Integer> input = takeInput();
		//QueueUsingLL<Integer> data = new QueueUsingLL<Integer>();
		Rev(input);
		while(!input.isEmpty()) {
			System.out.print(input.dequeue() +" ");
		}

	

	}
}
