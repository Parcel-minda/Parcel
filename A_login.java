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

	private JTextField �û���;
	private JTextField ��ʵ����;
	private JLabel label_3;
	private JRadioButton ��;
	private JRadioButton Ů;
	private JLabel label_4;
	private JTextField ����;
	private JLabel label_5;
	private JTextField ȷ������;
	private JLabel label_6;
	private JTextField �绰����;
	private JLabel label_7;
	JButton ע�� = new JButton("\u6CE8\u518C");
	JButton ȡ�� = new JButton("\u53D6\u6D88");
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
		
	  //ע��ļ�����ť
	  		ע��.addActionListener(new ActionListener() {
	  			public void actionPerformed(ActionEvent e) {
	  				String username=�û���.getText();
	  				String realname=��ʵ����.getText();
	  			    String secret=����.getText();
	  			    String tel=�绰����.getText();
	  			    String sex = null;
	  			    if(��.isSelected()){
	  			       sex="��";
	  			   }
	  			    else if(Ů.isSelected()){
	  			       sex="Ů";
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
		getContentPane().setFont(new Font("����", Font.PLAIN, 22));
		setBounds(100, 100, 496, 507);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u6CE8\u518C");
		label.setFont(new Font("����", Font.BOLD, 24));
		label.setBounds(173, 13, 85, 42);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u7528\u6237\u540D");
		label_1.setFont(new Font("����", Font.PLAIN, 20));
		label_1.setBounds(72, 88, 72, 18);
		getContentPane().add(label_1);
		
		�û��� = new JTextField();
		�û���.setBounds(173, 87, 204, 24);
		getContentPane().add(�û���);
		�û���.setColumns(10);
		
		JLabel label_2 = new JLabel("\u771F\u5B9E\u59D3\u540D");
		label_2.setFont(new Font("����", Font.PLAIN, 20));
		label_2.setBounds(71, 119, 106, 33);
		getContentPane().add(label_2);
		
		��ʵ���� = new JTextField();
		��ʵ����.setBounds(173, 124, 205, 24);
		getContentPane().add(��ʵ����);
		��ʵ����.setColumns(10);
		
		label_3 = new JLabel("\u6027\u522B");
		label_3.setFont(new Font("����", Font.PLAIN, 20));
		label_3.setBounds(72, 165, 72, 18);
		getContentPane().add(label_3);
		
		�� = new JRadioButton("\u7537");
		��.setBounds(173, 163, 61, 27);
		getContentPane().add(��);
		
		Ů = new JRadioButton("\u5973");
		Ů.setBounds(289, 163, 157, 27);
		getContentPane().add(Ů);
		
		label_4 = new JLabel("\u5BC6\u7801");
		label_4.setFont(new Font("����", Font.PLAIN, 20));
		label_4.setBounds(72, 200, 72, 23);
		getContentPane().add(label_4);
		
		���� = new JTextField();
		����.setBounds(173, 199, 204, 24);
		getContentPane().add(����);
		����.setColumns(10);
		
		label_5 = new JLabel("\u786E\u8BA4\u5BC6\u7801");
		label_5.setFont(new Font("����", Font.PLAIN, 20));
		label_5.setBounds(72, 236, 85, 33);
		getContentPane().add(label_5);
		
		ȷ������ = new JTextField();
		ȷ������.setBounds(172, 242, 205, 24);
		getContentPane().add(ȷ������);
		ȷ������.setColumns(10);
		
		label_6 = new JLabel("\u7535\u8BDD\u53F7\u7801");
		label_6.setFont(new Font("����", Font.PLAIN, 20));
		label_6.setBounds(72, 282, 85, 33);
		getContentPane().add(label_6);
		
		�绰���� = new JTextField();
		�绰����.setBounds(172, 288, 205, 24);
		getContentPane().add(�绰����);
		�绰����.setColumns(10);
		
		label_7 = new JLabel("\u5934\u50CF\u4E0A\u4F20");
		label_7.setFont(new Font("����", Font.PLAIN, 20));
		label_7.setBounds(72, 328, 85, 24);
		getContentPane().add(label_7);
		
		JButton button = new JButton("\u70B9\u51FB\u4E0A\u4F20");
		button.setFont(new Font("����", Font.PLAIN, 20));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(173, 329, 204, 27);
		getContentPane().add(button);
		
		
		ע��.setFont(new Font("����", Font.PLAIN, 20));
		
		
		ע��.setBounds(74, 393, 113, 27);
		getContentPane().add(ע��);
		
		ȡ��.setFont(new Font("����", Font.PLAIN, 20));
		ȡ��.setBounds(289, 393, 113, 27);
		getContentPane().add(ȡ��);
	}
}
