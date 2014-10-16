
public class Check_Triangle {
	public String check(double a, double b, double c){
		String s = "";
		if(((a+b)>c) && ((b+c)>a) && ((a+c) >b) && 
				(a>0) && (b>0) && (c>0))
		{
			if((a==b)&&(b==c)) 
				s = "Tam giac deu";
			else if((a==b) || (b==c) || (c==a))
				s = "Tam giac can";
			else if(((a*a + b*b == c*c) && (a==b)) ||
					((a*a + c*c == b*b) && (a==c)) ||
					((b*b + c*c == a*a) && (b==c)))
			{
				s = "Tam giac vuong can";
			}
			else if((a*a + b*b == c*c) || (b*b + c*c == a*a) || (a*a + c*c == b*b))
				s = "Tam giac vuong";
			else 
				s = "Tam giac thuong";
				
		}
		else
			s = "Khong la tam giac";
		
		return s;
	
	}

}
