package fjnu.demo;

import java.util.ArrayList;
import java.util.List;

public class QueueSimulate {

	private List<Object> queue;
	
	public QueueSimulate(){
		this.queue = new ArrayList<Object>();
	}
	
	public void add(Object element){
		synchronized (queue) {
			this.queue.add(element);
			System.out.println("队列数据添加成功！当前队列内数据个数为：" + queue.size());
		}
	}
	
	public void remove(){
		synchronized (queue) {
			if(queue.isEmpty()){
				System.out.println("当前队列不存在数据！无法出队列！");
			}else{
				System.out.print("出队列成功！出队列的元素为:" + queue.get(0).toString() + " ");
				queue.remove(0);
				System.out.println("当前队列元素个数为：" + queue.size());
			}
		}
	}
	
	public void showStack(){
		for(int i = 0;i < queue.size();i ++){
			System.out.println("元素" + (i+1) + "为：" + queue.get(i).toString());
		}
	}
	
	public static void main(String[] args) {
		QueueSimulate queue = new QueueSimulate();
		queue.add("字符串");
		queue.add(123);
		queue.remove();
		queue.add('a');
		queue.add(true);
		queue.remove();
		queue.showStack();
	}
	
}
