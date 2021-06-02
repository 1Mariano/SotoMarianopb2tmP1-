package ar.edu.unlam.pb2.parcial1;

import java.util.ArrayList;
import java.util.List;

public class Actor {
	private String actor;
	private List<Actor> actores = new ArrayList<>();
	
	
	public Actor(String actor) {
		this.actor = actor;
	}

	
	public String getActor() {
		return actor;
	}
	
	public Boolean agregarActores(Actor actor) {
		return this.actores.add(actor);
	}
	
	public Boolean buscarActores(String actorABuscar) {
		for (Actor actor : actores) {
			if(actor.getActor().equals(actorABuscar))
			{
				return true;
			}
		}
		return false;
	}


	public List<Actor> getActores() {
		return actores;
	}


	public void setActores(List<Actor> actores) {
		this.actores = actores;
	}


	public void setActor(String actor) {
		this.actor = actor;
	}
	
}
