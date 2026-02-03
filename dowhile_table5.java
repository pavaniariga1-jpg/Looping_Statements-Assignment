package looping_statements;

public class dowhile_table5 {
	public static void main(String[] args) {
		int i=1; int mul; int num=5;
		do {
			mul=i*num;
			System.out.println(num+"*"+i+"="+mul);
			i++;
		} while(i<=10);
	}

}
