package graph;

/**
 * <p>DisplayEUMap.java represents the graph with a simple GUI.</p>
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

import javax.swing.*;

public class DisplayEUMap extends JApplet {
	private City[] vertices = { new City("Glasgow", 75, 50),
			new City("Cardiff", 50, 250), new City("London", 125, 250),
			new City("Dublin", 12, 175), new City("Berlin", 400, 245),
			new City("Amsterdam", 450, 100), new City("Oslo", 700, 80),
			new City("Stockholm", 675, 120), new City("Kiev", 575, 295),
			new City("Sofia", 600, 400), new City("Belgrad", 408, 325),
			new City("Skopie", 500, 400) };

	// Edge array for graph
	private int[][] edges = { { 0, 1 }, { 0, 3 }, { 0, 5 }, { 1, 0 }, { 1, 2 },
			{ 1, 3 }, { 2, 1 }, { 2, 3 }, { 2, 4 }, { 2, 10 }, { 3, 0 },
			{ 3, 1 }, { 3, 2 }, { 3, 4 }, { 3, 5 }, { 4, 2 }, { 4, 3 },
			{ 4, 5 }, { 4, 7 }, { 4, 8 }, { 4, 10 }, { 5, 0 }, { 5, 3 },
			{ 5, 4 }, { 5, 6 }, { 5, 7 }, { 6, 5 }, { 6, 7 }, { 7, 4 },
			{ 7, 5 }, { 7, 6 }, { 7, 8 }, { 8, 4 }, { 8, 7 }, { 8, 9 },
			{ 8, 10 }, { 8, 11 }, { 9, 8 }, { 9, 11 }, { 10, 2 }, { 10, 4 },
			{ 10, 8 }, { 10, 11 }, { 11, 8 }, { 11, 9 }, { 11, 10 } };

	private Graph<City> graph = new UnweightedGraph<City>(edges, vertices);

	public DisplayEUMap() {
		add(new GraphView(graph));
	}

	static class City implements Displayable {
		private int x, y;
		private String name;

		City(String name, int x, int y) {
			this.name = name;
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}

		public String getName() {
			return name;
		}
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("EuropeanMap");
		DisplayEUMap applet = new DisplayEUMap();
		frame.add(applet);
		applet.init();
		applet.start();

		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 500);
		frame.setVisible(true);
	}
}