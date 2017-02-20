package fjnu.client;

import fjnu.demo.QueueSimulate;

public class QueueRemove implements Runnable{
	
	private QueueSimulate queue;
	
	public QueueRemove(QueueSimulate queue){
		this.queue = queue;
	}
	
	@Override
	public void run() {
		while(true){
			remove(queue);
		}
	}
	
	public void remove(QueueSimulate queue){
		queue.remove();
	}
	
}
