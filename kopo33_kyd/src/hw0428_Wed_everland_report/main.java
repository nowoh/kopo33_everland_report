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
//						//ù ��(title) �б�
//		}
		

//		//������ ī��Ʈ
//		int day = 0; int night = 0;
//		int dayBaby = 0; int dayChild = 0; int dayTeen = 0; int dayAdult = 0; int dayOld = 0;
//		int nightBaby = 0; int nightChild = 0; int nightTeen = 0; int nightAdult = 0; int nightOld = 0;
//		int daySales = 0; int nightSales = 0;
//		
//		//���� ī��Ʈ
//		int totalcnt = 0;
//		int none = 0; int disable = 0; int merit = 0; int multichild = 0; int pregnant = 0;
//		
//		//���ں� ī��Ʈ
//		int dateSales = 0;
//		
//		//csv���� ������ �迭 ����
//		String[][] orderList = new String[100][6];
//		
//		//�迭 �� ��ȣ
//		int position = 0;
		
		//csv���� ������ �迭�� �ֱ�
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
		
		
		//���ں� �м�
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

		
		//������ ī��Ʈ
//		for (int i = 0; i < vl.orderList.length; i++) {
//			if (vl.orderList[i][0] != null) {
//				if (vl.orderList[i][1].equals("�ְ���")) {
//					if (vl.orderList[i][2].equals("����")) {
//						vl.dayBaby += Integer.parseInt(vl.orderList[i][3]);
//					} else if (vl.orderList[i][2].equals("���")) {
//						vl.dayChild += Integer.parseInt(vl.orderList[i][3]);
//					} else if (vl.orderList[i][2].equals("û�ҳ�")) {
//						vl.dayTeen += Integer.parseInt(vl.orderList[i][3]);
//					} else if (vl.orderList[i][2].equals("�")) {
//						vl.dayAdult += Integer.parseInt(vl.orderList[i][3]);
//					} else if (vl.orderList[i][2].equals("����")) {
//						vl.dayOld += Integer.parseInt(vl.orderList[i][3]);
//					}
//					vl.day += Integer.parseInt(vl.orderList[i][3]);
//					vl.daySales += Integer.parseInt(vl.orderList[i][4]);
//				} else if (vl.orderList[i][1].equals("�߰���")) {
//					if (vl.orderList[i][2].equals("����")) {
//						vl.nightBaby += Integer.parseInt(vl.orderList[i][3]);
//					} else if (vl.orderList[i][2].equals("���")) {
//						vl.nightChild += Integer.parseInt(vl.orderList[i][3]);
//					} else if (vl.orderList[i][2].equals("û�ҳ�")) {
//						vl.nightTeen += Integer.parseInt(vl.orderList[i][3]);
//					} else if (vl.orderList[i][2].equals("�")) {
//						vl.nightAdult += Integer.parseInt(vl.orderList[i][3]);
//					} else if (vl.orderList[i][2].equals("����")) {
//						vl.nightOld += Integer.parseInt(vl.orderList[i][3]);
//					}
//					vl.night += Integer.parseInt(vl.orderList[i][3]);
//					vl.nightSales += Integer.parseInt(vl.orderList[i][4]);
//				}
//			} else {
//				
//			}
//		}
		
		//���� �Ǹ���Ȳ
//		for (int i = 0; i < vl.orderList.length; i++) {
//			if (vl.orderList[i][0] != null) {
//				if (vl.orderList[i][5].equals("����")) {
//					vl.none += Integer.parseInt(vl.orderList[i][3]);
//				} else if (vl.orderList[i][5].equals("�����")) {
//					vl.disable += Integer.parseInt(vl.orderList[i][3]);
//				} else if (vl.orderList[i][5].equals("����������")) {
//					vl.merit += Integer.parseInt(vl.orderList[i][3]);
//				} else if (vl.orderList[i][5].equals("���ڳ�")) {
//					vl.multichild += Integer.parseInt(vl.orderList[i][3]);
//				} else if (vl.orderList[i][5].equals("�ӻ��")) {
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
