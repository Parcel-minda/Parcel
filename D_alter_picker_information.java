package Parcel;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class D_alter_picker_information extends JFrame  {
	
	JLabel �޸�ȡ������Ϣ = new JLabel("\u4FEE\u6539\u53D6\u8D27\u4EBA\u4FE1\u606F");
	JLabel �����Ҫ�޸ĵ���Ϣ = new JLabel("(\u8BF7\u70B9\u51FB\u9009\u62E9\u9700\u8981\u4FEE\u6539\u7684\u4FE1\u606F)");
	JButton �޸�������Ϣ = new JButton("\u4FEE\u6539\u59D3\u540D\u4FE1\u606F");
	JButton �޸����֤��Ϣ = new JButton("\u4FEE\u6539\u8EAB\u4EFD\u8BC1\u4FE1\u606F");
	JButton �޸��ֻ���= new JButton("\u4FEE\u6539\u624B\u673A\u53F7");
	JButton �޸��˺���Ϣ = new JButton("\u4FEE\u6539\u8D26\u53F7\u4FE1\u606F");
	JButton �޸���ϵ��ַ = new JButton("\u4FEE\u6539\u8054\u7CFB\u5730\u5740");
	JButton �޸�ѧУ = new JButton("\u4FEE\u6539\u5B66\u6821");
	JButton ȷ�� = new JButton("\u786E\u5B9A");
	JButton ���� = new JButton("\u8FD4\u56DE");
	/**
	 * Launch the application.
	 */
	public void change(final A_allinformation all,final String usertele){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		ȷ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				D_main a=new D_main();
				a.mimain(all,usertele);
			}
		});
		����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				D_main a=new D_main();
				a.mimain(all,usertele);
			}
		});
	}

	
	public D_alter_picker_information() {
		initialize();
	
	}

	
	private void initialize() {
	
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		�޸�ȡ������Ϣ.setFont(new Font("Adobe ���� Std L", Font.BOLD, 24));
		�޸�ȡ������Ϣ.setBounds(129, 23, 186, 33);
		getContentPane().add(�޸�ȡ������Ϣ);
		
		
		 �����Ҫ�޸ĵ���Ϣ.setBounds(143, 65, 156, 15);
		getContentPane().add( �����Ҫ�޸ĵ���Ϣ);
		
		
		�޸�������Ϣ.setBounds(39, 90, 124, 23);
		getContentPane().add(�޸�������Ϣ);
		
		
		�޸����֤��Ϣ.setBounds(270, 90, 124, 23);
		getContentPane().add(�޸����֤��Ϣ);
		
		
		 �޸��ֻ���.setBounds(39, 131, 124, 23);
	getContentPane().add( �޸��ֻ���);
		
		
		�޸��˺���Ϣ.setBounds(269, 131, 125, 23);
		getContentPane().add(�޸��˺���Ϣ);
		
		
		�޸���ϵ��ַ.setBounds(39, 164, 124, 23);
		getContentPane().add(�޸���ϵ��ַ);
		
		
		�޸�ѧУ.setBounds(270, 164, 124, 23);
		getContentPane().add(�޸�ѧУ);
		
		
		ȷ��.setBounds(106, 212, 93, 23);
		getContentPane().add(ȷ��);
		
		
		����.setBounds(254, 212, 93, 23);
		getContentPane().add(����);
	}

}
