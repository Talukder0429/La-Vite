package helpers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DateConverterTest{

	private String string1 = "1997-03-19";
	Date date1 = new Date();
	/**
	 * test converting string to date with 1997-03-19
	 * @throws ParseException 
	 */
	@Test
	@DisplayName("string to date")
	public void testStringToDate() throws ParseException
	{
		DateConverter d = new DateConverter(string1);
		
		String dateInString = "1997-03-19";
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
		    date1 = formatter.parse(dateInString);
		} catch (ParseException e) {
		    //handle exception if date is not in "dd-MMM-yyyy" format
		}
		assertEquals(date1, d.getDate());
	}

	/**
	 * test converting date to string with 2000-04-12
	 */
	@Test
	@DisplayName("date to string")
	public void testDateToString()
	{
		String dateInString = "2000-04-12";
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
		    date1 = formatter.parse(dateInString);
		} catch (ParseException e) {
		    //handle exception if date is not in "dd-MMM-yyyy" format
		}
		DateConverter s = new DateConverter(date1);
		assertEquals("2000-04-12", s.getDateAsString());
	}

}