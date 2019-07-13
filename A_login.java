package Parcel;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class A_login extends JFrame{

	private JTextField 用户名;
	private JTextField 真实姓名;
	private JLabel label_3;
	private JRadioButton 男;
	private JRadioButton 女;
	private JLabel label_4;
	private JTextField 密码;
	private JLabel label_5;
	private JTextField 确认密码;
	private JLabel label_6;
	private JTextField 电话号码;
	private JLabel label_7;
	JButton 注册 = new JButton("\u6CE8\u518C");
	JButton 取消 = new JButton("\u53D6\u6D88");
	/**
	 * Launch the application.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public void login(final A_allinformation  member) throws ClassNotFoundException, SQLException{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	  //注册的监听按钮
	  		注册.addActionListener(new ActionListener() {
	  			public void actionPerformed(ActionEvent e) {
	  				String username=用户名.getText();
	  				String realname=真实姓名.getText();
	  			    String secret=密码.getText();
	  			    String tel=电话号码.getText();
	  			    String sex = null;
	  			    if(男.isSelected()){
	  			       sex="男";
	  			   }
	  			    else if(女.isSelected()){
	  			       sex="女";
	  			   }
	  				member.member.Memberarry.add(new Y_Member(username,realname,sex,secret,tel));
	  				dispose();
		  			A_enter enter=new A_enter();
		  			enter.enter(member);
		  			enter.setVisible(true);
	    try {
			member.mysql.storebike(member.member.Memberarry);
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	  			}
	  			
	  		});
	}

	/**
	 * Create the application.
	 */
	public A_login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		getContentPane().setFont(new Font("宋体", Font.PLAIN, 22));
		setBounds(100, 100, 496, 507);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u6CE8\u518C");
		label.setFont(new Font("宋体", Font.BOLD, 24));
		label.setBounds(173, 13, 85, 42);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u7528\u6237\u540D");
		label_1.setFont(new Font("宋体", Font.PLAIN, 20));
		label_1.setBounds(72, 88, 72, 18);
		getContentPane().add(label_1);
		
		用户名 = new JTextField();
		用户名.setBounds(173, 87, 204, 24);
		getContentPane().add(用户名);
		用户名.setColumns(10);
		
		JLabel label_2 = new JLabel("\u771F\u5B9E\u59D3\u540D");
		label_2.setFont(new Font("宋体", Font.PLAIN, 20));
		label_2.setBounds(71, 119, 106, 33);
		getContentPane().add(label_2);
		
		真实姓名 = new JTextField();
		真实姓名.setBounds(173, 124, 205, 24);
		getContentPane().add(真实姓名);
		真实姓名.setColumns(10);
		
		label_3 = new JLabel("\u6027\u522B");
		label_3.setFont(new Font("宋体", Font.PLAIN, 20));
		label_3.setBounds(72, 165, 72, 18);
		getContentPane().add(label_3);
		
		男 = new JRadioButton("\u7537");
		男.setBounds(173, 163, 61, 27);
		getContentPane().add(男);
		
		女 = new JRadioButton("\u5973");
		女.setBounds(289, 163, 157, 27);
		getContentPane().add(女);
		
		label_4 = new JLabel("\u5BC6\u7801");
		label_4.setFont(new Font("宋体", Font.PLAIN, 20));
		label_4.setBounds(72, 200, 72, 23);
		getContentPane().add(label_4);
		
		密码 = new JTextField();
		密码.setBounds(173, 199, 204, 24);
		getContentPane().add(密码);
		密码.setColumns(10);
		
		label_5 = new JLabel("\u786E\u8BA4\u5BC6\u7801");
		label_5.setFont(new Font("宋体", Font.PLAIN, 20));
		label_5.setBounds(72, 236, 85, 33);
		getContentPane().add(label_5);
		
		确认密码 = new JTextField();
		确认密码.setBounds(172, 242, 205, 24);
		getContentPane().add(确认密码);
		确认密码.setColumns(10);
		
		label_6 = new JLabel("\u7535\u8BDD\u53F7\u7801");
		label_6.setFont(new Font("宋体", Font.PLAIN, 20));
		label_6.setBounds(72, 282, 85, 33);
		getContentPane().add(label_6);
		
		电话号码 = new JTextField();
		电话号码.setBounds(172, 288, 205, 24);
		getContentPane().add(电话号码);
		电话号码.setColumns(10);
		
		label_7 = new JLabel("\u5934\u50CF\u4E0A\u4F20");
		label_7.setFont(new Font("宋体", Font.PLAIN, 20));
		label_7.setBounds(72, 328, 85, 24);
		getContentPane().add(label_7);
		
		JButton button = new JButton("\u70B9\u51FB\u4E0A\u4F20");
		button.setFont(new Font("宋体", Font.PLAIN, 20));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(173, 329, 204, 27);
		getContentPane().add(button);
		
		
		注册.setFont(new Font("宋体", Font.PLAIN, 20));
		
		
		注册.setBounds(74, 393, 113, 27);
		getContentPane().add(注册);
		
		取消.setFont(new Font("宋体", Font.PLAIN, 20));
		取消.setBounds(289, 393, 113, 27);
		getContentPane().add(取消);
	}
}
