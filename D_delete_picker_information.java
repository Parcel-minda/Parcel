package Parcel;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class D_delete_picker_information  extends JFrame {
	JLabel ɾ��ȡ������Ϣ = new JLabel("\u5220\u9664\u53D6\u8D27\u4EBA\u4FE1\u606F");
	JButton ɾ��������Ϣ = new JButton("\u5220\u9664\u59D3\u540D\u4FE1\u606F");
	JButton ɾ�����֤�� = new JButton("\u5220\u9664\u8EAB\u4EFD\u8BC1\u53F7");
	JLabel ����ѡ����Ҫɾ������Ϣ= new JLabel("\uFF08\u8BF7\u70B9\u51FB\u9009\u62E9\u9700\u8981\u4FEE\u6539\u7684\u4FE1\u606F\uFF09");
	JButton ɾ���ֻ��� = new JButton("\u5220\u9664\u624B\u673A\u53F7");
	JButton ɾ���˺� = new JButton("\u5220\u9664\u8D26\u53F7");
	JButton ɾ����ϵ��ַ= new JButton("\u5220\u9664\u8054\u7CFB\u5730\u5740");
	JButton ɾ��ѧУ��Ϣ = new JButton("\u5220\u9664\u5B66\u6821");
	JButton ȷ��= new JButton("\u786E\u5B9A");
	JButton ���� = new JButton("\u8FD4\u56DE");
	

	//private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void Delete(final A_allinformation all,final String usertele) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//C_pick window = new C_pick();
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

	/**
	 * Create the application.
	 */
	public D_delete_picker_information() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//frame = new JFrame();
		setBounds(100, 100, 450, 328);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		ɾ��ȡ������Ϣ.setFont(new Font("Adobe ���� Std L", Font.BOLD, 24));
		ɾ��ȡ������Ϣ.setBounds(135, 10, 168, 29);
		getContentPane().add(ɾ��ȡ������Ϣ);
		
		
		ɾ��������Ϣ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ɾ��������Ϣ.setBounds(57, 95, 111, 23);
		getContentPane().add(ɾ��������Ϣ);
		
		
		ɾ�����֤��.setBounds(257, 95, 111, 23);
		getContentPane().add(ɾ�����֤��);
		
		
		����ѡ����Ҫɾ������Ϣ.setBounds(135, 49, 202, 15);
		getContentPane().add(����ѡ����Ҫɾ������Ϣ);
		
		
		ɾ���ֻ���.setBounds(57, 142, 111, 23);
		getContentPane().add(ɾ���ֻ���);
		
		
		ɾ���˺�.setBounds(257, 142, 111, 23);
		getContentPane().add(ɾ���˺�);
		
		
		ɾ����ϵ��ַ.setBounds(57, 188, 111, 23);
		getContentPane().add(ɾ����ϵ��ַ);
		
		
		ɾ��ѧУ��Ϣ.setBounds(257, 188, 111, 23);
		getContentPane().add(ɾ��ѧУ��Ϣ);
		
		
		ȷ��.setBounds(95, 244, 93, 23);
		getContentPane().add(ȷ��);
		
		
		����.setBounds(236, 244, 93, 23);
		getContentPane().add(����);
	}

}
