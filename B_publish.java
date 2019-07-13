package Parcel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class B_publish extends JFrame{

	JLabel 待发布订单 = new JLabel("\u5F85\u53D1\u5E03\u8BA2\u5355");
	JButton 发布 = new JButton("\u53D1\u5E03");
	JButton 删除 = new JButton("\u5220\u9664");
	JButton 返回 = new JButton("\u8FD4\u56DE");
	
	public void B_publish(final A_allinformation all,final String usertele){
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
	
	public B_publish() {
		this.setTitle("增加订单");
		initialize();
	}
	private void initialize(){
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		待发布订单.setFont(new Font("宋体", Font.BOLD, 24));
		待发布订单.setBounds(138, 10, 221, 40);
		getContentPane().add(待发布订单);
		
		
		发布.setFont(new Font("宋体", Font.BOLD, 20));
		发布.setBounds(34, 230, 100, 30);
		getContentPane().add(发布);
		
		
		删除.setFont(new Font("宋体", Font.BOLD, 20));
		删除.setBounds(167, 230, 100, 30);
		getContentPane().add(删除);
		
		
		
		返回.setFont(new Font("宋体", Font.BOLD, 20));
		返回.setBounds(293, 230, 100, 30);
		getContentPane().add(返回);
	}

}
