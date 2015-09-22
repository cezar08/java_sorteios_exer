package view.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import view.curso.CursoForm;
import view.curso.CursoGrid;

@SuppressWarnings("serial")
public class Menu extends JFrame{
	
	private CursoGrid cursoGrid;
	private CursoForm cursoForm;
	
	public Menu()
	{
		setTitle("Sorteio");
		setSize(800, 640);		
		JMenuBar menuBar = new JMenuBar();
		
		setJMenuBar(menuBar);		
		JMenu cadastrosMenu = new JMenu("Cadastros");
		JMenu sorteioMenu = new JMenu("Sorteio");
		
		menuBar.add(cadastrosMenu);
		menuBar.add(sorteioMenu);
		
		JMenuItem cursosMenuItem = new JMenuItem("Cursos");
		menuCurso(cursosMenuItem);

		JMenuItem cidadesMenuItem = new JMenuItem("Cidades");
						
		JMenuItem eventosMenuItem = new JMenuItem("Eventos");		
				
		cadastrosMenu.add(cursosMenuItem);	
		cadastrosMenu.add(cidadesMenuItem);
		cadastrosMenu.add(eventosMenuItem);
		
		JMenuItem novoSorteioItem = new JMenuItem("Novo sorteio");
				
		JMenuItem ganhadores = new JMenuItem("Ganhadores");					
		sorteioMenu.add(novoSorteioItem);
		sorteioMenu.add(ganhadores);
	}
	
	private void menuCurso(JMenuItem cursosMenuItem) {
		cursosMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	
				
				if (cursoForm != null) {
					cursoForm.setVisible(false);
					cursoForm.getNomeCursoTextField().setText("");
				}
				
				if (cursoGrid == null) {
					cursoGrid = new CursoGrid();
					cursoGrid.setTable();
					add(cursoGrid);	
				}
												
				cursoGrid.getBtnNovo().addActionListener(new ActionListener() {			
					@Override
					public void actionPerformed(ActionEvent e) {	
						if (cursoForm == null) {
							cursoForm = new CursoForm();
							add(cursoForm);			
						}
						cursoForm.getBtnVoltar().addActionListener(new ActionListener() {							
							@Override
							public void actionPerformed(ActionEvent e) {																	
								cursoForm.setVisible(false);
								cursoForm.getNomeCursoTextField().setText("");
								cursoGrid.setVisible(true);
								cursoGrid.getScrollPane().removeAll();
								cursoGrid.setTable();
								
							}
						});
						cursoGrid.setVisible(false);
						cursoForm.setVisible(true);										
					}
				});
									
				cursoGrid.setVisible(true);				
			}
		});
		
	}
	
}
