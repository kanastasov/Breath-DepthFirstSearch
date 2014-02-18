package graph;

/**
 * <p>
 * GraphView.java is a concrete class that helps with the GUI of the program.
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


public class GraphView extends javax.swing.JPanel {
	private Graph<? extends Displayable> graph;

	public GraphView(Graph<? extends Displayable> graph) {
		this.graph = graph;
	}

	protected void paintComponent(java.awt.Graphics g) {
		super.paintComponent(g);

		// Draw vertices
		java.util.List<? extends Displayable> vertices = graph.getVertices();
		for (int i = 0; i < graph.getSize(); i++) {
			int x = vertices.get(i).getX();
			int y = vertices.get(i).getY();
			String name = vertices.get(i).getName();

			g.fillOval(x - 8, y - 8, 16, 16); // Display a vertex
			g.drawString(name, x - 12, y - 12); // Display the name
		}

		// Draw edges for pair of vertices
		for (int i = 0; i < graph.getSize(); i++) {
			java.util.List<Integer> neighbors = graph.getNeighbors(i);
			for (int j = 0; j < neighbors.size(); j++) {
				int v = neighbors.get(j);
				int x1 = graph.getVertex(i).getX();
				int y1 = graph.getVertex(i).getY();
				int x2 = graph.getVertex(v).getX();
				int y2 = graph.getVertex(v).getY();

				g.drawLine(x1, y1, x2, y2); // Draw an edge for (i, v)
			}
		}
	}
}
