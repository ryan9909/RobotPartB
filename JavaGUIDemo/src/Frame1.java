import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Frame1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField txtVar;

	private ObjectStack srcStack;
	private ObjectStack trgStack1;
	private ObjectStack trgStack2;
	private ObjectStack trgStack3;
	private ObjectStack trgStack4;
	private ObjectStack trgStack5;
	private ObjectStack trgStack6;
	private ObjectStack trgStack7;
	private ObjectStack trgStack8;

	private Arm arm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		srcStack = new ObjectStack(9);
		trgStack1 = new ObjectStack(1);
		trgStack2 = new ObjectStack(2);
		trgStack3 = new ObjectStack(3);
		trgStack4 = new ObjectStack(4);
		trgStack5 = new ObjectStack(5);
		trgStack6 = new ObjectStack(6);
		trgStack7 = new ObjectStack(7);
		trgStack8 = new ObjectStack(8);

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 618, 382);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JTextArea txtrH = new JTextArea();
		txtrH.setLineWrap(true);
		txtrH.setBackground(Color.PINK);
		txtrH.setText("h=13");
		txtrH.setBounds(30, 20, 40, 260);
		frame.getContentPane().add(txtrH);

		JTextArea txtrW = new JTextArea();
		txtrW.setBackground(Color.PINK);
		txtrW.setText("w=9");
		txtrW.setBounds(70, 20, 360, 20);
		frame.getContentPane().add(txtrW);

		textField = new JTextField();
		textField.setBackground(Color.BLACK);
		textField.setEditable(false);
		textField.setBounds(30, 280, 400, 8);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JTextArea txtrBar = new JTextArea();
		txtrBar.setLineWrap(true);
		txtrBar.setText("Bar2");
		txtrBar.setBackground(Color.CYAN);
		txtrBar.setBounds(150, 240, 40, 40);
		frame.getContentPane().add(txtrBar);
		trgStack3.push(new ObjectBlock(txtrBar,0,2));

		JTextArea txtrBar_1 = new JTextArea();
		txtrBar_1.setLineWrap(true);
		txtrBar_1.setBackground(Color.CYAN);
		txtrBar_1.setText("Bar3");
		txtrBar_1.setBounds(190, 220, 40, 60);
		frame.getContentPane().add(txtrBar_1);
		trgStack4.push(new ObjectBlock(txtrBar_1,0,3));

		JTextArea txtrBar_2 = new JTextArea();
		txtrBar_2.setText("Bar5");
		txtrBar_2.setBackground(Color.CYAN);
		txtrBar_2.setLineWrap(true);
		txtrBar_2.setBounds(230, 180, 40, 100);
		frame.getContentPane().add(txtrBar_2);
		trgStack5.push(new ObjectBlock(txtrBar_2,0,5));

		JTextArea txtrBar_3 = new JTextArea();
		txtrBar_3.setBackground(Color.CYAN);
		txtrBar_3.setLineWrap(true);
		txtrBar_3.setText("Bar7");
		txtrBar_3.setBounds(270, 140, 40, 140);
		frame.getContentPane().add(txtrBar_3);
		trgStack6.push(new ObjectBlock(txtrBar_3,0,7));

		JTextArea txtrBar_4 = new JTextArea();
		txtrBar_4.setLineWrap(true);
		txtrBar_4.setBackground(Color.CYAN);
		txtrBar_4.setText("Bar1");
		txtrBar_4.setBounds(310, 260, 40, 20);
		frame.getContentPane().add(txtrBar_4);
		trgStack7.push(new ObjectBlock(txtrBar_4,0,1));

		JTextArea txtrBar_5 = new JTextArea();
		txtrBar_5.setLineWrap(true);
		txtrBar_5.setBackground(Color.CYAN);
		txtrBar_5.setText("Bar3");
		txtrBar_5.setBounds(350, 220, 40, 60);
		frame.getContentPane().add(txtrBar_5);
		trgStack8.push(new ObjectBlock(txtrBar_5,0,3));

		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.BLUE);
		textArea.setText("3");
		textArea.setBounds(390, 220, 40, 60);
		frame.getContentPane().add(textArea);
		srcStack.push(new ObjectBlock(textArea,3,3));

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setText("1");
		textArea_1.setBackground(Color.YELLOW);
		textArea_1.setBounds(390, 200, 40, 20);
		frame.getContentPane().add(textArea_1);
		srcStack.push(new ObjectBlock(textArea_1,1,1));

		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBackground(Color.RED);
		textArea_2.setText("2");
		textArea_2.setBounds(390, 160, 40, 40);
		frame.getContentPane().add(textArea_2);
		srcStack.push(new ObjectBlock(textArea_2,2,2));

		JTextArea textArea_3 = new JTextArea();
		textArea_3.setText("3");
		textArea_3.setBackground(Color.BLUE);
		textArea_3.setBounds(390, 100, 40, 60);
		frame.getContentPane().add(textArea_3);
		srcStack.push(new ObjectBlock(textArea_3,3,3));

		JTextArea textArea_4 = new JTextArea();
		textArea_4.setText("1");
		textArea_4.setBackground(Color.YELLOW);
		textArea_4.setBounds(390, 80, 40, 20);
		frame.getContentPane().add(textArea_4);
		srcStack.push(new ObjectBlock(textArea_4,1,1));

		JTextArea textArea_5 = new JTextArea();
		textArea_5.setText("1");
		textArea_5.setBackground(Color.YELLOW);
		textArea_5.setBounds(390, 60, 40, 20);
		frame.getContentPane().add(textArea_5);
		srcStack.push(new ObjectBlock(textArea_5,1,1));

		JTextArea textArea_6 = new JTextArea();
		textArea_6.setText("1");
		textArea_6.setBackground(Color.YELLOW);
		textArea_6.setBounds(390, 40, 40, 20);
		frame.getContentPane().add(textArea_6);
		srcStack.push(new ObjectBlock(textArea_6,1,1));

		txtVar = new JTextField();
		txtVar.setEnabled(false);
		txtVar.setText("MessageForDebug");
		txtVar.setBackground(Color.MAGENTA);
		txtVar.setBounds(445, 22, 126, 19);
		frame.getContentPane().add(txtVar);
		txtVar.setColumns(10);

		JButton btnDemoStart = new JButton("Demo Start");
		btnDemoStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				arm.init(txtrH, txtrW, frame);

				for (int i=1; i<=200; i++) {
					txtVar.setText(String.valueOf(i));
					txtVar.update(txtVar.getGraphics());
				}
				while (!srcStack.isEmpty()) {
					arm.extand(txtrH, txtrW, frame,srcStack.getTotalheight());
					ObjectBlock block = srcStack.pop();
					switch (block.getColor()) {
					case 1:
						arm.withdraw(txtrH, txtrW, frame, block, trgStack1);
						break;
					case 2:
						arm.withdraw(txtrH, txtrW, frame, block, trgStack2);
						break;
					case 3:
						if (!trgStack3.isFilled()) {
							arm.withdraw(txtrH, txtrW, frame, block, trgStack3);
						} else if (!trgStack4.isFilled()) {
							arm.withdraw(txtrH, txtrW, frame, block, trgStack4);
						} else if (!trgStack5.isFilled()) {
							arm.withdraw(txtrH, txtrW, frame, block, trgStack5);
						} else if (!trgStack6.isFilled()) {
							arm.withdraw(txtrH, txtrW, frame, block, trgStack6);
						} else if (!trgStack7.isFilled()) {
							arm.withdraw(txtrH, txtrW, frame, block, trgStack7);
						} else if (!trgStack8.isFilled()) {
							arm.withdraw(txtrH, txtrW, frame, block, trgStack8);
						}
						break;
					case 0:
					default:

					}
				}
			}
		});
		btnDemoStart.setBackground(Color.LIGHT_GRAY);
		btnDemoStart.setBounds(452, 259, 91, 21);
		frame.getContentPane().add(btnDemoStart);

		arm = new Arm(txtrH, txtrW, frame);

	}
}
