
package strategy;

import javax.swing.JOptionPane;
import strategy.model.Context;
import strategy.model.InvestAudaci;

/**
 *
 * @author Sandro
 */
public class GofStrategy {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new InvestAudaci());
        JOptionPane.showMessageDialog(null, "Valor total = " + context.calculaJuros(100));
    }
}
