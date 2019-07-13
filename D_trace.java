package Parcel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class D_trace extends JFrame{
	JLabel 登记成功 = new JLabel("\u8BE5\u529F\u80FD\u5C1A\u672A\u5B9E\u73B0\uFF01");
	JButton 确定 = new JButton("\u786E\u5B9A");
	/**
	 * Launch the application.
	 */
	public void trace(final A_allinformation all,final String usertele){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		确定.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				D_main a=new D_main();
				a.mimain(all,usertele);
			}
		});
	}

	/**
	 * Create the application.
	 */
	public D_trace() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 400, 195);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		登记成功.setFont(new Font("宋体", Font.BOLD, 24));
		登记成功.setBounds(93, 28, 244, 54);
		getContentPane().add(登记成功);
		确定.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		确定.setFont(new Font("宋体", Font.PLAIN, 20));
		
		
		确定.setBounds(107, 93, 158, 36);
		getContentPane().add(确定);
	}
}

