package Parcel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class B_comment extends JFrame{
	JLabel ������ = new JLabel("\u5F85\u8BC4\u4EF7");
	JButton ���� = new JButton("\u8BC4\u4EF7");
	JButton ���� = new JButton("\u8FD4\u56DE");
	
	public void B_comment(final A_allinformation all,final String usertele){
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
				B_order a=new B_order();
				a.B_order(all,usertele);
				a.setVisible(true);
			}
		});
	}
	public B_comment() {
		this.setTitle("���Ӷ���");
		initialize();
	}
	private void initialize() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		������.setFont(new Font("����", Font.BOLD, 24));
		������.setBounds(169, 10, 100, 30);
		getContentPane().add(������);
		
		
		����.setFont(new Font("����", Font.BOLD, 20));
		����.setBounds(59, 223, 100, 30);
		getContentPane().add(����);
		
		
		
		����.setFont(new Font("����", Font.BOLD, 20));
		����.setBounds(258, 223, 100, 30);
		getContentPane().add(����);
	}

}
