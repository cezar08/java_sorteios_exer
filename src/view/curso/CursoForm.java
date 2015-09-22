package view.curso;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


import entity.Curso;
import factory.RepositoryFactory;

@SuppressWarnings("serial")
public class CursoForm extends JInternalFrame{

	private JTextField nomeCursoTextField;		
	private JButton btnVoltar;
	
	public CursoForm() {
		setTitle("Novo curso");		
		JLabel nomeCursoLabel = new JLabel();
		nomeCursoLabel.setText(" Nome do curso: ");
		nomeCursoTextField = new JTextField("", 20);
		JButton btnSalvar = new JButton();
		btnSalvar.setText("Salvar");		
		
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Curso curso = new Curso();
				curso.setNomeCurso(nomeCursoTextField.getText());				
				RepositoryFactory.getInstance().getCursos().add(curso);
				nomeCursoTextField.setText("");
				JOptionPane.showMessageDialog(null, "Curso adicionado com sucesso");
			}
		});
		
		btnVoltar = new JButton();
		btnVoltar.setText("Voltar");	
		add(nomeCursoLabel);
		add(nomeCursoTextField);
		add(btnSalvar);
		add(btnVoltar);
		
		setLayout(new FlowLayout());
		setSize(800,640);
	}
	
	public JButton getBtnVoltar()
	{
		return btnVoltar;
	}
	
	public JTextField getNomeCursoTextField()
	{
		return nomeCursoTextField;
	}
	
}
