package Main;

import Control.CalculatorController;
import Model.CalculatorModel;
import View.CalculatorView;

public class CalculatorMain {
    public static void main(String[] args){
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        new CalculatorController(view, model);
    }
}
