
public class GiaiPt {
	public String Giai(int a, int b, int c){
		int delta = b*b - 4*a*c;
		double x = (double)-c/b;
		String result = "";
		double y = (double)Math.round(x*10)/10;
		
		if( a == 0 ){
			return Double.toString(y);
		}
		
		if( a!= 0 && delta > 0 ){
			double x1= ( -b + Math.sqrt(delta) ) / (2*a);
			double x2= ( -b - Math.sqrt(delta) ) / (2*a);
			result = (double)Math.round(x1*100)/100 + ";" + (double)Math.round(x2*10)/10;
			//System.out.println(result);
			return result;
		}
		
		if(  a!= 0 && delta < 0 ){
			return "VN";
		}
		
		if( a!= 0 && delta == 0 ){
			x = (double)-b/(2*a);
			result = Double.toString((double)Math.round(x*10)/10);
			return result;
		}
		return "";
	}
}
