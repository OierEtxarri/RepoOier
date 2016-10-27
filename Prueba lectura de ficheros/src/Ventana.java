import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Ventana extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
			//Creamos un string con el directorio que queremos utilizar
			String d = new String("/Users/MacOier/Music");
			//Convertimos ese String a File
			File f = new File(d);
			//
			File[] ficheros = f.listFiles();
			
			PruebaFicheros.listaArchivosDirectorio("/Users/MacOier/Music");
		
			
		JList list = new JList();	
		//No sabemos como meter un array de Archivos en un JList... RESOLUCION: crear un model(lo que lleva los datos del JList), crear una variable tipo file que recorra ficheros
		DefaultListModel<File2> dlm = new DefaultListModel<>();
		for(File fic:ficheros ){
			dlm.addElement(new File2(fic.getAbsolutePath()));
		}
		list.setModel(dlm);
		contentPane.setLayout(null);
		
		
		
		
	
		
		list.setBackground(Color.CYAN);
		list.setBounds(6, 5, 100, 150);
		list.setVisibleRowCount(20);
		
			contentPane.add(list);
			
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon("/Users/MacOier/Desktop/Captura de pantalla 2016-10-19 a las 10.36.17.png"));
			lblNewLabel.setBounds(131, 40, 194, 201);
			contentPane.add(lblNewLabel);
			
	}
	
}
class File2 extends File{

	public File2(String pathname) {
		super(pathname);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return getName();
	}
	
}

