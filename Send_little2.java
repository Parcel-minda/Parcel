package Parcel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Send_little2 extends JFrame{
	JButton 返回菜单 = new JButton("\u8FD4\u56DE\u83DC\u5355");
	JButton 返回主页 = new JButton("\u8FD4\u56DE\u4E3B\u9875");
	private final JLabel label = new JLabel("\u4FEE\u6539\u4FE1\u606F\u6210\u529F\uFF01");
	
	public void little2(final A_allinformation all,final String usertele){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		返回菜单.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Send_menu a=new Send_menu();
				a.menu(all,usertele);
				a.setVisible(true);
				dispose();
			}
		});
		返回主页.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				B_center center=new B_center();
				center.center_main(all,usertele);
				center.setVisible(true);
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Send_little2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 449, 201);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		
		返回菜单.setBounds(55, 88, 123, 29);
		getContentPane().add(返回菜单);
		
		
		返回主页.setBounds(231, 88, 123, 29);
		getContentPane().add(返回主页);
		label.setFont(new Font("宋体", Font.BOLD, 24));
		label.setBounds(127, 28, 181, 45);
		
		getContentPane().add(label);
	}

}
