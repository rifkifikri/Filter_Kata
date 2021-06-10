import java.util.stream.Stream;
public class PecahKata {
	private String kalimat2="";
	public String kataBenar(String kalimat1) {
		 
		String[] kalArry = kalimat1.split(" ");
		
		Stream.of(kalArry).distinct().forEach(i -> kalimat2 += " "+i);
		return kalimat2;
	}
	public int jmlKata(String kalimat1) {
		String[] kalArry = kalimat1.split(" ");
		int y = 0 ;
		for (int A = 0; A < kalArry.length; A++) {
			  for (int B = 0; B < kalArry.length; B++) {
			    if (A != B && kalArry[A].equals(kalArry[B])) {
			    	y = y +1;
			    	
			    }
			  }
		}
		return y/2;
	}
}
