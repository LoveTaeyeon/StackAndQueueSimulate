package fjnu.client;

import fjnu.demo.QueueSimulate;

public class QueueAdd implements Runnable{
	
	private QueueSimulate queue;
	
	public QueueAdd(QueueSimulate queue){
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			add(queue,'a');
		}
	}
	
	public void add(QueueSimulate queue,Object element){
		queue.add(element);
	}
}
