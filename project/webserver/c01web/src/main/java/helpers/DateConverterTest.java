package helpers;

public class DateConverterTest {

	public static void main(String[] args) {
		DateConverter test= new DateConverter("1997-03-19");
		DateConverter date1 = new DateConverter("1999-09-09");
		System.out.println(test.getDate());
		System.out.println(test.getDateAsString());
		
		DateConverter test2 = new DateConverter(date1.getDate());
		System.out.println(test2.getDateAsString());
		System.out.println(test2.getDate());

	}

}
