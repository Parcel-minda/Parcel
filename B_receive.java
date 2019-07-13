package Parcel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class B_receive extends JFrame{

	JLabel 待收件 = new JLabel("\u5F85\u6536\u4EF6");
	JButton 查看 = new JButton("\u67E5\u770B");
	JButton 返回 = new JButton("\u8FD4\u56DE");
	
	public void B_receive(final A_allinformation all,final String usertele){
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
	public B_receive() {
		this.setTitle("增加订单");
		initialize();
	}
	private void initialize(){
		
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		待收件.setFont(new Font("宋体", Font.BOLD, 24));
		待收件.setBounds(175, 10, 100, 30);
		getContentPane().add(待收件);
		
		
		查看.setFont(new Font("宋体", Font.BOLD, 20));
		查看.setBounds(53, 223, 100, 30);
		getContentPane().add(查看);
		
		
		
		返回.setFont(new Font("宋体", Font.BOLD, 20));
		返回.setBounds(264, 223, 100, 30);
		getContentPane().add(返回);
	}

}

