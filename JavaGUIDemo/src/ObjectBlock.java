import javax.swing.JTextArea;

public class ObjectBlock extends MyObject{
	// 1:yellow   2:red  3:Blue 0:unused
	private int color;
	// height:1x20 width:1x40
	private int height;

	private JTextArea obj;

	public JTextArea getObj() {
		return obj;
	}
	public void setName(JTextArea obj) {
		this.obj = obj;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public int getHeight() {
		return height;
	}
	public ObjectBlock(JTextArea obj, int color, int height) {
		super();
		this.obj = obj;
		this.color = color;
		this.height = height;
	}
	public void setHeight(int height) {
		this.height = height;
	}


}