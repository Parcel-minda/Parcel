package Parcel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class B_center extends JFrame{
	JLabel label = new JLabel(" \u6635\u79F0\uFF1A");
	JButton 查看历史订单 = new JButton("\u67E5\u770B\u5386\u53F2\u8BA2\u5355");
	JButton 查看收货地址 = new JButton("\u67E5\u770B\u6536\u8D27\u5730\u5740");
	final JLabel 个人中心 = new JLabel("\u4E2A\u4EBA\u4E2D\u5FC3");
	final JLabel lblNewLabel_1 = new JLabel("\u7535\u8BDD\uFF1A");
	final JTextField 个人中心的框 = new JTextField();
	final JButton 修改个人信息 = new JButton("\u4FEE\u6539\u4FE1\u606F");
	JButton 我要取件 = new JButton("\u6211\u8981\u53D6\u4EF6");
	JButton 我要发件 = new JButton("\u6211\u8981\u53D1\u4EF6");
	
	
	public void center_main(final A_allinformation all,final String usertele){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		int i=0;
		JLabel 昵称 = null;
		JLabel 电话 = null;
		for(i=0;i<all.member.Memberarry.size();i++) {
			Y_Member g=all.member.Memberarry.get(i);
			if(g.telenum.contentEquals(usertele)) {
				昵称 = new JLabel(g.name);
		        电话 = new JLabel(g.telenum);
			}
		}
		昵称.setFont(new Font("仿宋", Font.BOLD, 24));
		昵称.setBounds(100, 214, 166, 32);
		getContentPane().add(昵称);
		
		电话.setFont(new Font("仿宋", Font.BOLD, 24));
		电话.setBounds(100, 251, 166, 40);
		getContentPane().add(电话);
		
		查看历史订单.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				B_order a=new B_order();
				a.B_order(all,usertele);
				a.setVisible(true);
			}
		});
		查看收货地址.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				B_address b=new B_address();
				b.B_address(all,usertele);
				b.setVisible(true);
			}
		});
		我要发件.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Send_main sendmain=new Send_main();
				sendmain.send_main(all,usertele);
				
			}
		});
		我要取件.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				D_main a=new D_main();
				a.mimain(all,usertele);
			}
		});
	}

	public B_center() {
		getContentPane().setFont(new Font("宋体", Font.BOLD, 24));
		个人中心的框.setBounds(117, 60, 98, 85);
		个人中心的框.setColumns(10);
		
		setBounds(100, 100, 345, 575);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		label.setFont(new Font("宋体", Font.BOLD, 24));
		label.setBounds(10, 214, 102, 40);
		getContentPane().add(label);
		
		
		
		查看历史订单.setFont(new Font("宋体", Font.BOLD, 24));
		查看历史订单.setBounds(58, 437, 221, 40);
		getContentPane().add(查看历史订单);
		
		
		
		查看收货地址.setFont(new Font("宋体", Font.BOLD, 24));
		查看收货地址.setBounds(58, 487, 221, 40);
		getContentPane().add(查看收货地址);
		个人中心.setFont(new Font("宋体", Font.BOLD, 24));
		个人中心.setBounds(116, 10, 114, 40);
		
		getContentPane().add(个人中心);
		lblNewLabel_1.setFont(new Font("宋体", Font.BOLD, 24));
		lblNewLabel_1.setBounds(29, 251, 102, 40);
		
		getContentPane().add(lblNewLabel_1);
		
		getContentPane().add(个人中心的框);
		修改个人信息.setFont(new Font("宋体", Font.BOLD, 20));
		修改个人信息.setBounds(103, 155, 127, 40);
		
		getContentPane().add(修改个人信息);
		
		我要取件.setFont(new Font("宋体", Font.BOLD, 24));
		我要取件.setBounds(59, 387, 220, 40);
		getContentPane().add(我要取件);
		
		我要发件.setFont(new Font("宋体", Font.BOLD, 24));
		我要发件.setBounds(59, 340, 220, 37);
		getContentPane().add(我要发件);
	
		
	}
}