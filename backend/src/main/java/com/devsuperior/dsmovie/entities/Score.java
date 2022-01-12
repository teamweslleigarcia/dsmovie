package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {
	
	@EmbeddedId
	private ScorePK id = new ScorePK(); //id composto
	
	private Double value;
	
	public Score() {
		
	}
	
	//para associar o Movie com o Score 
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	
	//para associar o User com o Score 
	public void setUser(User user) {
		id.setUser(user);
	}

	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	};
	
	
	
}
