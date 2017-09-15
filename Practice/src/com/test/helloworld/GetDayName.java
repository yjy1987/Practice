package com.test.helloworld;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;

public class GetDayName {

	public String getDayName(int a, int b) {
	
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		StringBuffer sb = new StringBuffer();
		sb.append("2016");
		sb.append(String.format("%02d", a));
		sb.append(String.format("%02d", b));
		String date = sb.toString();
		Calendar cal = Calendar.getInstance();
		String answer = null;
		try {
			Date nDate = dateFormat.parse(date);
			cal.setTime(nDate);
			int dayNum = cal.get(Calendar.DAY_OF_WEEK);
			answer = DayOfWeek.of(dayNum).toString().substring(0,3);
		} catch (ParseException e) {
	
		}
			return answer;
	}

	public static void main(String[] args) {
		GetDayName test = new GetDayName();
		int a = 5, b = 24;
		System.out.println(test.getDayName(a, b));
	}
}
