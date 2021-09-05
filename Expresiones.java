/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresiones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author erikj
 */
public class Expresiones {

    /**
     * @param args the command line arguments
     */
    private void vocales(String texto){
        int vocalNumero = 0;
        char letras;
        for(int i =0; i<texto.length();i++){
            letras = texto.charAt(i);
            if(letras == 'a'){
            vocalNumero +=1;
        }else if(letras == 'e'){
             vocalNumero +=1;
        }else if(letras == 'i'){
             vocalNumero +=1;
        }else if(letras == 'o'){
             vocalNumero +=1;
        }else if(letras == 'u'){
             vocalNumero +=1;
        }
        }
        System.out.println("La cadena contiene: "+vocalNumero+" Vocales");
    }
    private String remplazo(String texto){
         //String palabra2 = "Cause baby you're a firework";
        String str2 = texto.replaceAll("i","wi");
        String palabra3 = str2.replaceAll("I","wi");
        texto = palabra3.replaceAll("e","we");
        return texto+"owo";
    }
    private String remplazoVocales(String cadena){
        String str2 = cadena.replaceAll("i","");
        cadena = str2.replaceAll("a","");
        str2 = cadena.replaceAll("e","");
        cadena = str2.replaceAll("o","");
        str2 = cadena.replaceAll("u","");
        return str2;
    }
    public static boolean letras(String cadena){
String expR = ".*aa.*|.*bb.*|.*cc.*|.*dd.*|.*ee.*|.*ff.*|.*gg.*"
        + "|.*hh.*|.*ii.*|.*jj.*|.*kk.*|.*ll.*|.*mm.*|.*nn.*|"
        + ".*oo.*|.*pp.*|.*qq.*|.*rr.*|.*ss.*|.*tt.*|.*uu.*|.*vv.*|"
        + ".*ww.*|.*xx.*|.*yy.*|.*zz.*|.*ññ.*";
Pattern pat = Pattern.compile(expR);
Matcher mat = pat.matcher(cadena);
return mat.matches();
}

    public static void main(String[] args) {
      Expresiones prog = new Expresiones();
     String texto = prog.remplazo("Im gonna ride til I cant no more");
        System.out.println(texto);
      prog.vocales("Celebracion");
      System.out.println(letras("loop"));
      String cambio = prog.remplazoVocales("We're gonna build a wall!");
        System.out.println(cambio);
        
    }
    
}
