package Parcel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class B_receive extends JFrame{

	JLabel ���ռ� = new JLabel("\u5F85\u6536\u4EF6");
	JButton �鿴 = new JButton("\u67E5\u770B");
	JButton ���� = new JButton("\u8FD4\u56DE");
	
	public void B_receive(final A_allinformation all,final String usertele){
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
	public B_receive() {
		this.setTitle("���Ӷ���");
		initialize();
	}
	private void initialize(){
		
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		���ռ�.setFont(new Font("����", Font.BOLD, 24));
		���ռ�.setBounds(175, 10, 100, 30);
		getContentPane().add(���ռ�);
		
		
		�鿴.setFont(new Font("����", Font.BOLD, 20));
		�鿴.setBounds(53, 223, 100, 30);
		getContentPane().add(�鿴);
		
		
		
		����.setFont(new Font("����", Font.BOLD, 20));
		����.setBounds(264, 223, 100, 30);
		getContentPane().add(����);
	}

}

