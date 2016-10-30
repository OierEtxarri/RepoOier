package primerasPruebas;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.lang.Object;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;

import java.io.FileReader;
import java.io.IOException;


public class PruebaFicheros {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listaArchivosDirectorio("/Users/MacOier/Downloads");


	}
	//Método que abre cualquier fichero que le pasemos por parámetro
	public static void abrirFicheros(String archivo){
		try{
			//Creamos un JFileChooser para seleccionar archivos
			JFileChooser mirarArchivos = new JFileChooser();
			
			File objetofile = new File (archivo);
			Desktop.getDesktop().open(objetofile);
		
		//Lanza una excepción en caso de que no se pueda abrir el archivo 
		}catch(IOException ex){
			
			System.out.println(ex);
			
		}	
	}
		//Método que lista en un Array de archivos todos los archivos de un directorio
	public static void listaArchivosDirectorio (String directorio){
		JFileChooser elegir = new JFileChooser();
		try{
		
		File f= new File(directorio); 
		//Hacer que File[] ficheros guarde en cada posicion un archivo...
		File[] ficheros = f.listFiles();
		//Recorrer todo el directorio imprimiendo todos los archivos contenidos en él
		for (int i=0;i<ficheros.length;i++){
		  System.out.println(ficheros[i].getName());
		}
		DefaultListModel<File2> dlm = new DefaultListModel<>();
		for(File fic:ficheros ){
			dlm.addElement(new File2(fic.getAbsolutePath()));
		}
		
		
		}
		catch(Exception ex){
			System.out.println(ex);
		}
		  
		}
	
		
	
		
	

		
	

	
	

}
