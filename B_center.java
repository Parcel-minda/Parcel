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
	JButton �鿴��ʷ���� = new JButton("\u67E5\u770B\u5386\u53F2\u8BA2\u5355");
	JButton �鿴�ջ���ַ = new JButton("\u67E5\u770B\u6536\u8D27\u5730\u5740");
	final JLabel �������� = new JLabel("\u4E2A\u4EBA\u4E2D\u5FC3");
	final JLabel lblNewLabel_1 = new JLabel("\u7535\u8BDD\uFF1A");
	final JTextField �������ĵĿ� = new JTextField();
	final JButton �޸ĸ�����Ϣ = new JButton("\u4FEE\u6539\u4FE1\u606F");
	JButton ��Ҫȡ�� = new JButton("\u6211\u8981\u53D6\u4EF6");
	JButton ��Ҫ���� = new JButton("\u6211\u8981\u53D1\u4EF6");
	
	
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
		JLabel �ǳ� = null;
		JLabel �绰 = null;
		for(i=0;i<all.member.Memberarry.size();i++) {
			Y_Member g=all.member.Memberarry.get(i);
			if(g.telenum.contentEquals(usertele)) {
				�ǳ� = new JLabel(g.name);
		        �绰 = new JLabel(g.telenum);
			}
		}
		�ǳ�.setFont(new Font("����", Font.BOLD, 24));
		�ǳ�.setBounds(100, 214, 166, 32);
		getContentPane().add(�ǳ�);
		
		�绰.setFont(new Font("����", Font.BOLD, 24));
		�绰.setBounds(100, 251, 166, 40);
		getContentPane().add(�绰);
		
		�鿴��ʷ����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				B_order a=new B_order();
				a.B_order(all,usertele);
				a.setVisible(true);
			}
		});
		�鿴�ջ���ַ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				B_address b=new B_address();
				b.B_address(all,usertele);
				b.setVisible(true);
			}
		});
		��Ҫ����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Send_main sendmain=new Send_main();
				sendmain.send_main(all,usertele);
				
			}
		});
		��Ҫȡ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				D_main a=new D_main();
				a.mimain(all,usertele);
			}
		});
	}

	public B_center() {
		getContentPane().setFont(new Font("����", Font.BOLD, 24));
		�������ĵĿ�.setBounds(117, 60, 98, 85);
		�������ĵĿ�.setColumns(10);
		
		setBounds(100, 100, 345, 575);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		label.setFont(new Font("����", Font.BOLD, 24));
		label.setBounds(10, 214, 102, 40);
		getContentPane().add(label);
		
		
		
		�鿴��ʷ����.setFont(new Font("����", Font.BOLD, 24));
		�鿴��ʷ����.setBounds(58, 437, 221, 40);
		getContentPane().add(�鿴��ʷ����);
		
		
		
		�鿴�ջ���ַ.setFont(new Font("����", Font.BOLD, 24));
		�鿴�ջ���ַ.setBounds(58, 487, 221, 40);
		getContentPane().add(�鿴�ջ���ַ);
		��������.setFont(new Font("����", Font.BOLD, 24));
		��������.setBounds(116, 10, 114, 40);
		
		getContentPane().add(��������);
		lblNewLabel_1.setFont(new Font("����", Font.BOLD, 24));
		lblNewLabel_1.setBounds(29, 251, 102, 40);
		
		getContentPane().add(lblNewLabel_1);
		
		getContentPane().add(�������ĵĿ�);
		�޸ĸ�����Ϣ.setFont(new Font("����", Font.BOLD, 20));
		�޸ĸ�����Ϣ.setBounds(103, 155, 127, 40);
		
		getContentPane().add(�޸ĸ�����Ϣ);
		
		��Ҫȡ��.setFont(new Font("����", Font.BOLD, 24));
		��Ҫȡ��.setBounds(59, 387, 220, 40);
		getContentPane().add(��Ҫȡ��);
		
		��Ҫ����.setFont(new Font("����", Font.BOLD, 24));
		��Ҫ����.setBounds(59, 340, 220, 37);
		getContentPane().add(��Ҫ����);
	
		
	}
}