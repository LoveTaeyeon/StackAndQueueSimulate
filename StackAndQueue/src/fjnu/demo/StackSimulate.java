package fjnu.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author LoveTaeyeon<p>
 * 栈模拟，仅仅模仿add和remove<p>
 * 先进后出
 */
public class StackSimulate {

	private List<Object> stack;
	
	public StackSimulate(){
		this.stack = new ArrayList<Object>();
	}
	
	public void add(Object element){
		synchronized (stack) {
			this.stack.add(element);
			System.out.println("栈添加数据成功!当前栈内元素个数为：" + stack.size());
		}
	}
	
	public void remove(){
		synchronized (stack) {
			if(stack.isEmpty()){
				System.out.println("当前栈内没有元素，无法进行弹出！");
			}else{
				System.out.print("栈顶元素弹出成功!弹出的元素为：" + stack.get(stack.size()-1).toString() + " ");
				stack.remove(stack.size()-1);
				System.out.println("当前元素个数为：" + stack.size());
			}
		}
	}
	
	public void showStack(){
		for(int i = 0;i < stack.size();i ++){
			System.out.println("元素" + (i+1) + "为：" + stack.get(i).toString());
		}
	}
	
	public static void main(String[] args) {
		StackSimulate stack = new StackSimulate();
//		stack.add("字符串");
//		stack.add(123);
//		stack.add(true);
		stack.remove();
		stack.showStack();
		stack.add('a');
		stack.remove();
		stack.showStack();
	}
	
}
