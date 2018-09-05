import java.util.Scanner;

public class MonthTest {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double[] temperature= { -5.0, 0.2, 7.0, 9.5, 15.0, 25.5, 28.0, 30.5, 29.5, 18.5, 8.0, -1.5 };//크기가 12인 배열에 각 달의 평균기온을 저장
		int month;//달 변수
		
		while (true)//무한루프
		{
			System.out.printf("월(1~12)을 입력하세요:");
			month=scan.nextInt();
			if (month <= 0 || month>12)//입력한 달이 1~12월 사이가 아닌 경우
			{
				System.out.printf("다시 입력하십시오 \n");
			}
			else//1~12월 사이의 달을 입력했을 때
			{
				break;//무한루프 탈출
			}
		}

		System.out.printf("%d월의 평균기온: %.1f", month, temperature[month - 1]);//입력한 달의 평균기온을 출력

	}

}
