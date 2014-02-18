package graph;

/**
 * <p>
 * WeightedEdge.java is a concrete class that is responsible for the weighted
 * edge and is used by the weighted graph.
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

public class WeightedEdge extends AbstractGraph.Edge implements
		Comparable<WeightedEdge> {
	public int weight; // The weight on edge (u, v)

	/** Create a weighted edge on (u, v) */
	public WeightedEdge(int u, int v, int weight) {
		super(u, v);
		this.weight = weight;
	}

	/** Compare two edges on weights */
	public int compareTo(WeightedEdge edge) {
		if (weight > edge.weight)
			return 1;
		else if (weight == edge.weight) {
			return 0;
		} else {
			return -1;
		}
	}
}
