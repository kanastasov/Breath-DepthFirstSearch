package dfs;

/**
 * <p>TestDFS.java is an concrete class to test the Depth First Search which is located in AbstractGraph.</p>
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

import graph.AbstractGraph;
import graph.Graph;
import graph.UnweightedGraph;

public class TestDFS {
	public static void main(String[] args) {
		String[] vertices = { "Glasgow", "Cardiff", "London", "Dublin",
				"Berlin", "Amsterdam", "Oslo", "Stockholm", "Kiev", "Sofia",
				"Belgrad", "Skopie" };
		int[][] edges = { { 0, 1 }, { 0, 3 }, { 0, 5 }, { 1, 0 }, { 1, 2 },
				{ 1, 3 }, { 2, 1 }, { 2, 3 }, { 2, 4 }, { 2, 10 }, { 3, 0 },
				{ 3, 1 }, { 3, 2 }, { 3, 4 }, { 3, 5 }, { 4, 2 }, { 4, 3 },
				{ 4, 5 }, { 4, 7 }, { 4, 8 }, { 4, 10 }, { 5, 0 }, { 5, 3 },
				{ 5, 4 }, { 5, 6 }, { 5, 7 }, { 6, 5 }, { 6, 7 }, { 7, 4 },
				{ 7, 5 }, { 7, 6 }, { 7, 8 }, { 8, 4 }, { 8, 7 }, { 8, 9 },
				{ 8, 10 }, { 8, 11 }, { 9, 8 }, { 9, 11 }, { 10, 2 },
				{ 10, 4 }, { 10, 8 }, { 10, 11 }, { 11, 8 }, { 11, 9 },
				{ 11, 10 } };

		Graph<String> graph = new UnweightedGraph<String>(edges, vertices);
		AbstractGraph<String>.Tree dfs = graph.dfs(5);

		java.util.List<Integer> searchOrders = dfs.getSearchOrders();
		System.out.println(dfs.getNumberOfVerticesFound()
				+ " vertices are searched in this DFS order:");
		for (int i = 0; i < searchOrders.size(); i++)
			System.out.print(graph.getVertex(searchOrders.get(i)) + " ");
		System.out.println();

		for (int i = 0; i < searchOrders.size(); i++)
			if (dfs.getParent(i) != -1)
				System.out.println("parent of " + graph.getVertex(i) + " is "
						+ graph.getVertex(dfs.getParent(i)));
	}
}
