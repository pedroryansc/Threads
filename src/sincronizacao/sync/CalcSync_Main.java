package sincronizacao.sync;

public class CalcSync_Main {
	public static void main(String[] args) {
		int[] vet = {1, 2, 3};
		CalcSync c1 = new CalcSync("T1", vet);
		CalcSync c2 = new CalcSync("T2", vet);
	}
}