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
	//권종별 카운트
	int day=0, night=0;
	int dayBaby=0, dayChild=0, dayTeen=0, dayAdult=0, dayOld=0;
	int nightBaby=0, nightChild=0, nightTeen=0, nightAdult=0, nightOld=0;
	int daySales=0, nightSales=0;
	
	//우대권 카운트
	int totalcnt=0;
	int none=0, disable=0, merit=0, multichild=0, pregnant=0;
	
	//일자별 카운트
	int dateSales=0;
	
	//csv파일 데이터 배열 정의
	String[][] orderList = new String[100][6];
	
	//배열 행 번호
	int position=0;
	
	//저장 위치
	static final String SAVE_ROUTE = "C:\\Users\\Howon\\eclipse-workspace\\kopo33_kyd\\everland_project.csv";
	
	//배열
	HashSet<String> dateHash;// = new HashSet<String>();					//일자 중복 없애기
	ArrayList<String> dateArr;// = new ArrayList<String>(vl.dateHash);		//hashset arraylist에 넣기
	ArrayList<Integer> dateArrSales;// = new ArrayList<Integer>();			
	ArrayList<String[]> datedate;
	String[][] dateArr2;
	
	//읽기
	public BufferedReader br;
	
	final static String DAY = "1", NIGHT = "2", BABY = "1", CHILD = "2", TEEN = "3", ADULT = "4", OLD = "5",
			TYPE_NONE = "1", TYPE_DISABLE = "2", TYPE_MERIT = "3", TYPE_MULTICHILD = "4", TYPE_PREGNANT = "5";
}
