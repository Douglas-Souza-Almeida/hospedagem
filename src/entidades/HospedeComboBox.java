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
public class HospedeComboBox extends AbstractListModel implements ComboBoxModel{
	
	private List<Hospede> listaHospede;
	private Hospede hospedeSelecionado;
	
	public HospedeComboBox(){
		this.listaHospede = new ArrayList<>();
	} 

	@Override
	public int getSize() {
		return listaHospede.size(); 
	}

	@Override
	public Object getElementAt(int index) {
		 return this.listaHospede.get(index);
	}

	@Override
	public void setSelectedItem(Object anItem) {
		if(anItem instanceof Hospede){
			this.hospedeSelecionado = (Hospede) anItem;
			fireContentsChanged(this.listaHospede,0,this.listaHospede.size());
		}
	}

	@Override
	public Object getSelectedItem() {
		return this.hospedeSelecionado;
	}
	
	public void addHospedes(Hospede hospede){
		this.listaHospede.add(hospede);
	}
}
