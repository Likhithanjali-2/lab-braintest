package service;

public class PersonalityCalculator{
	int A,B,result;
	int arr[]=new int[20];
	public String findYourBrainType(String options) {
		findAnswers(options);
		A=arr[0]+arr[1]+arr[2]+arr[4]+arr[7]+arr[9]+arr[10]+arr[11]+arr[13]+arr[17]+arr[19];
		B=arr[3] +arr[5]+arr[6] + arr[8] + arr[12] +arr[14] + arr[15] +arr[16]+ arr[18];
		result=66-A+B;
		if(result >= 20 && result <= 55)
			return "leftbrained";
		else if(result >=56 && result <= 64)
	    	  return "noclearpreference";
		else if(result >= 65 && result <= 100)
			return "rightbrained";
		else
			return "nobrain";
	}
	int[] findAnswers(String str) {
		int pos=0;
		for(int i=0;i < str.length();i+=2) {
			arr[pos]=Character.getNumericValue(str.charAt(i));
			pos++;
		}
		return arr;
	}

	//ip = 1,2,3,2,1,4,2,2,2,2,2,4,3,2,3,4,2,3,2,4  a=26 b=24  66-26+24 ==>64 noclear appe..
} 
