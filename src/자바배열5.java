
public class 자바배열5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5명의 이름 저장
		String[] names= {"홍길동","심청이","춘향이","박문수","이순신"};
		String[] sexs= {"남자","여자","여자","남자","남자"};
		// 출력 for each
		// 일반 for 홍길동(남자)
		for(int i=0;i<names.length;i++)
		{
			System.out.printf("%s(%s)\n",names[i],sexs[i]);
		}
	}
}
