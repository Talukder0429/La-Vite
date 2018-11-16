package helpers;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/** Converts strings into dates for certain fields
 * @author tonyz
 */
public class DateConverter {
	String date_string = "";
	Date date;
	
	public DateConverter(String text) {
		date_string = text;
		try {
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			date = df.parse(text);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public DateConverter(Date input_date) {
		date = input_date;
		DateFormat df = new SimpleDateFormat("YYYY-MM-dd");
		date_string = df.format(input_date);
	}
	public String getDateAsString(){
		return date_string;
	}	
	public Date getDate() {
		return date;
	}
	
	
}