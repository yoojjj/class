import java.util.Arrays;	
public class 자바배열응용_선택정렬2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha=new char[7];
		//ASC 올림차순
		for(int i=0;i<alpha.length;i++)
		{
			alpha[i]=(char)((Math.random()*26)+65);
		}
		System.out.println(Arrays.toString(alpha));
		//Arrays.sort(alpha);
		for(int i=0;i<alpha.length-1;i++)
		{
			for(int j=i+1;j<alpha.length;j++)
			{
				// 교환
				if(alpha[i]>alpha[j])
				{
					char temp=alpha[i];
					alpha[i]=alpha[j];
					alpha[j]=temp;
				}
			}
		}
		//System.out.println(new String(alpha));
		s=s.valueOf(alpha);//char[]=>string
		System.out.println(s);
	}

}
