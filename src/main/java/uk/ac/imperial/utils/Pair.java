package uk.ac.imperial.utils;

/**
 * Simple class to store two types as a tuple pair
 * 
 * @param <L> left side of tuple
 * @param <R> right side of tuple
 */
public class Pair<L, R> {
	private final L left;
	private final R right;
	
	public Pair(L left, R right) {
		this.left = left;
		this.right = right;
	}
	
	public L getLeft() {
		return this.left;
	}
	
	public R getRight() {
		return this.right;
	}
	
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Pair)) {
            return false;
        }

        Pair pair = (Pair) o;

        return this.left.equals(pair.getLeft()) && this.right.equals(pair.getRight());
    }
    
    /**
    *
    * @return string representation of pair
    */
    @Override
    public String toString() {
        return " Pair{" + getLeft().toString() + " , " + getRight().toString() + "} ";   
    }
}