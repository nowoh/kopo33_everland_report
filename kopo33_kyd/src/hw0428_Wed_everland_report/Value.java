package hw0428_Wed_everland_report;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashSet;

public class Value {
//	private HashSet<String> dateHash;
//	private ArrayList<String> dateArr;
//	private ArrayList<Integer> dateArrSales;
//	
//	public Value() {
//		dateHash = new HashSet<String>();
//		dateArr = new ArrayList<String>(dateHash);
//		dateArrSales = new ArrayList<Integer>();
//	}
	//������ ī��Ʈ
	int day=0, night=0;
	int dayBaby=0, dayChild=0, dayTeen=0, dayAdult=0, dayOld=0;
	int nightBaby=0, nightChild=0, nightTeen=0, nightAdult=0, nightOld=0;
	int daySales=0, nightSales=0;
	
	//���� ī��Ʈ
	int totalcnt=0;
	int none=0, disable=0, merit=0, multichild=0, pregnant=0;
	
	//���ں� ī��Ʈ
	int dateSales=0;
	
	//csv���� ������ �迭 ����
	String[][] orderList = new String[100][6];
	
	//�迭 �� ��ȣ
	int position=0;
	
	//���� ��ġ
	static final String SAVE_ROUTE = "C:\\Users\\Howon\\eclipse-workspace\\kopo33_kyd\\everland_project.csv";
	
	//�迭
	HashSet<String> dateHash;// = new HashSet<String>();					//���� �ߺ� ���ֱ�
	ArrayList<String> dateArr;// = new ArrayList<String>(vl.dateHash);		//hashset arraylist�� �ֱ�
	ArrayList<Integer> dateArrSales;// = new ArrayList<Integer>();			
	ArrayList<String[]> datedate;
	String[][] dateArr2;
	
	//�б�
	public BufferedReader br;
	
	final static String DAY = "1", NIGHT = "2", BABY = "1", CHILD = "2", TEEN = "3", ADULT = "4", OLD = "5",
			TYPE_NONE = "1", TYPE_DISABLE = "2", TYPE_MERIT = "3", TYPE_MULTICHILD = "4", TYPE_PREGNANT = "5";
}
