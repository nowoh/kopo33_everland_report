package hw0428_Wed_everland_report;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class main {
	static Value vl;
	public static void main(String[] args) throws IOException {
		Save_data sd = new Save_data();
		Analysis as = new Analysis();
		Print pr = new Print();
		vl = new Value();
		vl.dateHash = new HashSet<String>();
		//vl.dateHash.clear();
		sd.save(vl);
		
		vl.dateArr = new ArrayList<String>(vl.dateHash);
		vl.dateArrSales = new ArrayList<Integer>();
		vl.datedate = new ArrayList<String[]>();
		
		as.date_analysis(vl);
		as.day_night_sales(vl);
		as.discount(vl);
		System.out.println(vl.dateArr);
		System.out.println(vl.dateArrSales);
		
		pr.printCsv(vl);
		pr.day_night_print(vl);
		pr.date_analysis_print(vl);
		pr.discount_print(vl);
//		String line;
//		if ((line = br.readLine()) != null) {
//						//첫 줄(title) 읽기
//		}
		

//		//권종별 카운트
//		int day = 0; int night = 0;
//		int dayBaby = 0; int dayChild = 0; int dayTeen = 0; int dayAdult = 0; int dayOld = 0;
//		int nightBaby = 0; int nightChild = 0; int nightTeen = 0; int nightAdult = 0; int nightOld = 0;
//		int daySales = 0; int nightSales = 0;
//		
//		//우대권 카운트
//		int totalcnt = 0;
//		int none = 0; int disable = 0; int merit = 0; int multichild = 0; int pregnant = 0;
//		
//		//일자별 카운트
//		int dateSales = 0;
//		
//		//csv파일 데이터 배열 정의
//		String[][] orderList = new String[100][6];
//		
//		//배열 행 번호
//		int position = 0;
		
		//csv파일 데이터 배열에 넣기
//		while ((line = br.readLine()) != null) {
//			String[] lines = line.split(",");
//			saveOrderList(lines[0], lines[1], lines[2], lines[3], lines[4], lines[5],	vl.position, vl.orderList);
//			dateHash.add(lines[0]);
//			vl.position++;
//			
//		}
//		ArrayList<String> dateArr = new ArrayList<String>(dateHash);
//		ArrayList<Integer> dateArrSales = new ArrayList<Integer>();

//		System.out.println(vl.dateArr);
		
		
		//일자별 분석
//		for (int j = 0; j < vl.dateArr.size(); j++) {
//			if (vl.orderList[0][0] != null) {
//				for (int i = 0; i < vl.orderList.length; i++) {
//					if (vl.dateArr.get(j).equals(vl.orderList[i][0])) {
//						vl.dateSales += Integer.parseInt(vl.orderList[i][4]);
//					}
//				}
//			}
//			vl.dateArrSales.add(vl.dateSales);
//			vl.dateSales = 0;
//		}
		
		
//		System.out.println(vl.dateArrSales);

		
		//권종별 카운트
//		for (int i = 0; i < vl.orderList.length; i++) {
//			if (vl.orderList[i][0] != null) {
//				if (vl.orderList[i][1].equals("주간권")) {
//					if (vl.orderList[i][2].equals("유아")) {
//						vl.dayBaby += Integer.parseInt(vl.orderList[i][3]);
//					} else if (vl.orderList[i][2].equals("어린이")) {
//						vl.dayChild += Integer.parseInt(vl.orderList[i][3]);
//					} else if (vl.orderList[i][2].equals("청소년")) {
//						vl.dayTeen += Integer.parseInt(vl.orderList[i][3]);
//					} else if (vl.orderList[i][2].equals("어른")) {
//						vl.dayAdult += Integer.parseInt(vl.orderList[i][3]);
//					} else if (vl.orderList[i][2].equals("노인")) {
//						vl.dayOld += Integer.parseInt(vl.orderList[i][3]);
//					}
//					vl.day += Integer.parseInt(vl.orderList[i][3]);
//					vl.daySales += Integer.parseInt(vl.orderList[i][4]);
//				} else if (vl.orderList[i][1].equals("야간권")) {
//					if (vl.orderList[i][2].equals("유아")) {
//						vl.nightBaby += Integer.parseInt(vl.orderList[i][3]);
//					} else if (vl.orderList[i][2].equals("어린이")) {
//						vl.nightChild += Integer.parseInt(vl.orderList[i][3]);
//					} else if (vl.orderList[i][2].equals("청소년")) {
//						vl.nightTeen += Integer.parseInt(vl.orderList[i][3]);
//					} else if (vl.orderList[i][2].equals("어른")) {
//						vl.nightAdult += Integer.parseInt(vl.orderList[i][3]);
//					} else if (vl.orderList[i][2].equals("노인")) {
//						vl.nightOld += Integer.parseInt(vl.orderList[i][3]);
//					}
//					vl.night += Integer.parseInt(vl.orderList[i][3]);
//					vl.nightSales += Integer.parseInt(vl.orderList[i][4]);
//				}
//			} else {
//				
//			}
//		}
		
		//우대권 판매현황
//		for (int i = 0; i < vl.orderList.length; i++) {
//			if (vl.orderList[i][0] != null) {
//				if (vl.orderList[i][5].equals("없음")) {
//					vl.none += Integer.parseInt(vl.orderList[i][3]);
//				} else if (vl.orderList[i][5].equals("장애인")) {
//					vl.disable += Integer.parseInt(vl.orderList[i][3]);
//				} else if (vl.orderList[i][5].equals("국가유공자")) {
//					vl.merit += Integer.parseInt(vl.orderList[i][3]);
//				} else if (vl.orderList[i][5].equals("다자녀")) {
//					vl.multichild += Integer.parseInt(vl.orderList[i][3]);
//				} else if (vl.orderList[i][5].equals("임산부")) {
//					vl.pregnant += Integer.parseInt(vl.orderList[i][3]);
//				}
//				vl.totalcnt += Integer.parseInt(vl.orderList[i][3]);
//			} else {
//				
//			}
//		}
		
	}
//	public static void saveOrderList(String date, String ticketSelect, String age, String orderCount,
//			String priceResult, String discountSelect, int position, String orderList[][]) {
//		orderList[position][0] = date;
//		orderList[position][1] = ticketSelect;
//		orderList[position][2] = age;
//		orderList[position][3] = orderCount;
//		orderList[position][4] = priceResult;
//		orderList[position][5] = discountSelect;
//		
//	}

}
