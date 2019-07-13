package Parcel;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class D_delete_picker_information  extends JFrame {
	JLabel 删除取货人信息 = new JLabel("\u5220\u9664\u53D6\u8D27\u4EBA\u4FE1\u606F");
	JButton 删除姓名信息 = new JButton("\u5220\u9664\u59D3\u540D\u4FE1\u606F");
	JButton 删除身份证号 = new JButton("\u5220\u9664\u8EAB\u4EFD\u8BC1\u53F7");
	JLabel 请点击选择需要删除的信息= new JLabel("\uFF08\u8BF7\u70B9\u51FB\u9009\u62E9\u9700\u8981\u4FEE\u6539\u7684\u4FE1\u606F\uFF09");
	JButton 删除手机号 = new JButton("\u5220\u9664\u624B\u673A\u53F7");
	JButton 删除账号 = new JButton("\u5220\u9664\u8D26\u53F7");
	JButton 删除联系地址= new JButton("\u5220\u9664\u8054\u7CFB\u5730\u5740");
	JButton 删除学校信息 = new JButton("\u5220\u9664\u5B66\u6821");
	JButton 确定= new JButton("\u786E\u5B9A");
	JButton 返回 = new JButton("\u8FD4\u56DE");
	

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
		确定.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				D_main a=new D_main();
				a.mimain(all,usertele);
			}
		});
		返回.addActionListener(new ActionListener() {
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
		
		
		删除取货人信息.setFont(new Font("Adobe 宋体 Std L", Font.BOLD, 24));
		删除取货人信息.setBounds(135, 10, 168, 29);
		getContentPane().add(删除取货人信息);
		
		
		删除姓名信息.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		删除姓名信息.setBounds(57, 95, 111, 23);
		getContentPane().add(删除姓名信息);
		
		
		删除身份证号.setBounds(257, 95, 111, 23);
		getContentPane().add(删除身份证号);
		
		
		请点击选择需要删除的信息.setBounds(135, 49, 202, 15);
		getContentPane().add(请点击选择需要删除的信息);
		
		
		删除手机号.setBounds(57, 142, 111, 23);
		getContentPane().add(删除手机号);
		
		
		删除账号.setBounds(257, 142, 111, 23);
		getContentPane().add(删除账号);
		
		
		删除联系地址.setBounds(57, 188, 111, 23);
		getContentPane().add(删除联系地址);
		
		
		删除学校信息.setBounds(257, 188, 111, 23);
		getContentPane().add(删除学校信息);
		
		
		确定.setBounds(95, 244, 93, 23);
		getContentPane().add(确定);
		
		
		返回.setBounds(236, 244, 93, 23);
		getContentPane().add(返回);
	}

}
