package Parcel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class B_pick extends JFrame{

	JLabel ��ȡ�� = new JLabel("\u5F85\u53D6\u4EF6");
	JButton �鿴 = new JButton("\u67E5\u770B");
	JButton ɾ�� = new JButton("\u5220\u9664");
	JButton ���� = new JButton("\u8FD4\u56DE");
	
	public void B_pick(final A_allinformation all,final String usertele){
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
	
	public B_pick() {
		this.setTitle("���Ӷ���");
		initialize();
	}
	private void initialize() {
		
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		��ȡ��.setFont(new Font("����", Font.BOLD, 24));
		��ȡ��.setBounds(172, 10, 100, 30);
		getContentPane().add(��ȡ��);
		
		
		�鿴.setFont(new Font("����", Font.BOLD, 20));
		�鿴.setBounds(39, 230, 100, 30);
		getContentPane().add(�鿴);
		
		
		ɾ��.setFont(new Font("����", Font.BOLD, 20));
		ɾ��.setBounds(172, 230, 100, 30);
		getContentPane().add(ɾ��);
		
		
		
		����.setFont(new Font("����", Font.BOLD, 20));
		����.setBounds(310, 230, 100, 30);
		getContentPane().add(����);
	}

}
