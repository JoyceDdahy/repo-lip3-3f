import javax.swing.JOptionPane;

public class ResultadoAluno {

	public static void main(String[] args) {
		
		double media = Double.parseDouble(JOptionPane.showInputDialog(null,"Media:"));
		
		if(media > 7) {
			JOptionPane.showMessageDialog(null,
					" Aprovado! " );
		} else if (media < 7) {
			JOptionPane.showMessageDialog(null,
					" Reprovado! " );
		}
		
				


	}

}
