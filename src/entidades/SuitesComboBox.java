/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author dougl
 */
public class SuitesComboBox extends AbstractListModel implements ComboBoxModel {
	private List<Suites> listaSuites;
	private Suites suiteSelecionada;
	
	public SuitesComboBox(){
		this.listaSuites = new ArrayList<>();
	} 

	@Override
	public int getSize() {
		return listaSuites.size();
	}

	@Override
	public Object getElementAt(int index) {
		return this.listaSuites.get(index);
	}

	@Override
	public void setSelectedItem(Object anItem) {
		if(anItem instanceof Suites){
			this.suiteSelecionada = (Suites) anItem;
			fireContentsChanged(this.listaSuites,0,this.listaSuites.size());
		}
	}

	@Override
	public Object getSelectedItem() {
		return this.suiteSelecionada;
	}
	
	public void addSuites(Suites suite){
		this.listaSuites.add(suite);
	}
	
}
