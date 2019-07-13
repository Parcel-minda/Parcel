package Parcel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Send_deletewrong extends JFrame {
	JLabel 删除成功 = new JLabel("\u62B1\u6B49\uFF0C\u8FD9\u4E2A\u8BA2\u5355\u4E0D\u5B58\u5728\uFF01");
	JButton 返回菜单 = new JButton("\u8FD4\u56DE\u83DC\u5355");
	JButton 返回主页 = new JButton("\u8FD4\u56DE\u4E3B\u9875");
	
	public void deletewrong(final A_allinformation all,final String usertele){
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
			public void actionPerformed(ActionEvent e) {
				dispose();
				Send_menu a=new Send_menu();
				a.menu(all,usertele);
				a.setVisible(true);
				
			}
		});
		返回主页.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
	public Send_deletewrong() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 449, 201);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		删除成功.setFont(new Font("宋体", Font.BOLD, 24));
		删除成功.setBounds(78, 35, 288, 29);
		getContentPane().add(删除成功);
		
	
		返回菜单.setBounds(56, 101, 123, 29);
		getContentPane().add(返回菜单);
		
		
		返回主页.setBounds(230, 101, 123, 29);
		getContentPane().add(返回主页);
	}

}
