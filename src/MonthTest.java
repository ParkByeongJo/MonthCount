import java.util.Scanner;

public class MonthTest {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double[] temperature= { -5.0, 0.2, 7.0, 9.5, 15.0, 25.5, 28.0, 30.5, 29.5, 18.5, 8.0, -1.5 };//ũ�Ⱑ 12�� �迭�� �� ���� ��ձ���� ����
		int month;//�� ����
		
		while (true)//���ѷ���
		{
			System.out.printf("��(1~12)�� �Է��ϼ���:");
			month=scan.nextInt();
			if (month <= 0 || month>12)//�Է��� ���� 1~12�� ���̰� �ƴ� ���
			{
				System.out.printf("�ٽ� �Է��Ͻʽÿ� \n");
			}
			else//1~12�� ������ ���� �Է����� ��
			{
				break;//���ѷ��� Ż��
			}
		}

		System.out.printf("%d���� ��ձ��: %.1f", month, temperature[month - 1]);//�Է��� ���� ��ձ���� ���

	}

}
