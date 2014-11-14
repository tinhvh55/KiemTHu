
public class NextDate {
	public int Day;
	public int Month;
	public int Year;
	int nhuan[]={0,31,29,31,30,31,30,31,31,30,31,30,31,0};
	int thuong[]={0,31,28,31,30,31,30,31,31,30,31,30,31,0};

	public boolean checkDay(int day, int month ,int year){
	  boolean kg;
	  kg= checkYear(year)? (day<=nhuan[month]): (day<=thuong[month]);
	  return kg&&(day>=1)&&(month<=12) && (month >=1)&& (year>=1);
	}
	public String nextDate(int day,int month,int year){
		String result="";
		if (checkDay(day+1,month,year))
			result = day+1+"/"+month+"/"+year;
	    else
	    	if(checkDay(1,month+1,year)){
	    		int Month = month + 1;
	    		result = 1+"/"+Month+"/"+year;
	    	}
	    	else{
	    		int Year = year + 1;
	    		result = 1+"/"+1+"/"+Year;
	    	}
	    		
		return result;
	}

	public boolean checkYear(int year){
		if ( year%4 == 0 && year%100 != 0 ){
			return true;
		}
		if ( year%4 == 0 && year%100 == 0 && year%400 == 0 ){
			return true;
		}
		return false;
	}

}
