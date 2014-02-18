package graph;

/**
 * <p>UnweightedGraph.java is a concrete class that is responsible for the unweighted graphs.</p>
 *
 * <p>This program is part of the solution for the second ICA for AIP in Teesside
 * University.</p>
 *
 * <p>SearchALgos  2014-SOLUTION is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.</p>
 *
 * <p>This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.</p>
 *
 * <p>You should have received a copy of the GNU General Public License along
 * with this program. If not, see http://www.gnu.org/licenses/.</p>
 *
 * <p>Copyright Kiril Anastasov L1087591@live.tees.ac.uk 18-February-2014 </p>
 */

import java.util.*;

public class UnweightedGraph<V> extends AbstractGraph<V> {
	/** Construct a graph from edges and vertices stored in arrays */
	public UnweightedGraph(int[][] edges, V[] vertices) {
		super(edges, vertices);
	}

	/** Construct a graph from edges and vertices stored in List */
	public UnweightedGraph(List<Edge> edges, List<V> vertices) {
		super(edges, vertices);
	}

	/** Construct a graph for integer vertices 0, 1, 2 and edge list */
	public UnweightedGraph(List<Edge> edges, int numberOfVertices) {
		super(edges, numberOfVertices);
	}

	/** Construct a graph from integer vertices 0, 1, and edge array */
	public UnweightedGraph(int[][] edges, int numberOfVertices) {
		super(edges, numberOfVertices);
	}
}
