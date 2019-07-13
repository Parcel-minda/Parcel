package Parcel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Send_innum extends JFrame {
	private JTextField textField;
	JButton 确认 = new JButton("\u786E\u8BA4");
	JButton 返回 = new JButton("\u8FD4\u56DE");
	private final JLabel label = new JLabel("\u8BF7\u8F93\u5165\u8981\u4FEE\u6539\u7684\u8BA2\u5355\u7F16\u53F7");
	
	public void innum(final A_allinformation all,final String usertele){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		确认.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Send_update a=new Send_update();
				a.update(all,usertele);
				a.setVisible(true);
				
			}
		});
		返回.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Send_menu a=new Send_menu();
				a.menu(all,usertele);
				a.setVisible(true);
			
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Send_innum() {
		this.setTitle("修改编号");
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(91, 102, 220, 30);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		确认.setBounds(61, 200, 123, 29);
		getContentPane().add(确认);
		
		
		
		返回.setBounds(222, 200, 123, 29);
		getContentPane().add(返回);
		label.setFont(new Font("宋体", Font.PLAIN, 20));
		label.setBounds(91, 57, 220, 30);
		
		getContentPane().add(label);
	}
}
