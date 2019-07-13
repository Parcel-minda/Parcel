package Parcel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class B_order extends JFrame{
	JButton 待发布 = new JButton("\u5F85\u53D1\u5E03");
	JButton 待取件 = new JButton("\u5F85\u53D6\u4EF6");
	JButton 待收件 = new JButton("\u5F85\u6536\u4EF6");
	JButton 待评价 = new JButton("\u5F85\u8BC4\u4EF7");
	JButton 返回 = new JButton("\u8FD4\u56DE");
	private final JLabel 订单信息 = new JLabel("\u8BA2\u5355\u4FE1\u606F");
	private final JLabel 订单类型 = new JLabel("\u8BA2\u5355\u7C7B\u578B\uFF1A");
	
	public void B_order(final A_allinformation all,final String usertele){
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
				B_center c=new B_center();
				c.center_main(all,usertele);
				c.setVisible(true);
			}
		});
		待发布.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				B_publish g=new B_publish();
				g.B_publish(all,usertele);
				g.setVisible(true);
			}
		});
		待取件.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				B_pick f=new B_pick();
				f.B_pick(all,usertele);
				f.setVisible(true);
			}
		});
		待收件.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				B_receive i=new B_receive();
				i.B_receive(all,usertele);
				i.setVisible(true);
			}
		});
		待评价.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				B_comment j=new B_comment();
				j.B_comment(all,usertele);
				j.setVisible(true);
			}
		});
	}
	public B_order() {
		this.setTitle("增加订单");
		initialize();
	}
	private void initialize() {

		setBounds(100, 100, 454, 525);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		
		待发布.setFont(new Font("宋体", Font.BOLD, 24));
		待发布.setBounds(108, 125, 221, 40);
		getContentPane().add(待发布);
		
		
		
		待取件.setFont(new Font("宋体", Font.BOLD, 24));
		待取件.setBounds(108, 192, 221, 40);
		getContentPane().add(待取件);
		
		
		
		待收件.setToolTipText("");
		待收件.setFont(new Font("宋体", Font.BOLD, 24));
		待收件.setBounds(108, 260, 221, 40);
		getContentPane().add(待收件);
		
		
		
		待评价.setFont(new Font("宋体", Font.BOLD, 24));
		待评价.setBounds(108, 327, 221, 40);
		getContentPane().add(待评价);
		
		
		
		返回.setFont(new Font("宋体", Font.BOLD, 24));
		返回.setBounds(160, 438, 100, 40);
		getContentPane().add(返回);
		订单信息.setFont(new Font("宋体", Font.BOLD, 24));
		订单信息.setBounds(156, 10, 221, 40);
		
		getContentPane().add(订单信息);
		订单类型.setFont(new Font("宋体", Font.BOLD, 24));
		订单类型.setBounds(39, 85, 221, 30);
		
		getContentPane().add(订单类型);
	}
	/*public static void main(String[] args) {
		new order();
	}*/

}
