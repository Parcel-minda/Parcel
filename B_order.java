package Parcel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class B_order extends JFrame{
	JButton ������ = new JButton("\u5F85\u53D1\u5E03");
	JButton ��ȡ�� = new JButton("\u5F85\u53D6\u4EF6");
	JButton ���ռ� = new JButton("\u5F85\u6536\u4EF6");
	JButton ������ = new JButton("\u5F85\u8BC4\u4EF7");
	JButton ���� = new JButton("\u8FD4\u56DE");
	private final JLabel ������Ϣ = new JLabel("\u8BA2\u5355\u4FE1\u606F");
	private final JLabel �������� = new JLabel("\u8BA2\u5355\u7C7B\u578B\uFF1A");
	
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
		����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				B_center c=new B_center();
				c.center_main(all,usertele);
				c.setVisible(true);
			}
		});
		������.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				B_publish g=new B_publish();
				g.B_publish(all,usertele);
				g.setVisible(true);
			}
		});
		��ȡ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				B_pick f=new B_pick();
				f.B_pick(all,usertele);
				f.setVisible(true);
			}
		});
		���ռ�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				B_receive i=new B_receive();
				i.B_receive(all,usertele);
				i.setVisible(true);
			}
		});
		������.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				B_comment j=new B_comment();
				j.B_comment(all,usertele);
				j.setVisible(true);
			}
		});
	}
	public B_order() {
		this.setTitle("���Ӷ���");
		initialize();
	}
	private void initialize() {

		setBounds(100, 100, 454, 525);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		
		������.setFont(new Font("����", Font.BOLD, 24));
		������.setBounds(108, 125, 221, 40);
		getContentPane().add(������);
		
		
		
		��ȡ��.setFont(new Font("����", Font.BOLD, 24));
		��ȡ��.setBounds(108, 192, 221, 40);
		getContentPane().add(��ȡ��);
		
		
		
		���ռ�.setToolTipText("");
		���ռ�.setFont(new Font("����", Font.BOLD, 24));
		���ռ�.setBounds(108, 260, 221, 40);
		getContentPane().add(���ռ�);
		
		
		
		������.setFont(new Font("����", Font.BOLD, 24));
		������.setBounds(108, 327, 221, 40);
		getContentPane().add(������);
		
		
		
		����.setFont(new Font("����", Font.BOLD, 24));
		����.setBounds(160, 438, 100, 40);
		getContentPane().add(����);
		������Ϣ.setFont(new Font("����", Font.BOLD, 24));
		������Ϣ.setBounds(156, 10, 221, 40);
		
		getContentPane().add(������Ϣ);
		��������.setFont(new Font("����", Font.BOLD, 24));
		��������.setBounds(39, 85, 221, 30);
		
		getContentPane().add(��������);
	}
	/*public static void main(String[] args) {
		new order();
	}*/

}
