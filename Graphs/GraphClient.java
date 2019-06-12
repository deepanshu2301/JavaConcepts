package Graphs;

import java.util.HashMap;

public class GraphClient {

	public static void main(String[] args) {

		Graphs graph = new Graphs();
		graph.addvertex("A");
		graph.addvertex("B");
		graph.addvertex("C");
		graph.addvertex("D");
		graph.addvertex("E");
		graph.addvertex("F");
		graph.addvertex("G");
		graph.addedge("A", "B", 2);
		graph.addedge("A", "D", 3);
		graph.addedge("B", "C", 4);
		graph.addedge("D", "C", 1);
		graph.addedge("D", "E", 5);
		graph.addedge("E", "F", 6);
		graph.addedge("F", "G", 8);
		graph.addedge("E", "G", 7);
		graph.display();
//		 System.out.println("----");
		// graph.removevertex("A");
		// graph.display();
		// System.out.println("----");
		// graph.removevertexdirect("A");
		// graph.display();
		// HashMap<String, Boolean> str = new HashMap<>();
		// System.out.println(graph.hasPath("A", "F" , str));
		// graph.removeedge("D", "E");
		// System.out.println(graph.hasPath("A", "F", str));
		// System.out.println(graph.numvertex());
		// System.out.println(graph.numedges());
		// System.out.println(graph.containsvertex("A"));
//		System.out.println(graph.BSF("A", "F"));
//		graph.removeedge("C", "D");
//		graph.removeedge("F", "E");
//		graph.removeedge("G", "F");
//		System.out.println(graph.BSF("A", "F"));
//		System.out.println(graph.DSF("A", "F"));
//		graph.BFT();
//		System.out.println("==");
//		graph.DFT();
//		System.out.println(graph.isconnected());
//		System.out.println(graph.connectedcomponents());
//		System.out.println(graph.iscyclic());
//		System.out.println(graph.istree());
		System.out.println(graph.bypartite());


	}

}
