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
	JLabel �½��ջ���ַ = new JLabel("\u65B0\u5EFA\u6536\u8D27\u5730\u5740\uFF1A");
	JButton �鿴���е�ַ = new JButton("\u67E5\u770B\u5DF2\u6709\u5730\u5740");
	JButton ���� = new JButton("\u8FD4\u56DE");
	private final JLabel ��ַ��Ϣ = new JLabel("\u5730\u5740\u4FE1\u606F");
	private final JLabel �ջ��˺��� = new JLabel("\u6536\u8D27\u4EBA\u53F7\u7801\uFF1A");
	private final JTextField textField_1 = new JTextField();
	private final JButton �½� = new JButton("\u65B0\u5EFA");
	private final JButton ȡ�� = new JButton("\u53D6\u6D88");
	
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
		����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				B_center d=new B_center();
				d.center_main(all,usertele);
				d.setVisible(true);
			}
		});
	}
	public B_address() {
		this.setTitle("���Ӷ���");
		initialize();
	}
	private void initialize() {
		textField_1.setBounds(228, 143, 221, 30);
		textField_1.setColumns(10);

		setBounds(100, 100, 495, 397);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		;
		�½��ջ���ַ.setFont(new Font("����", Font.BOLD, 24));
		�½��ջ���ַ.setBounds(39, 83, 179, 40);
		getContentPane().add(�½��ջ���ַ);
		
		
		textField.setFont(new Font("����", Font.BOLD, 24));
		textField.setBounds(228, 88, 221, 30);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		
		�鿴���е�ַ.setFont(new Font("����", Font.BOLD, 24));
		�鿴���е�ַ.setBounds(118, 260, 221, 40);
		getContentPane().add(�鿴���е�ַ);
		
		
		
		����.setFont(new Font("����", Font.BOLD, 24));
		����.setBounds(118, 310, 221, 40);
		getContentPane().add(����);
		��ַ��Ϣ.setFont(new Font("����", Font.BOLD, 24));
		��ַ��Ϣ.setBounds(178, 0, 221, 40);
		
		getContentPane().add(��ַ��Ϣ);
		�ջ��˺���.setFont(new Font("����", Font.BOLD, 24));
		�ջ��˺���.setBounds(39, 133, 221, 40);
		
		getContentPane().add(�ջ��˺���);
		
		getContentPane().add(textField_1);
		�½�.setFont(new Font("����", Font.BOLD, 20));
		�½�.setBounds(107, 206, 97, 30);
		
		getContentPane().add(�½�);
		ȡ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ȡ��.setFont(new Font("����", Font.BOLD, 20));
		ȡ��.setBounds(262, 206, 97, 30);
		
		getContentPane().add(ȡ��);
	}
}
