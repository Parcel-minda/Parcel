package Parcel;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import java.awt.Font;
import java.awt.Window;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class A_enter extends JFrame{

	private JTextField �ֻ���;
	private JTextField ����;
     JButton ��¼ = new JButton("\u767B\u5F55");
		JButton ȡ�� = new JButton("\u53D6\u6D88");
		JButton ע�� = new JButton("\u6CE8\u518C");
	/**
	 * Launch the application.
	 */
	public void enter(final A_allinformation  member){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		ע��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				A_login login=new A_login();
				try {
					login.login(member);
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				login.setVisible(true);
			}
		});
		��¼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				int i=0;
				String str1=�ֻ���.getText();
				String str2=����.getText();
				for(i=0;i<member.member.Memberarry.size();i++) {
					Y_Member g=member.member.Memberarry.get(i);
					if(str1!=null&&g.telenum.contentEquals(str1)&&g.secret.contentEquals(str2)) {
						JOptionPane.showMessageDialog(null, "��½�ɹ�!~");
						dispose();
						//����������----------------------------------------
						B_center center=new B_center();
						center.center_main(member,g.telenum);
						center.setVisible(true);
						return;
					}
					}
					if(i==member.member.Memberarry.size()) {
						JOptionPane.showMessageDialog(null, "��½ʧ�ܣ�~");
						dispose();
			  			A_enter enter=new A_enter();
			  			enter.enter(member);
			  			enter.setVisible(true);
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public A_enter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		getContentPane().setFont(new Font("����", Font.PLAIN, 12));
		setBounds(100, 100, 450, 395);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u767B\u5F55");
		label.setFont(new Font("����", Font.BOLD, 24));
		label.setBounds(178, 0, 84, 56);
		getContentPane().add(label);
		
		JLabel label_2 = new JLabel("\u624B\u673A\u53F7\uFF1A");
		label_2.setFont(new Font("����", Font.PLAIN, 20));
		label_2.setBounds(37, 56, 89, 42);
		getContentPane().add(label_2);
		
		�ֻ��� = new JTextField();
		�ֻ���.setBounds(128, 60, 252, 32);
		getContentPane().add(�ֻ���);
		�ֻ���.setColumns(10);
		
		JLabel label_1 = new JLabel("\u5BC6  \u7801\uFF1A");
		label_1.setFont(new Font("����", Font.PLAIN, 20));
		label_1.setBounds(38, 106, 92, 51);
		getContentPane().add(label_1);
		
		���� = new JTextField();
		����.setBounds(128, 112, 253, 34);
		getContentPane().add(����);
		����.setColumns(10);
		
		
		��¼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		��¼.setFont(new Font("����", Font.PLAIN, 20));
		��¼.setBounds(41, 229, 344, 38);
		getContentPane().add(��¼);
		
		ȡ��.setFont(new Font("����", Font.PLAIN, 20));
		ȡ��.setBounds(41, 283, 343, 38);
		getContentPane().add(ȡ��);
		
		JCheckBox checkBox = new JCheckBox("\u8BB0\u4F4F\u5BC6\u7801");
		checkBox.setFont(new Font("����", Font.PLAIN, 18));
		checkBox.setBounds(37, 174, 115, 32);
		getContentPane().add(checkBox);
		
		JButton �������� = new JButton("\u5FD8\u8BB0\u5BC6\u7801");
		��������.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		��������.setFont(new Font("����", Font.PLAIN, 18));
		��������.setBounds(138, 175, 114, 31);
		getContentPane().add(��������);
		
		ע��.setFont(new Font("����", Font.PLAIN, 18));
		ע��.setBounds(269, 176, 112, 32);
		getContentPane().add(ע��);
	}
}
