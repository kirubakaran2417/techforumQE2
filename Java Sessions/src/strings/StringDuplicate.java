package strings;

public class StringDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="malayalam";
		int count; 
		char str[]=s.toCharArray(); 
		for(int i=0; i<str.length;i++) { 
			count=1; 
			for(int j=i+1;j<str.length;j++) { 
				if(str[i]==str[j] && str[i]!=' ') { 
					count++; //set string[j] to 0 to avoid printing visited characters. 
					str[j]=0; 
					} } //A character is considered as duplicate if the count is greater than 1 
			if(count>1 && str[i]!='0') { 
				System.out.println(str[i]); } } }
				}

