package br.com.sast.dto;

import java.util.List;

import br.com.sast.model.Checklist;
import br.com.sast.model.CabecalhoChecklist;

public class ChecklistDTO {
	
	private CabecalhoChecklist cabecalhoChecklist;
	private List<Checklist> checklists;
	
	
	public CabecalhoChecklist getCabecalhoChecklist() {
		return cabecalhoChecklist;
	}
	public void setCabecalhoChecklist(CabecalhoChecklist cabecalhoChecklist) {
		this.cabecalhoChecklist = cabecalhoChecklist;
	}
	public List<Checklist> getChecklists() {
		return checklists;
	}
	public void setChecklists(List<Checklist> checklists) {
		this.checklists = checklists;
	}
	
	

}
