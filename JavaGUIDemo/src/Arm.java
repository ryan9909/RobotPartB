import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Arm extends MyObject{

	// height:1x20 width:1x40
	private int height;
	private int width;
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	public void init(JTextArea txtrH, JTextArea txtrW, JFrame frame) {
		height = 1;
		width = 1;
		txtrH.setText("h=" + String.valueOf(height));
		txtrH.setBounds(30, 280 - 20 * height, 40, 20 * height);
		txtrH.update(txtrH.getGraphics());
		txtrW.setText("w="+ String.valueOf(width));
		txtrW.setBounds(70, 280 - 20 * height, 40 * width, 20);
		txtrW.update(txtrW.getGraphics());
		frame.getContentPane().update(frame.getContentPane().getGraphics());
	}
	public Arm(JTextArea txtrH, JTextArea txtrW, JFrame frame) {
		super();
		height = 1;
		width = 1;
	}
	public void extand(JTextArea txtrH, JTextArea txtrW, JFrame frame, int targetheight) {
		while(height <= targetheight){
			height = height + 1;
			txtrH.setText("h=" + String.valueOf(height));
			txtrH.setBounds(30, 280-20*height, 40, 20 * height);
			txtrH.update(txtrH.getGraphics());
			txtrW.setText("w="+ String.valueOf(width));
			txtrW.setBounds(70, 280-20*height, 40 * width, 20);
			txtrW.update(txtrW.getGraphics());
			frame.getContentPane().update(frame.getContentPane().getGraphics());
			for (int j=1; j<=10000; j++) {
				if (getModeDebug()) System.out.print(j);
			}
		}
		while(width < 9){
			width = width + 1;
			txtrW.setText("w="+ String.valueOf(width));
			txtrW.setBounds(70, 280-20 * height, 40 * width, 20);
			txtrW.update(txtrW.getGraphics());
			frame.getContentPane().update(frame.getContentPane().getGraphics());
			for (int j=1; j<=10000; j++) {
				if (getModeDebug()) System.out.print(j);
			}
		}
	}
	public void withdraw(JTextArea txtrH, JTextArea txtrW, JFrame frame, ObjectBlock block, ObjectStack bar) {

		while(width > bar.getSlot() ){
			int x = block.getObj().getX();
			int y = block.getObj().getY();
			int w = block.getObj().getWidth();
			int h = block.getObj().getHeight();

			width = width - 1;
			txtrW.setText("w="+ String.valueOf(width));
			txtrW.setBounds(70, txtrW.getY(), 40 * width, 20);
			block.getObj().setBounds(x - 40,y,w,h);

			txtrW.update(txtrW.getGraphics());
			block.getObj().update(block.getObj().getGraphics());
			frame.getContentPane().update(frame.getContentPane().getGraphics());
			for (int j=1; j<=10000; j++) {
				if (getModeDebug()) System.out.print(j);
			}
		}
		bar.push(block);
		while(height > bar.getTotalheight() + 1){
			int x = block.getObj().getX();
			int y = block.getObj().getY();
			int w = block.getObj().getWidth();
			int h = block.getObj().getHeight();

			height = height - 1;
			block.getObj().setBounds(x,y + 20,w,h);
			block.getObj().update(block.getObj().getGraphics());

			txtrH.setText("h=" + String.valueOf(height));
			txtrH.setBounds(30, 280 - 20 * height, 40, 20 * height);
			txtrH.update(txtrH.getGraphics());

			txtrW.setText("w="+ String.valueOf(width));
			txtrW.setBounds(70, 280 - 20 * height, 40, 20);
			txtrW.update(txtrW.getGraphics());

			frame.getContentPane().update(frame.getContentPane().getGraphics());
			for (int j=1; j<=10000; j++) {
				if (getModeDebug()) System.out.print(j);
			}
		}
	}
}
