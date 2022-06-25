package com.company.tree.program;

import java.awt.EventQueue;

import static java.awt.Frame.MAXIMIZED_BOTH;

import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.UIManager;

import com.company.util.SwingUtils;


public class Program {

    /**
     * 5. Найти минимум из значений, записанных в двоичном дереве для вещественных чисел.
     */

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.ROOT);
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        SwingUtils.setDefaultFont("Arial", 20);

        EventQueue.invokeLater(() -> {
            try {
                JFrame frameMain = new TreeDemoFrame();
                frameMain.setVisible(true);
                frameMain.setExtendedState(MAXIMIZED_BOTH);
            } catch (Exception ex) {
                SwingUtils.showErrorMessageBox(ex);
            }
        });
    }
}
