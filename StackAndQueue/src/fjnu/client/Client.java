package fjnu.client;

import fjnu.demo.QueueSimulate;

public class Client {

	public static void main(String[] args) {
		QueueSimulate queue = new QueueSimulate();
		QueueRemove remove = new QueueRemove(queue);
		QueueAdd add = new QueueAdd(queue);
		new Thread(add).start();
		new Thread(remove).start();
	}
	
}


