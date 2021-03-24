package it.polito.tdp.corsi.model;

import java.util.List;
import java.util.Map;

import it.polito.tdp.corsi.db.CorsoDAO;

public class Model {
	private CorsoDAO corsodao;
	
	public Model() {
		corsodao= new CorsoDAO();
	}
	
	public List <Corso> getCorsiByPeriodo(Integer pd){
		return corsodao.getCorsiByPeriodo(pd);
	}
	
	public Map<Corso,Integer> getIscrittiByPeriodo(Integer pd){
		return corsodao.getiscrittiByPeriodo(pd);
	}
	
}
