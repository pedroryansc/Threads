package sincronizacao.notsync;

public class CalcNotSync_Main {
	public static void main(String[] args) {
		int[] vet = {1, 2, 3};
		CalcNotSync c1 = new CalcNotSync("T1", vet);
		CalcNotSync c2 = new CalcNotSync("T2", vet);
	}
}