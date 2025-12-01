
package MetodosComunes;


import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
public class ImportarExportar {
    
    public static void exportarCSV(JTable tabla, Component parent) {
        JFileChooser fc = new JFileChooser();
        int seleccion = fc.showSaveDialog(parent);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = fc.getSelectedFile();

            if (!archivo.getName().toLowerCase().endsWith(".csv")) {
                archivo = new File(archivo.getParentFile(), archivo.getName() + ".csv");
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
                
                for (int i = 0; i < tabla.getColumnCount(); i++) {
                    bw.write(tabla.getColumnName(i));
                    if (i < tabla.getColumnCount() - 1) {
                        bw.write(",");
                    }
                }
                bw.newLine();

                for (int i = 0; i < tabla.getRowCount(); i++) {
                    for (int j = 0; j < tabla.getColumnCount(); j++) {
                        Object valor = tabla.getValueAt(i, j);
                        if (valor != null) {
                            bw.write(valor.toString());
                        }
                        if (j < tabla.getColumnCount() - 1) {
                            bw.write(",");
                        }
                    }
                    bw.newLine();
                }
                
                JOptionPane.showMessageDialog(parent, "Datos exportados correctamente.");

            } catch (IOException e) {
                JOptionPane.showMessageDialog(parent, "Error al exportar: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }
    
    
}
