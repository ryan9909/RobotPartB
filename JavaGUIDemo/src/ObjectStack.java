import java.util.Stack;

public class ObjectStack extends MyObject{
	// sumary of all the block in the stack
	private int count;
	private int countYRB;
	private int slot;
	private int totalheight;
	private Stack<ObjectBlock> stack;

	public ObjectStack(int slot) {
		super();
		this.slot = slot;
		count = 0;
		countYRB = 0;
		totalheight = 0;
		stack = new Stack<ObjectBlock>();
	}
	public int getCount() {
		return count;
	}
	public int getCountYRB() {
		return countYRB;
	}
	public int getTotalheight() {
		return totalheight;
	}
	public int getSlot() {
		return slot;
	}
	public void changeSlot(int slot) {
		this.slot = slot;
	}
	public boolean isEmpty() {
		return count == 0;
	}
	public boolean isFilled() {
		return countYRB != 0;
	}
	public void push(ObjectBlock obj) {
		stack.push(obj);
		totalheight = totalheight + obj.getHeight();
		count = count + 1;
		if ( obj.getColor() == 1 ||  obj.getColor() == 2 || obj.getColor() == 3) {
			countYRB = countYRB + 1;
		}
	}
	public ObjectBlock pop() {
		ObjectBlock obj = stack.pop();
		totalheight = totalheight - obj.getHeight();
		count = count - 1;
		return obj;
	}
}
