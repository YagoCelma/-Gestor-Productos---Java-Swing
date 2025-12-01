
package MetodosComunes;

import javax.swing.table.DefaultTableModel;
import java.util.regex.Pattern;


public class MetodosComunes {
    
    private DefaultTableModel modelo;
    private final String[] letrasDNI = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
    
    // Función que aplica la regla del doble dígito (si el resultado es >= 10, sumas sus cifras)
    public int sumarCifrasSiEsDoble(int numero) {
        // Si el número es 10 o más (dos cifras), suma sus dígitos.
        if (numero >= 10) {
            return (numero % 10) + (numero / 10);
        } else {
            return numero;
        }
    }
    
    public boolean comprobarNif(String nif){

        if(nif == null || nif.length() != 9){
            return false;
        }

        nif = nif.toUpperCase().trim();
        try{
            char prefijo = nif.charAt(0);
            char ultimoCaracter = nif.charAt(8);

            String nifTexto = nif.substring(1, 8);

            // Cambiamos solo esta parte: aseguramos que son números
            if (!nifTexto.matches("\\d{7}")) {
                return false;
            }

            // Para coger el caracter correcto del numero total
            char Cimpar1 = nifTexto.charAt(0);
            char Cpar1 = nifTexto.charAt(1);
            char Cimpar2 = nifTexto.charAt(2);
            char Cpar2 = nifTexto.charAt(3);
            char Cimpar3 = nifTexto.charAt(4);
            char Cpar3 = nifTexto.charAt(5);
            char Cimpar4 = nifTexto.charAt(6);

            // Parsear a número
            int impar1 = Character.getNumericValue(Cimpar1);
            int par1 = Character.getNumericValue(Cpar1);
            int impar2 = Character.getNumericValue(Cimpar2);
            int par2 = Character.getNumericValue(Cpar2);
            int impar3 = Character.getNumericValue(Cimpar3);
            int par3 = Character.getNumericValue(Cpar3);
            int impar4 = Character.getNumericValue(Cimpar4);

            //los impares se multiplican por 2
            int impar1Corregido = sumarCifrasSiEsDoble(impar1 * 2);
            int impar2Corregido = sumarCifrasSiEsDoble(impar2 * 2);
            int impar3Corregido = sumarCifrasSiEsDoble(impar3 * 2);
            int impar4Corregido = sumarCifrasSiEsDoble(impar4 * 2);

            //los pares se suman tal cual
            int sumaImpares = impar1Corregido + impar2Corregido + impar3Corregido + impar4Corregido;
            int sumaPares = par1 + par2 + par3;

            int sumaTotal = sumaImpares + sumaPares;
            int modulo10 = sumaTotal % 10;
            int dcn = 10 - modulo10;
            if (dcn == 10){
                dcn = 0;
            }

            String letrasControl = "JABCDEFGHI";

            if("ABEH".indexOf(prefijo) != -1){
                char dcnChar = Character.forDigit(dcn, 10);
                return dcnChar == ultimoCaracter;
            }else if("KPQSW".indexOf(prefijo) != -1){
                char letraCalculada = letrasControl.charAt(dcn);
                return letraCalculada == ultimoCaracter;
            }else{
                char dcnChar = Character.forDigit(dcn, 10);
                char letraCalculada = letrasControl.charAt(dcn);
                return (dcnChar == ultimoCaracter || letraCalculada == ultimoCaracter);
            }

        }catch(Exception e){
            System.out.print(e.getMessage());
            return false;
        }
    }

    public boolean comprobarCorreo(String correo) {

        if (correo == null) {
            return false;
        }

        String patron = "\\S+@\\S+\\.\\S+";

        return correo.matches(patron);
    }
    
    
    
}
