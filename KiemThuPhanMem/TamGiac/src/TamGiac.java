
public class TamGiac {

	/**
	 * @param args
	 */
	public int check(int a,int b,int c){

		if(a<0||b<0||c<0) 
			return -1; // đầu vào lỗi
		if(a+b<c||b+c<a||c+a<b) 
			return 0;  // không là tam giác
		else 
		{
			if(a==b)
			{
				if(b==c) 
					return 3; // là tam giác đều
				else 
					return 2; //là tam giác cân
			}
			else
			{
				if(b==c) 
					return 2; // là tam giác cân
				else 
					return 1; // là tam giác thường
			}
		}

	}
}


