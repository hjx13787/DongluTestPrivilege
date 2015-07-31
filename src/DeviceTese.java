

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class DeviceTese {

	protected Shell shell;
	private Table table;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;
	private Text text_5;
	private Text text_6;
	private Text text_7;
	private Text text_8;
	private Text text_9;
	private Text text_10;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			DeviceTese window = new DeviceTese();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(699, 625);
		shell.setText("权限测试");
		shell.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setLayout(new GridLayout(1, false));
		
		Group group = new Group(composite, SWT.NONE);
		group.setLayout(new GridLayout(3, false));
		GridData gd_group = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_group.widthHint = 282;
		gd_group.heightHint = 53;
		group.setLayoutData(gd_group);
		group.setText("卡片生成");
		
		Label lblNewLabel = new Label(group, SWT.NONE);
		GridData gd_lblNewLabel = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
		gd_lblNewLabel.widthHint = 31;
		lblNewLabel.setLayoutData(gd_lblNewLabel);
		lblNewLabel.setText("卡片");
		
		text = new Text(group, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, true, 1, 1));
		
		Button btnNewButton_3 = new Button(group, SWT.NONE);
		btnNewButton_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		btnNewButton_3.setText("生成");
		
		Composite composite_1 = new Composite(composite, SWT.NONE);
		composite_1.setLayout(new GridLayout(2, false));
		composite_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		Composite composite_2 = new Composite(composite_1, SWT.NONE);
		composite_2.setLayout(new FillLayout(SWT.HORIZONTAL));
		GridData gd_composite_2 = new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1);
		gd_composite_2.widthHint = 161;
		composite_2.setLayoutData(gd_composite_2);
		
		table = new Table(composite_2, SWT.BORDER | SWT.FULL_SELECTION);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tableColumn = new TableColumn(table, SWT.NONE);
		tableColumn.setWidth(100);
		tableColumn.setText("编号");
		
		Composite composite_3 = new Composite(composite_1, SWT.NONE);
		composite_3.setLayout(new GridLayout(1, false));
		composite_3.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		
		Group group_1 = new Group(composite_3, SWT.NONE);
		group_1.setLayout(new GridLayout(1, false));
		group_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1));
		group_1.setText("设备");
		
		Composite composite_5 = new Composite(group_1, SWT.NONE);
		composite_5.setLayout(new GridLayout(6, false));
		
		Label label_1 = new Label(composite_5, SWT.NONE);
		label_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_1.setText("01");
		
		text_2 = new Text(composite_5, SWT.BORDER);
		text_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button button_2 = new Button(composite_5, SWT.RADIO);
		button_2.setText("1");
		
		Button button_3 = new Button(composite_5, SWT.RADIO);
		button_3.setText("2");
		
		Button button_4 = new Button(composite_5, SWT.CHECK);
		button_4.setText("比对");
		
		Button button_5 = new Button(composite_5, SWT.CHECK);
		button_5.setText("初始化");
		
		Composite composite_4 = new Composite(group_1, SWT.NONE);
		composite_4.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		composite_4.setLayout(new GridLayout(5, false));
		
		Label label = new Label(composite_4, SWT.NONE);
		label.setText("02");
		
		text_1 = new Text(composite_4, SWT.BORDER);
		
		Button button_38 = new Button(composite_4, SWT.RADIO);
		button_38.setText("1");
		
		Button button = new Button(composite_4, SWT.CHECK);
		button.setText("比对");
		
		Button button_1 = new Button(composite_4, SWT.CHECK);
		button_1.setText("初始化");
		
		Composite composite_6 = new Composite(group_1, SWT.NONE);
		composite_6.setLayout(new GridLayout(6, false));
		
		Label label_2 = new Label(composite_6, SWT.NONE);
		label_2.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_2.setText("03");
		
		text_3 = new Text(composite_6, SWT.BORDER);
		text_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button button_6 = new Button(composite_6, SWT.CHECK);
		button_6.setText("下载");
		
		Button button_7 = new Button(composite_6, SWT.CHECK);
		button_7.setText("删除");
		
		Button button_8 = new Button(composite_6, SWT.CHECK);
		button_8.setText("比对");
		
		Button button_9 = new Button(composite_6, SWT.CHECK);
		button_9.setText("初始化");
		
		Composite composite_7 = new Composite(group_1, SWT.NONE);
		composite_7.setLayout(new GridLayout(6, false));
		
		Label label_3 = new Label(composite_7, SWT.NONE);
		label_3.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_3.setText("04");
		
		text_4 = new Text(composite_7, SWT.BORDER);
		text_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button button_10 = new Button(composite_7, SWT.CHECK);
		button_10.setText("下载");
		
		Button button_11 = new Button(composite_7, SWT.CHECK);
		button_11.setText("删除");
		
		Button button_12 = new Button(composite_7, SWT.CHECK);
		button_12.setText("比对");
		
		Button button_13 = new Button(composite_7, SWT.CHECK);
		button_13.setText("初始化");
		
		Composite composite_8 = new Composite(group_1, SWT.NONE);
		composite_8.setLayout(new GridLayout(6, false));
		
		Label label_4 = new Label(composite_8, SWT.NONE);
		label_4.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_4.setText("05");
		
		text_5 = new Text(composite_8, SWT.BORDER);
		text_5.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button button_14 = new Button(composite_8, SWT.CHECK);
		button_14.setText("下载");
		
		Button button_15 = new Button(composite_8, SWT.CHECK);
		button_15.setText("删除");
		
		Button button_16 = new Button(composite_8, SWT.CHECK);
		button_16.setText("比对");
		
		Button button_17 = new Button(composite_8, SWT.CHECK);
		button_17.setText("初始化");
		
		Composite composite_9 = new Composite(group_1, SWT.NONE);
		composite_9.setLayout(new GridLayout(6, false));
		
		Label label_5 = new Label(composite_9, SWT.NONE);
		label_5.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_5.setText("06");
		
		text_6 = new Text(composite_9, SWT.BORDER);
		text_6.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button button_18 = new Button(composite_9, SWT.CHECK);
		button_18.setText("下载");
		
		Button button_19 = new Button(composite_9, SWT.CHECK);
		button_19.setText("删除");
		
		Button button_20 = new Button(composite_9, SWT.CHECK);
		button_20.setText("比对");
		
		Button button_21 = new Button(composite_9, SWT.CHECK);
		button_21.setText("初始化");
		
		Composite composite_10 = new Composite(group_1, SWT.NONE);
		composite_10.setLayout(new GridLayout(6, false));
		
		Label label_6 = new Label(composite_10, SWT.NONE);
		label_6.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_6.setText("07");
		
		text_7 = new Text(composite_10, SWT.BORDER);
		text_7.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button button_22 = new Button(composite_10, SWT.CHECK);
		button_22.setText("下载");
		
		Button button_23 = new Button(composite_10, SWT.CHECK);
		button_23.setText("删除");
		
		Button button_24 = new Button(composite_10, SWT.CHECK);
		button_24.setText("比对");
		
		Button button_25 = new Button(composite_10, SWT.CHECK);
		button_25.setText("初始化");
		
		Composite composite_11 = new Composite(group_1, SWT.NONE);
		composite_11.setLayout(new GridLayout(6, false));
		
		Label label_7 = new Label(composite_11, SWT.NONE);
		label_7.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_7.setText("08");
		
		text_8 = new Text(composite_11, SWT.BORDER);
		text_8.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button button_26 = new Button(composite_11, SWT.CHECK);
		button_26.setText("下载");
		
		Button button_27 = new Button(composite_11, SWT.CHECK);
		button_27.setText("删除");
		
		Button button_28 = new Button(composite_11, SWT.CHECK);
		button_28.setText("比对");
		
		Button button_29 = new Button(composite_11, SWT.CHECK);
		button_29.setText("初始化");
		
		Composite composite_12 = new Composite(group_1, SWT.NONE);
		composite_12.setLayout(new GridLayout(6, false));
		
		Label label_8 = new Label(composite_12, SWT.NONE);
		label_8.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_8.setText("09");
		
		text_9 = new Text(composite_12, SWT.BORDER);
		text_9.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button button_30 = new Button(composite_12, SWT.CHECK);
		button_30.setText("下载");
		
		Button button_31 = new Button(composite_12, SWT.CHECK);
		button_31.setText("删除");
		
		Button button_32 = new Button(composite_12, SWT.CHECK);
		button_32.setText("比对");
		
		Button button_33 = new Button(composite_12, SWT.CHECK);
		button_33.setText("初始化");
		
		Composite composite_13 = new Composite(group_1, SWT.NONE);
		composite_13.setLayout(new GridLayout(6, false));
		
		Label label_9 = new Label(composite_13, SWT.NONE);
		label_9.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_9.setText("10");
		
		text_10 = new Text(composite_13, SWT.BORDER);
		text_10.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button button_34 = new Button(composite_13, SWT.CHECK);
		button_34.setText("下载");
		
		Button button_35 = new Button(composite_13, SWT.CHECK);
		button_35.setText("删除");
		
		Button button_36 = new Button(composite_13, SWT.CHECK);
		button_36.setText("比对");
		
		Button button_37 = new Button(composite_13, SWT.CHECK);
		button_37.setText("初始化");
		
		Group group_2 = new Group(composite_3, SWT.NONE);
		group_2.setLayout(new GridLayout(3, false));
		GridData gd_group_2 = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_group_2.heightHint = 68;
		group_2.setLayoutData(gd_group_2);
		group_2.setText("操作");
		
		Button btnNewButton = new Button(group_2, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, true, 1, 1));
		btnNewButton.setText("运行");
		
		Button btnNewButton_1 = new Button(group_2, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton_1.setText("读数");
		
		Button btnNewButton_2 = new Button(group_2, SWT.NONE);
		btnNewButton_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton_2.setText("比对");

	}
}
