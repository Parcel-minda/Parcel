package Parcel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class B_address extends JFrame{
	
	JTextField textField = new JTextField();
	JLabel 新建收货地址 = new JLabel("\u65B0\u5EFA\u6536\u8D27\u5730\u5740\uFF1A");
	JButton 查看已有地址 = new JButton("\u67E5\u770B\u5DF2\u6709\u5730\u5740");
	JButton 返回 = new JButton("\u8FD4\u56DE");
	private final JLabel 地址信息 = new JLabel("\u5730\u5740\u4FE1\u606F");
	private final JLabel 收货人号码 = new JLabel("\u6536\u8D27\u4EBA\u53F7\u7801\uFF1A");
	private final JTextField textField_1 = new JTextField();
	private final JButton 新建 = new JButton("\u65B0\u5EFA");
	private final JButton 取消 = new JButton("\u53D6\u6D88");
	
	public void B_address(final A_allinformation all,final String usertele){
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
				B_center d=new B_center();
				d.center_main(all,usertele);
				d.setVisible(true);
			}
		});
	}
	public B_address() {
		this.setTitle("增加订单");
		initialize();
	}
	private void initialize() {
		textField_1.setBounds(228, 143, 221, 30);
		textField_1.setColumns(10);

		setBounds(100, 100, 495, 397);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		;
		新建收货地址.setFont(new Font("宋体", Font.BOLD, 24));
		新建收货地址.setBounds(39, 83, 179, 40);
		getContentPane().add(新建收货地址);
		
		
		textField.setFont(new Font("宋体", Font.BOLD, 24));
		textField.setBounds(228, 88, 221, 30);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		
		查看已有地址.setFont(new Font("宋体", Font.BOLD, 24));
		查看已有地址.setBounds(118, 260, 221, 40);
		getContentPane().add(查看已有地址);
		
		
		
		返回.setFont(new Font("宋体", Font.BOLD, 24));
		返回.setBounds(118, 310, 221, 40);
		getContentPane().add(返回);
		地址信息.setFont(new Font("宋体", Font.BOLD, 24));
		地址信息.setBounds(178, 0, 221, 40);
		
		getContentPane().add(地址信息);
		收货人号码.setFont(new Font("宋体", Font.BOLD, 24));
		收货人号码.setBounds(39, 133, 221, 40);
		
		getContentPane().add(收货人号码);
		
		getContentPane().add(textField_1);
		新建.setFont(new Font("宋体", Font.BOLD, 20));
		新建.setBounds(107, 206, 97, 30);
		
		getContentPane().add(新建);
		取消.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		取消.setFont(new Font("宋体", Font.BOLD, 20));
		取消.setBounds(262, 206, 97, 30);
		
		getContentPane().add(取消);
	}
}
