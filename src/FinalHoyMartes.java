import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@SuppressWarnings("serial")
public class FinalHoyMartes extends JFrame {

	private JPanel contentPane;
	private JTextField textCompre;
	private JTextField txtEstado;
	private JTextField txtAire;
	private JTextField txtNombreDelAlumno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinalHoyMartes frame = new FinalHoyMartes();
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
	public FinalHoyMartes() {
		setFont(new Font("Arial", Font.BOLD, 16));
		setTitle("Control de compresores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCompresor = new JButton("Compresor 1");
		btnCompresor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textCompre.setText("1");
			}
		});
		btnCompresor.setBounds(399, 55, 110, 34);
		contentPane.add(btnCompresor);
		
		JButton btnCompresor_1 = new JButton("Compresor 2");
		btnCompresor_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textCompre.setText("2");
			}
		});
		btnCompresor_1.setBounds(399, 100, 110, 34);
		contentPane.add(btnCompresor_1);
		
		JButton btnCompresor_2 = new JButton("Compresor 3");
		btnCompresor_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textCompre.setText("3");
			}
		});
		btnCompresor_2.setBounds(399, 151, 110, 34);
		contentPane.add(btnCompresor_2);
		
		textCompre = new JTextField();
		textCompre.setFont(new Font("Tahoma", Font.PLAIN, 35));
		textCompre.setHorizontalAlignment(SwingConstants.CENTER);
		textCompre.setBounds(538, 67, 86, 74);
		contentPane.add(textCompre);
		textCompre.setColumns(10);
		
		JLabel lblSeleccinDeLos = new JLabel("Selección de los compresores");
		lblSeleccinDeLos.setBounds(435, 11, 153, 23);
		contentPane.add(lblSeleccinDeLos);
		
		JButton btnAccionar = new JButton("Accionar");
		btnAccionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				  int valor= Integer.parseInt(txtAire.getText().toString());
				String sCompresor = textCompre.getText();
				if(sCompresor.equals("1") && valor >= 10 && valor <= 40){
					txtEstado.setText("Correcto");	
				}
				else if (sCompresor.equals("2") && valor >=50 && valor <=80){
					txtEstado.setText("Correcto");
				}
				else if(sCompresor.equals("3")&& valor >=90 && valor <=100){
					txtEstado.setText("Correcto");
				}
				else txtEstado.setText("Incorrecto");
			}
			});
		btnAccionar.setBounds(370, 240, 110, 40);
		contentPane.add(btnAccionar);
		
		
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			
			}
		});
		btnSalir.setBounds(504, 292, 110, 39);
		contentPane.add(btnSalir);
		
		txtEstado = new JTextField();
		txtEstado.setHorizontalAlignment(SwingConstants.CENTER);
		txtEstado.setBounds(504, 242, 110, 39);
		contentPane.add(txtEstado);
		txtEstado.setColumns(10);
		
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			   int iAire = Integer.parseInt(txtAire.getText());
				iAire = iAire+10;
				if (iAire <= 100){
					txtAire.setText(String.valueOf(iAire));	
				}
				repaint(); //código para actualizar el indicador, esto llama al método paint
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button.setBounds(151, 46, 55, 40);
		contentPane.add(button);
		
		JButton button_2 = new JButton("-");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int iAire = Integer.parseInt(txtAire.getText());
				iAire = iAire-10;
				if (iAire >= 0){
					txtAire.setText(String.valueOf(iAire));	
				}
				repaint();
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_2.setBounds(151, 83, 55, 40);
		contentPane.add(button_2);
		
		txtAire = new JTextField();
		txtAire.setFont(new Font("Arial", Font.BOLD, 15));
		txtAire.setText("0");
		txtAire.setHorizontalAlignment(SwingConstants.CENTER);
		txtAire.setColumns(10);
		txtAire.setBounds(55, 46, 86, 74);
		contentPane.add(txtAire);
		
		txtNombreDelAlumno = new JTextField();
		txtNombreDelAlumno.setText("Nombre del Alumno: Gustavo Emmanuel Rodriguez  De Oliveira");
		txtNombreDelAlumno.setBounds(10, 395, 489, 33);
		contentPane.add(txtNombreDelAlumno);
		txtNombreDelAlumno.setColumns(10);
		
		JLabel lblPorcentajeDeAire = new JLabel("Porcentaje de Aire Comprimido");
		lblPorcentajeDeAire.setBounds(61, 11, 161, 23);
		contentPane.add(lblPorcentajeDeAire);
		
		JButton btnInicializar_1 = new JButton("Inicializar");
		btnInicializar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtEstado.setText("-");
				txtAire.setText("0");
				textCompre.setText("-");
				repaint();
					}
				});
								
			
		btnInicializar_1.setBounds(370, 291, 110, 40);
		contentPane.add(btnInicializar_1);
	}
	//Código para el rectángulo con su porcentaje de incremento
	
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.black);
		g.drawRect(39,300,306,91);// Se dibuja todo en esta seción para el rectángulo...
		g.drawString("0",40,410);
		g.drawString("10",70,410);
		g.drawString("20",100,410);
		g.drawString("30",130,410);
		g.drawString("40",160,410);
		g.drawString("50",190,410);
		g.drawString("60",220,410);
		g.drawString("70",250,410);
		g.drawString("80",280,410);
		g.drawString("90",310,410);
		g.drawString("100%",340,410);
		int mover = Integer.parseInt(txtAire.getText().toString());
		if (mover == 0){
			g.setColor(Color.red);
			g.drawRect(40,300,5,90);
			g.fillRect(40,300,5,90);
			
		}
		else if (mover == 10){
			g.setColor(Color.red);
			g.drawRect(40,300,5,90);
			g.fillRect(40,300,35,90);
			
		}
		else if (mover == 20){
			g.setColor(Color.red);
			g.drawRect(40,300,5,90);
			g.fillRect(40,300,65,90);
			
		}
		else if (mover == 30){
			g.setColor(Color.red);
			g.drawRect(40,300,5,90);
			g.fillRect(40,300,95,90);
			
		}
		else if (mover == 40){
			g.setColor(Color.red);
			g.drawRect(40,300,5,90);
			g.fillRect(40,300,125,90);
			
		}
		else if (mover == 50 ){
			g.setColor(Color.red);
			g.drawRect(40,300,5,90);
			g.fillRect(40,300,155,90);
			
		}
		else if (mover == 60){
			g.setColor(Color.red);
			g.drawRect(40,300,5,90);
			g.fillRect(40,300,185,90);
			
		}
		else if (mover == 70){
			g.setColor(Color.red);
			g.drawRect(40,300,5,90);
			g.fillRect(40,300,215,90);
			
		}
		else if (mover == 80){
			g.setColor(Color.red);
			g.drawRect(40,300,5,90);
			g.fillRect(40,300,245,90);
			
		}
		else if (mover == 90){
			g.setColor(Color.red);
			g.drawRect(40,300,5,90);
			g.fillRect(40,300,275,90);
			
		}
		else if (mover == 100){
			g.setColor(Color.red);
			g.drawRect(40,300,5,90);
			g.fillRect(40,300,305,90);
			
		}
	

	}
}
