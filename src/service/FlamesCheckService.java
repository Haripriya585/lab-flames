package service;
import java.lang.*;
// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value

public class FlamesCheckService{
	public char findFlames(String name1, String name2) {
		char result='0';
		if(name1 != null &&  name2!=null) {
		name1 = name1.toLowerCase();
        name2 = name2.toLowerCase();
		StringBuilder s1 = new StringBuilder(name1);
		StringBuilder s2 = new StringBuilder(name2);
		int x=s1.length();
		int y=s2.length();
//		char result='0';
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				if(s1.charAt(i) == s2.charAt(j))
                {
                    s1.replace(i, i+1, "0"); 
                    s2.replace(j,j+1,"0");
                }
			}
		}
		int count=0;
		for(int i=0;i<x;i++) {
			if(s1.charAt(i)!='0') {
				count=count+1;
			}
		}
		for(int i=0;i<y;i++) {
			if(s2.charAt(i)!='0') {
				count=count+1;
			}
		}
		StringBuilder c = new StringBuilder("flames");
		while(c.length()!=1)
        {
            int res = count%c.length(); 
            String temp;
            
            if(res!=0)
            {
                temp = c.substring(res)+c.substring(0, res-1); 
                
            }
            else
            {
                temp = c.substring(0, c.length()-1); 
                
            }
            c = new StringBuilder(temp);
         }
		result=c.charAt(0);
		
		
	}
		return result;
	}
}