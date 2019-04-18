package wombatukun.tests.test8.utils;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.XMLGregorianCalendar;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Map;

public class DateUtils {

	public static XMLGregorianCalendar mapDate(Map<String, Integer> date) {
		return XMLGregorianCalendarImpl.createDate(date.get("year"), date.get("month"), date.get("day"), DatatypeConstants.FIELD_UNDEFINED);
	}

	public static XMLGregorianCalendar mapDate(Date sqlDate) {
		LocalDate date = sqlDate.toLocalDate();
		return XMLGregorianCalendarImpl.createDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), DatatypeConstants.FIELD_UNDEFINED);
	}

}
