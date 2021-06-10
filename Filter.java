import java.util.Scanner;
public class Filter {
	public static void main(String[] args) {
		String kalimat2 = "";
		int y = 0,x;
		
		PecahKata kata = new PecahKata();
		Scanner filter= new Scanner(System.in);
		Scanner input= new Scanner(System.in);
		
		System.out.print("ada berapa kalimat yang ingin di filter? ");
		x=filter.nextInt();
		
		String kalimat1[] = new String[6];
		
		for(int i = x;i>0;i--) {
			System.out.print("Masukkan kalimat yang ke-"+i+" : ");
			kalimat1[i]=input.nextLine();
			 
			System.out.println(kata.kataBenar(kalimat1[i]));
			System.out.println(kata.jmlKata("ditemukan jumlah kata yang sama :"+kalimat1[i]));
		}
	}
}