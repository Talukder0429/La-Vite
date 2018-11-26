package helpers;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/** Converts strings into dates for certain fields
 * @author tonyz
 */
public class DateConverter {
	private String date_string = "";
	private Date date;
	private Calendar calendar;
	
	public DateConverter(String text) throws ParseException {
		this.date_string = text;
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		this.date = df.parse(text);
		this.setCalendar();
	}
	
	public DateConverter(Date input_date) {
		this.date = input_date;
		DateFormat df = new SimpleDateFormat("YYYY-MM-dd");
		this.date_string = df.format(input_date);
		this.setCalendar();
	}
	
	private void setCalendar()
	{
		this.calendar = Calendar.getInstance();
		this.calendar.setTime(this.date);
	}
	
	public String getDateAsString(){
		return this.date_string;
	}	
	
	public Date getDate() {
		return this.date;
	}
	
	public Calendar getCalendar()
	{
		return this.calendar;
	}
	
	public int getYear()
	{
		return this.calendar.get(Calendar.YEAR);
	}
	
	public int getMonth()
	{
		return this.calendar.get(Calendar.MONTH);
	}
	
	//returns true if this converter and the one supplied have same year and date
	public boolean isSameYearAndMonth(DateConverter dc)
	{
		if (this.getYear() == dc.getYear())
		{
			if (this.getMonth() == dc.getMonth())
			{
				return true;
			}
		}
		return false;
	}
}
