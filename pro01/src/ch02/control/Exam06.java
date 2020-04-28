package ch02.control;

/**
 * @Author : 김경은
 * @Date : 2020. 4. 28.
 * @Description :  
 */
public class Exam06 {

	public static void main(String[] args) {
		int su=9;
		
		switch(su) { // 정수형, 문자형
		case 1:
			System.out.println("hahahaha");
			break;
		case 2:
			System.out.println("hohohoho");
			break;
		case 3:
			System.out.println("hihihihi");
			break;
		default:
			System.out.println("기타 등등 그외");
		}//if문은 조건에 맞으면 찾았다가 해당 블록밖으로 빠져나가지만, switch는 빠져나가지 못한다. 빠져나갸야 되기 때문에 break;문을 쓰는것.
		//switch와 break는 쌍이 아니다. 필요에 의해 break를 쓰는것.
		
		char a='B';
		switch(a) {
		case 'W':case 'w':
			System.out.println("White");
			break;
		case 'Y':case 'y':
			System.out.println("Yellow");
			break;
		case 'B':case 'b':
			System.out.println("Blue");
			break;
		case 'R':case'r':
			System.out.println("Red");
			break;
		}
	}

}





