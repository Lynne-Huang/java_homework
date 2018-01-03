package 计算器;

import java.awt.*;
import java.awt.event.*;
import java.util.Objects;
import java.awt.datatransfer.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Calculator extends JFrame implements ActionListener {
	// 首先定义所需要的各种变量
	// 声明成员变量，文本框、三个面板，数字按钮，运算按钮等
	private JFrame Frame = new JFrame("计算器");// 这个是面板也就是计算器的标题栏
	private JMenuBar menuBar = new JMenuBar();// 菜单栏

	private JMenu menuFile = new JMenu("文件(V)");// 菜单栏上的文件选项
	private JMenuItem menuFile2 = new JMenuItem("查看(R)");// 文件-文件
	private JMenuItem itemExit = new JMenuItem("退出(T)");

	private JMenu compile = new JMenu("编辑(E)");// 菜单栏上的编辑选项
	private JMenuItem copy = new JMenuItem("复制(C)");// 编辑-复制
	private JMenuItem paste = new JMenuItem("粘贴(B)");
	// 编辑-复制/粘贴

	private JMenu menuHelp = new JMenu("帮助(H)");// 菜单上的帮助选项
	private JMenuItem itemAbout = new JMenuItem("关于");// 帮助-关于
	private JButton Sure = new JButton("确定");// 帮助-关于-确定
	private JTextField textField = new JTextField("0", 27);// 文本框 显示屏

	private JPanel Panel1 = new JPanel();
	private JPanel Panel2 = new JPanel();
	private JPanel Panel3 = new JPanel();
	private JButton Backspace = new JButton("←");// 退格键
	private JButton Clean2 = new JButton("CE");// 退格键
	private JButton Clean = new JButton("C");// 清空键
	private JButton kong = new JButton("");// 无操作
	// 数字0到9
	private JButton One = new JButton("1");
	private JButton Two = new JButton("2");
	private JButton Three = new JButton("3");
	private JButton Four = new JButton("4");
	private JButton Five = new JButton("5");
	private JButton Six = new JButton("6");
	private JButton Seven = new JButton("7");
	private JButton Eight = new JButton("8");
	private JButton Nine = new JButton("9");
	private JButton Zero = new JButton("0");
	// 运算符号
	private JButton Plus = new JButton("+");
	private JButton Subtraction = new JButton("-");
	private JButton Multiplication = new JButton("*");
	private JButton Divide = new JButton("/");
	private JButton Point = new JButton(".");
	private JButton Opposite = new JButton("±");
	private JButton Reciprocal = new JButton("1/X");
	private JButton Percent = new JButton("%");
	private JButton Sqrt = new JButton("√");
	private JButton Equal = new JButton("=");

	private String operator;// 定义字符串变量 operator 来标记运算符
	private double previous;
	// 定义全局变量previous ，用来储存数字

	private double next;
	// 定义全局变量next，用来储存数字

	private static double Result = 0;// 定义 static 型变量 Result 来储存结果并实现连续运算

	private void setMenuBar()// 菜单栏
	{

		Frame.setJMenuBar(menuBar);
		// 文件
		menuBar.add(menuFile);
		menuFile.setMnemonic(KeyEvent.VK_V);
		// 文件加文件
		menuBar.add(compile);
		compile.setMnemonic(KeyEvent.VK_E);
		// 文件加编辑
		menuBar.add(menuHelp);
		menuHelp.setMnemonic(KeyEvent.VK_H);
		// 文件加帮助
		menuFile.add(menuFile2); // 文件加文件2
		menuFile.addSeparator();
		compile.add(copy);
		compile.add(paste);
		menuFile.add(itemExit);
		itemExit.addActionListener(this);// 为退出按钮添加监听者
		menuHelp.add(itemAbout);
		itemAbout.addActionListener(this);// 为关于按钮添加监听者
	}

	// 80
	private void setPanel() {
		textField.setBorder(new EmptyBorder(0, 0, 0, 0));

		// 边界式布局管理器

		Panel1.add(textField);
		textField.setHorizontalAlignment(JTextField.RIGHT);// 右对齐
		textField.setEditable(false);// 锁定文本框内容
		// 将显示屏添加进一号面板
		Panel1.setBackground(Color.WHITE);

		Panel2.setLayout(new GridLayout(1, 4, 3, 3));
		// 设置二号面板为 1x4 网格式布局
		Panel2.add(kong);// 空按钮
		Panel2.add(Backspace);// 回退
		Backspace.setForeground(Color.red);
		Panel2.add(Clean2);// 清零2
		Clean2.setForeground(Color.red);
		Panel2.add(Clean);// 清零
		Clean.setForeground(Color.red);

		Panel3.setLayout(new GridLayout(4, 5, 3, 3));// 设置三号面板为 5x4 网格式布局
		Panel3.add(Seven);
		Panel3.add(Eight);
		Panel3.add(Nine);
		Panel3.add(Divide);
		Divide.setForeground(Color.red);
		Panel3.add(Sqrt);
		Panel3.add(Four);
		Panel3.add(Five);
		Panel3.add(Six);
		Panel3.add(Multiplication);
		Multiplication.setForeground(Color.red);
		Panel3.add(Percent);
		Panel3.add(One);
		Panel3.add(Two);
		Panel3.add(Three);
		Panel3.add(Subtraction);
		Subtraction.setForeground(Color.red);
		Panel3.add(Reciprocal);
		Panel3.add(Opposite);
		Panel3.add(Zero);
		Panel3.add(Point);
		Panel3.add(Plus);
		Plus.setForeground(Color.red);
		Panel3.add(Equal);
		Equal.setForeground(Color.red);

	}

	// 向所有按钮注册事件监听者
	private void setButtons() {

		Backspace.addActionListener(this);

		Clean.addActionListener(this);

		Clean2.addActionListener(this);

		One.addActionListener(this);

		Two.addActionListener(this);

		Three.addActionListener(this);

		Four.addActionListener(this);

		Five.addActionListener(this);

		Six.addActionListener(this);

		Seven.addActionListener(this);

		Eight.addActionListener(this);

		Nine.addActionListener(this);

		Zero.addActionListener(this);

		Plus.addActionListener(this);

		Subtraction.addActionListener(this);

		Multiplication.addActionListener(this);

		Divide.addActionListener(this);

		Sqrt.addActionListener(this);

		Reciprocal.addActionListener(this);

		Opposite.addActionListener(this);

		Point.addActionListener(this);

		Percent.addActionListener(this);

		Equal.addActionListener(this);

	}

	// 64
	// 以下进行各个按钮的事件处理，在代码中，首先判断点击的是哪个按钮，再对应写代码
	public void actionPerformed(ActionEvent e) {
		// 编写事件代码
		if (Objects.equals(e.getActionCommand(), "退出"))

			System.exit(0);// 退出

		if (Objects.equals(e.getActionCommand(), "关于"))

			JOptionPane.showMessageDialog(Sure, "请查看帮助文档");

		if (Objects.equals(e.getActionCommand(), "←"))
		// 当用户点击退格键
		{

			int i = textField.getText().length();

			if (i > 0)// 如果输入文本框中有内容存在
			{

				textField.setText((textField.getText()).substring(0, i - 1));
				// 删除最后一位数据
				if (textField.getText().length() == 0) {
					// 如果文本没有了内容，则初始化计算器的各种值
					textField.setText("0");

				} else {
					// 显示新的文本
					textField.setText(textField.getText());
				}
			}

		}

		if (Objects.equals(e.getActionCommand(), "CE")) // 用户点击清空数字按钮
		{
			textField.setText("0");
		}

		if (Objects.equals(e.getActionCommand(), "C")) // 用户清空所有输入
		{
			// 将输入文本框中的内容全部清除
			textField.setText("0");

			previous = 0;

			next = 0;

			Result = 0;

		}

		// 91
		// 在按下数字键的时候，要先判断状态标志clear的值为真还是假，看看文本框里原来有没有数字，
		// 如果有需要先取出原来的数字，再连接上，按钮1上的数字1，注意，这里都是作为字符串来处理的其他数字9，
		// 方法同此，特别注意文本框状态变量值的改变
		if (Objects.equals(e.getActionCommand(), "1")) {

			if (textField.getText().equals("0"))
				// 如果为0
				textField.setText("1");// 就替换为1

			else

				textField.setText(textField.getText() + "1");
			// 在后面加1
		}
		if (Objects.equals(e.getActionCommand(), "2")) // 一样
		{

			if (textField.getText().equals("0"))

				textField.setText("2");

			else

				textField.setText(textField.getText() + "2");

		}
		if (Objects.equals(e.getActionCommand(), "3")) {

			if (textField.getText().equals("0"))

				textField.setText("3");

			else

				textField.setText(textField.getText() + "3");

		}

		if (Objects.equals(e.getActionCommand(), "4")) {

			if (textField.getText().equals("0"))

				textField.setText("4");

			else

				textField.setText(textField.getText() + "4");

		}

		if (Objects.equals(e.getActionCommand(), "5")) {

			if (textField.getText().equals("0"))

				textField.setText("5");

			else

				textField.setText(textField.getText() + "5");

		}

		if (Objects.equals(e.getActionCommand(), "6")) {

			if (textField.getText().equals("0"))

				textField.setText("6");

			else

				textField.setText(textField.getText() + "6");

		}

		if (Objects.equals(e.getActionCommand(), "7")) {

			if (textField.getText().equals("0"))

				textField.setText("7");

			else

				textField.setText(textField.getText() + "7");

		}

		if (Objects.equals(e.getActionCommand(), "8")) {

			if (textField.getText().equals("0"))

				textField.setText("8");

			else

				textField.setText(textField.getText() + "8");

		}

		if (Objects.equals(e.getActionCommand(), "9")) {

			if (textField.getText().equals("0"))

				textField.setText("9");

			else

				textField.setText(textField.getText() + "9");

		}

		if (Objects.equals(e.getActionCommand(), "0")) {

			if (textField.getText().equals("0"))

				textField.setText("0");

			else

				textField.setText(textField.getText() + "0");

		}
		// 272

		if (Objects.equals(e.getActionCommand(), ".")) {

			if (textField.getText().equals("0")) // 如果是零 后面加小数点
			{

				textField.setText("0.");

			} else // 不是零，则加一个小数点
			{

				textField.setText(textField.getText() + ".");

			}

		}

		if (Objects.equals(e.getActionCommand(), "+")) {

			operator = "+";

			previous = Double.parseDouble(textField.getText());
			// 将第一个数保存在previous 中

			textField.setText("+");
			// 算法提示:按下+号后，将文本框现有内容取出，转换为双精度，同时赋值给previous（即前面定义好的第一个操作数），同时将符号变量operator=”+”
		}
		if (Objects.equals(e.getActionCommand(), "-")) {

			operator = "-";
			// 定义字符串变量 operator 来标记运算符
			previous = Double.parseDouble(textField.getText());

			textField.setText("-");

		}
		if (Objects.equals(e.getActionCommand(), "*")) {

			operator = "*";
			previous = Double.parseDouble(textField.getText());

			textField.setText("");

		}
		if (Objects.equals(e.getActionCommand(), "/")) {

			operator = "/";

			previous = Double.parseDouble(textField.getText());

			textField.setText("");

		}

		if (Objects.equals(e.getActionCommand(), "±")) {

			double numReverse = Double.parseDouble(textField.getText());

			textField.setText(Double.toString(numReverse * -1));
			// 将原来的数乘以-1
		}

		if (Objects.equals(e.getActionCommand(), "1/X")) {

			double numReciprocal = Double.parseDouble(textField.getText());

			textField.setText(String.valueOf(1 / numReciprocal));

		}

		if (Objects.equals(e.getActionCommand(), "√")) {

			double numSqrt = Double.parseDouble(textField.getText());

			textField.setText(String.valueOf(Math.sqrt(numSqrt)));

		}

		if (Objects.equals(e.getActionCommand(), "%")) {

			double numPercent = Double.parseDouble(textField.getText());
			// 先保存
			double resultPercent = previous * (numPercent / 100);
			// 先前的数/100
			textField.setText(String.valueOf(resultPercent));
			// 显示
		}

		if (Objects.equals(e.getActionCommand(), "=")) {

			next = Double.parseDouble(textField.getText());

			switch (operator) {

			case "+":

				textField.setText(String.valueOf(Result = previous + next));

				break;

			case "-":

				textField.setText(String.valueOf(Result = previous - (-1 * next)));

				break;

			case "*":

				textField.setText(String.valueOf(Result = previous * next));

				break;

			case "/":

				textField.setText(String.valueOf(Result = previous / next));

			}

		}

	}

	private void Display() // Display 方法显示图形界面 方法
	{

		Frame.setLayout(new BorderLayout(3, 3));// 采用边界式布局

		Frame.setSize(310, 235);

		Frame.setLocation(300, 200);

		Frame.setResizable(false);

		// 表示生成的窗口大小是不能改变的

		// 调用三个方法分别设置菜单栏、面板、按钮
		setMenuBar();

		setPanel();

		setButtons();

		// 依次排列三个面板
		// 将三个个面板分别加入窗口中，设置位置；
		Frame.add(Panel1, BorderLayout.NORTH);

		Frame.add(Panel2, BorderLayout.CENTER);

		Frame.add(Panel3, BorderLayout.SOUTH);

		Frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		Frame.setVisible(true);

	}

	public static void main(String[] args) {

		new Calculator().Display();

	}
}
