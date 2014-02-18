package graph;

/**
 * <p>
 * Graph.java is an Interface that is responsible for the main Graph methods.
 * </p>
 * 
 * <p>
 * This program is part of the solution for the second ICA for AIP in Teesside
 * University.
 * </p>
 * 
 * <p>
 * SearchALgos 2014-SOLUTION is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * </p>
 * 
 * <p>
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * </p>
 * 
 * <p>
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see http://www.gnu.org/licenses/.
 * </p>
 * 
 * <p>
 * Copyright Kiril Anastasov L1087591@live.tees.ac.uk 18-February-2014
 * </p>
 */

public interface Graph<V> {
	/** Return the number of vertices in the graph */
	public int getSize();

	/** Return the vertices in the graph */
	public java.util.List<V> getVertices();

	/** Return the object for the specified vertex index */
	public V getVertex(int index);

	/** Return the index for the specified vertex object */
	public int getIndex(V v);

	/** Return the neighbors of vertex with the specified index */
	public java.util.List<Integer> getNeighbors(int index);

	/** Return the degree for a specified vertex */
	public int getDegree(int v);

	/** Return the adjacency matrix */
	public int[][] getAdjacencyMatrix();

	/** Print the adjacency matrix */
	public void printAdjacencyMatrix();

	/** Print the edges */
	public void printEdges();

	/** Obtain a depth-first search tree */
	public AbstractGraph<V>.Tree dfs(int v);

	/** Obtain a breadth-first search tree */
	public AbstractGraph<V>.Tree bfs(int v);

	/**
	 * Return a Hamiltonian path from the specified vertex Return null if the
	 * graph does not contain a Hamiltonian path
	 */
	public java.util.List<Integer> getHamiltonianPath(V vertex);

	/**
	 * Return a Hamiltonian path from the specified vertex label Return null if
	 * the graph does not contain a Hamiltonian path
	 */
	public java.util.List<Integer> getHamiltonianPath(int inexe);
}
