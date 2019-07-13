package Parcel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class B_comment extends JFrame{
	JLabel 待评价 = new JLabel("\u5F85\u8BC4\u4EF7");
	JButton 评价 = new JButton("\u8BC4\u4EF7");
	JButton 返回 = new JButton("\u8FD4\u56DE");
	
	public void B_comment(final A_allinformation all,final String usertele){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		返回.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				B_order a=new B_order();
				a.B_order(all,usertele);
				a.setVisible(true);
			}
		});
	}
	public B_comment() {
		this.setTitle("增加订单");
		initialize();
	}
	private void initialize() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		待评价.setFont(new Font("宋体", Font.BOLD, 24));
		待评价.setBounds(169, 10, 100, 30);
		getContentPane().add(待评价);
		
		
		评价.setFont(new Font("宋体", Font.BOLD, 20));
		评价.setBounds(59, 223, 100, 30);
		getContentPane().add(评价);
		
		
		
		返回.setFont(new Font("宋体", Font.BOLD, 20));
		返回.setBounds(258, 223, 100, 30);
		getContentPane().add(返回);
	}

}
