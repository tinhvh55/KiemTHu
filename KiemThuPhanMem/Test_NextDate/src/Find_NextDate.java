import java.*;

public class Find_NextDate {
	int date, month, year;
	
	public Find_NextDate(){
		
	}
	public Find_NextDate(int date, int month, int year){
		this.date = date;
		this.month = month;
		this.year = year;
	}
	public boolean is_leap(){
		if(year % 4==0 && year % 100 != 0)
			return true;
		return false;
	}
	
	public boolean check_Day() {
		if((date <= 0 || date > 31) || (month <= 0 || month >12)|| (year <= 0) )
			return false;
		
		if(month ==2){
			if(is_leap() == false)
			{
				if(date > 28)
					return false;
			}else if(date > 29)
					return false;
		}
		if(month == 4 || month == 6 || month == 9 || month == 11 )
			if(date > 30)
				return false;	
		return true;
	}
	
	public String get_NextDate(){
		 String nextdate = "";
		 if(check_Day() == true)
		 {
			 if((date == 28 && month == 2 && is_leap()==false) ||
				(date == 29 && month == 2 && is_leap() == true)){
				 date = 1; month = 3;
			 }
			 else if(date == 30 && (month == 4 || month == 6 || month == 9 || month==11))
			 {
				 date = 1; month++;
			 }
			 else if(date == 31 && (month ==1 || month == 3 || month == 5 ||
					 month == 7 || month == 8 || month == 10))
			 {
				 date = 1; 
				 month++;
			 }else if(date == 31 && month == 12){
				 date = 1;  month = 1; year++;
			 }
			 else date++;
			 
			 nextdate = date + "/" + month +"/"+year;
		 }
		 else nextdate = "Dữ liệu không hợp lệ";
		 
		 return nextdate;
	}
}
