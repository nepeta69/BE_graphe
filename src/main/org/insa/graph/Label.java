package org.insa.graph;


public class Label implements Comparable<Label> {
	private Node sommetCourant ;
	private boolean marque;
	private float cost;
	private Arc pere;

	public Label(Node node) {
		this.marque=false;
		this.cost=Float.MAX_VALUE; 
		this.pere=null; 
		this.sommetCourant=node;
	}

	public Node getSommetCourant() {
		return sommetCourant;
	}


	public int compareTo(Label autre) {
		return Float.compare(this.getTotalCost(),autre.getTotalCost());
	}

	public float getCost() {
		return this.cost;
	}
	public float setCost(float cost) {
		return this.cost=cost; 
	}

	public Arc getPere() {
		return pere;
	}

	public void setPere(Arc pere) {
		this.pere = pere;
	}

	public boolean isMarque() {
		return this.marque;
	}

	public void setMarque(boolean marque) {
		this.marque = marque;
	}
	
	public float getTotalCost() {
		return this.cost;
	}
}
