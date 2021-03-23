package Control;

import Model.CalculatorModel;
import View.CalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Console;

public class CalculatorController {
    CalculatorView view ;
    CalculatorModel model ;
    int keyReset = 0;
    public CalculatorController(CalculatorView view, CalculatorModel model){
        this.model = model;
        this.view = view;
        this.keyReset = 0;

        class listener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = e.getActionCommand();

                if (keyReset==1)
                {
                    view.setText("");
                    keyReset = 0;
                }

                if (s.charAt(0) =='x' || s.charAt (0) == '/' || s.charAt(0) == '.') {
                    view.setText("SOrry, not support!! Pls press AC");
                    return;
                }

                if (s == "AC"){
                    model.reset();
                    view.setText("");
                    return;
                }

                if (s.charAt(0) == '+' || s.charAt(0) == '-') {
                    view.setText(view.calText.getText() + s);
                    model.setDau(s.charAt(0));
                    return;
                }

                if (s.charAt(0) >='0' && s.charAt(0)<='9'){
                    view.setText(view.calText.getText() + s);
                    model.setNumber(s.charAt(0));
                    return;
                }
                if (s.charAt(0) =='='){
                    view.setText(  view.calText.getText()  + "=" + String.valueOf( model.getRes() ) );
                    model.reset();
                    keyReset = 1;
                }
            }
        }

        view.calCong.addActionListener( new listener());
        view.cal1.addActionListener( new listener() );
        view.cal2.addActionListener(new listener());
        view.cal3.addActionListener(new listener());
        view.calTru.addActionListener(new listener());
        view.cal4.addActionListener(new listener());
        view.cal5.addActionListener(new listener());
        view.cal6.addActionListener(new listener());
        view.calNhan.addActionListener(new listener());
        view.cal7.addActionListener(new listener());
        view.cal8.addActionListener(new listener());
        view.cal9.addActionListener(new listener());
        view.calChia.addActionListener(new listener());
        view.calCham.addActionListener(new listener());
        view.cal0.addActionListener(new listener());
        view.calAC.addActionListener(new listener());
        view.calBang.addActionListener(new listener());

    }
}
