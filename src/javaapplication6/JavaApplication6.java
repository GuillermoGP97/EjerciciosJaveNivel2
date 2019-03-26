/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author xp
 */
public class JavaApplication6 {
      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //pruebas escalera de palabras
        	char	[][]	listaPalabras	=   {
							{'P',	'A',	'T',	'A'},
							{'P',	'A',	'T',	'O'},
                                                        {'R',	'A',	'T',	'O'},
							{'R',	'A',	'M',	'O'},
							{'G',	'A',	'M',	'O'},
							{'G',	'A',	'T',	'O'},
							{'M',	'A',	'T',	'O'},
                };
       JavaApplication6 ejercicios = new JavaApplication6();
       //System.out.println(ejercicios.escaleraDePalabras(listaPalabras));
       
       System.out.println(ejercicios.costeErrores("ATT","TTA"));
       
      // pruebas mudanzas
        	boolean[][]	camion	=	{
												{false,	false,	false,	false,	false,	false,	false},
												{false,	false,	false,	false,	false,	false,	false},
												{false,	false,	false,	false,	false,	true,	true},
												{false,	false,	false,	false,	false,	false,	false },
												{true,	false,	false,	false,	false,	true,	false }
								};
         System.out.println(ejercicios.cabeUnaCaja(camion,1,2));
    
    }
    
   public boolean escaleraDePalabras(char [][] listaPalabras){
       boolean escalera=false;
       int cont2 =0;
       for(int i=1; i<listaPalabras.length; i++){
           int cont =0;
           for(int j=0; j<listaPalabras[0].length; j++){
            if(listaPalabras[i][j]==listaPalabras[i+1][j]){
                cont++;
            }
           }
           if (cont==listaPalabras[0].length-1){
               cont2++;
           }
       }
       if(cont2==listaPalabras.length-1){
           escalera = true;
       }
       return escalera;
   }

   public int costeErrores (String uno,String	dos){
    int coste=0;
    for(int i=0; i<uno.length();i++){
       
    }
    return coste;
}
   
   private	boolean	cabeUnaCaja(boolean[][]	camion,	int  ancho,int alto){
       if(ancho>camion.length || alto>camion[0].length ||ancho==0||alto==0){
           return false;
       }
       for(int i=0; i<camion.length-ancho; i++){
           int j=0;
           while (hayHueco(camion, ancho,alto)==false && hayHuecoGirada(camion, ancho,alto)==false && j<camion[0].length-alto){
               j++;
           } 
           if(hayHueco(camion, ancho,alto)||hayHuecoGirada(camion, ancho,alto)){
               return true;
           }
           }
       return false;
       }
   
   public boolean hayHueco(boolean[][]	camion,int  ancho,int alto){
       boolean cabe=false;
       int dim=ancho*alto;
       int cont=0;
       int i=0;
       
       while(i<=ancho-1){
        int j=0;
        while( j<=alto-1){
            if(camion[i][j]==true){
                  cont++;
              } 
            j++;
           }
        i++;
       }
       if (cont==dim){
           cabe= true;
       }
       return cabe;
   }
   
   public boolean hayHuecoGirada(boolean[][]	camion,int  ancho,int alto){
       int camb=ancho;
       ancho=alto;
       alto=camb;
       return hayHueco(camion,ancho,alto);
    }
}