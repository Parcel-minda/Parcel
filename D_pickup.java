package Parcel;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class D_pickup  extends JFrame{

	JLabel 我要取件 = new JLabel("\u6211\u8981\u53D6\u4EF6");
	JLabel 手机号 = new JLabel("\u624B\u673A\u53F7");
	JLabel 姓名 = new JLabel("\u59D3  \u540D");
	JLabel 快递编号= new JLabel("\u5FEB\u9012\u7F16\u53F7");
	JButton 确认 = new JButton("\u786E\u8BA4");
	JButton 取消 = new JButton("\u53D6\u6D88");
	JButton 返回个人中心 = new JButton("\u8FD4\u56DE");
	JButton 修改取货人 = new JButton("\u4FEE\u6539\u53D6\u8D27\u4EBA\u4FE1\u606F");
	JButton 删除取货人 = new JButton("\u5220\u9664\u53D6\u8D27\u4EBA\u4FE1\u606F");
	JButton 添加取货人 = new JButton("\u6DFB\u52A0\u53D6\u8D27\u4EBA\u4FE1\u606F");
	JButton 物流跟踪 = new JButton("\u7269\u6D41\u8DDF\u8E2A");
	
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;
//	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	void pick_information(final A_allinformation all,final String usertele){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		物流跟踪.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				D_trace a=new D_trace();
				a.trace(all,usertele);
				a.setVisible(true);
			}
		});
		确认.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				D_sucsess a=new D_sucsess();
				a.success(all,usertele);
				a.setVisible(true);
			}
		});
		修改取货人.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				D_alter_picker_information a=new D_alter_picker_information();
				a.change(all,usertele);
				a.setVisible(true);
			}
		});
		删除取货人.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				D_delete_picker_information a=new D_delete_picker_information();
				a.Delete(all,usertele);
				a.setVisible(true);
			}
		});
		添加取货人.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				D_picker_information a=new D_picker_information();
				a.pick_update(all,usertele);
				a.setVisible(true);
			}
		});
		返回个人中心.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				B_center center=new B_center();
				center.center_main(all,usertele);
				center.setVisible(true);
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public D_pickup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
     public  void initialize() {
		setBounds(100, 100, 613, 326);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		我要取件.setFont(new Font("宋体", Font.BOLD, 24));
		我要取件.setBounds(251, 43, 107, 39);
		getContentPane().add(我要取件);
		
		
		手机号.setBounds(203, 148, 54, 15);
		getContentPane().add(手机号);
		
		
		姓名.setBounds(203, 103, 54, 15);
		getContentPane().add(姓名);
		
		textField_1= new JTextField();
		textField_1.setBounds(297, 145, 130, 21);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(298, 100, 129, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		
		快递编号.setBounds(203, 189, 54, 15);
		getContentPane().add(快递编号);
		
		textField_2 = new JTextField();
		textField_2.setBounds(298, 186, 129, 21);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
	
		确认.setBounds(85, 241, 93, 23);
		getContentPane().add(确认);
		
		
		
		
		取消.setBounds(269, 241, 93, 23);
		getContentPane().add(取消);
		
		
		返回个人中心.setBounds(440, 241, 93, 23);
		getContentPane().add(返回个人中心);
		
		
		修改取货人.setBounds(328, 10, 117, 23);
		getContentPane().add(修改取货人);
		
	
		
		
		删除取货人.setBounds(175, 10, 129, 23);
		getContentPane().add(删除取货人);
		
		
		 添加取货人.setBounds(35, 10, 117, 23);
		getContentPane().add( 添加取货人);
		 
		物流跟踪 .setBounds(481, 10, 93, 23);
		getContentPane().add(物流跟踪);
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
