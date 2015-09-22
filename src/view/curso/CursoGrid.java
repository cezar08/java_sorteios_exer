package view.curso;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

import entity.Curso;
import factory.RepositoryFactory;
@SuppressWarnings("serial")
public class CursoGrid extends JInternalFrame {
	
	private JScrollPane scrollPane;
	
	private JButton btnNovo; 
	
	private JTable table;
	
	private DefaultTableModel dtm;
	
	public CursoGrid() {	
		setTitle("Manter cursos");
		btnNovo = new JButton();
		btnNovo.setText("Novo curso");	
		JButton btnRemover = new JButton();
		btnRemover.setText("Remover");
		
		btnRemover.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                int selRow = table.getSelectedRow();
	                if(selRow != -1) {	                	
	                    dtm.removeRow(selRow);
	                    RepositoryFactory.getInstance().getCursos().remove(selRow);
	                }
	            }
        });
				
		add(btnNovo);
		add(btnRemover);
		setLayout(new FlowLayout());
		setSize(800, 640);		
	}
	
	public JButton getBtnNovo(){
		return btnNovo;
	}
	
	public void setTable(){
		List<Curso> cursos = RepositoryFactory.getInstance().getCursos();		
		Object rowData[][] = {};
		Object columnNames[] = {"Seq", "Curso"};
		table = new JTable(rowData, columnNames);
		dtm = new DefaultTableModel();
		dtm.addTableModelListener(new TableModelListener() {					
		      public void tableChanged(TableModelEvent e) {		    	  
		         if (e.getFirstRow() >= 0) {	
		        	 try{
			        	 String nomeCurso = dtm.getValueAt(e.getFirstRow(), 1).toString();		        	 
			        	 RepositoryFactory.getInstance().getCursos().
			        	 get(e.getFirstRow()).setNomeCurso(nomeCurso);
		        	 }catch (Exception exception) {
		        		 System.out.println("Linha não existe");
		        	 }
		         }
		      }
		    });
		dtm.setColumnIdentifiers(columnNames);
		table.setModel(dtm);
		
		for (Integer i = 0; i < cursos.size(); i++) {
			dtm.addRow(new Object[]{i.toString(), cursos.get(i).getNomeCurso()});			
		}
				
		scrollPane = new JScrollPane(table);
		add(scrollPane, BorderLayout.CENTER);
	}
	
	public void removeTable() {
		remove(0);
	}	
	
	public JScrollPane getScrollPane(){
		return scrollPane;
	}		
}
