package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Graphs {

	public class vertex {
		HashMap<String, Integer> ngbrs = new HashMap<>();
	}

	private HashMap<String, vertex> vertices = new HashMap<>();

	public int numvertex() {

		return vertices.size();
	}

	public boolean containsvertex(String vname) {

		return vertices.containsKey(vname);
	}

	public void addvertex(String vname) {

		vertex vtx = new vertex();
		vertices.put(vname, vtx);

	}

	public void removevertex(String vname) {

		if (!vertices.containsKey(vname)) {
			return;
		}
		ArrayList<String> vnames = new ArrayList<>(this.vertices.keySet());
		for (String vname1 : vnames) {
			HashMap<String, Integer> hm = new HashMap<>();
			hm = vertices.get(vname1).ngbrs;
			if (hm.containsKey(vname)) {
				hm.remove(vname);
			}
			vertices.get(vname1).ngbrs = hm;
		}

		vertices.remove(vname);
	}

	public void removevertexdirect(String vname) {

		if (!vertices.containsKey(vname)) {
			return;
		}
		HashMap<String, Integer> hm = new HashMap<>();
		hm = vertices.get(vname).ngbrs;
		ArrayList<String> vnames = new ArrayList<>(hm.keySet());
		for (String vname1 : vnames) {
			removeedge(vname1, vname);
		}

		vertices.remove(vname);
	}

	public int numedges() {

		ArrayList<String> vnames = new ArrayList<>(this.vertices.keySet());
		int ans = 0;
		for (String vname : vnames) {
			vertex vtx = vertices.get(vname);
			ans += vtx.ngbrs.size();
		}
		return ans / 2;
	}

	public boolean containsedge(String vname1, String vname2) {

		vertex vtx1 = vertices.get(vname1);
		vertex vtx2 = vertices.get(vname2);

		if (vtx1 == null || vtx2 == null || !vtx1.ngbrs.containsKey(vname2)) {
			return false;
		}
		return true;
	}

	public void addedge(String vname1, String vname2, int cost) {

		vertex vtx1 = vertices.get(vname1);
		vertex vtx2 = vertices.get(vname2);

		if (vtx1 == null || vtx2 == null || vtx1.ngbrs.containsKey(vname2)) {
			return;
		}
		vtx1.ngbrs.put(vname2, cost);
		vtx2.ngbrs.put(vname1, cost);

	}

	public void removeedge(String vname1, String vname2) {

		vertex vtx1 = vertices.get(vname1);
		vertex vtx2 = vertices.get(vname2);

		if (vtx1 == null || vtx2 == null || !vtx1.ngbrs.containsKey(vname2)) {
			return;
		}
		vtx1.ngbrs.remove(vname2);
		vtx2.ngbrs.remove(vname1);
	}

	public void display() {
		ArrayList<String> vnames = new ArrayList<>(this.vertices.keySet());

		for (String vname : vnames) {
			vertex vtx = vertices.get(vname);
			String str = vname + "->" + vtx.ngbrs;
			System.out.println(str);
		}
	}

	public boolean hasPath(String src, String dst, HashMap<String, Boolean> processed) {

		processed.put(src, true);

		if (containsedge(src, dst)) {
			return true;
		}

		vertex vtx = vertices.get(src);
		ArrayList<String> nbrnames = new ArrayList<>(vtx.ngbrs.keySet());

		for (String nbrname : nbrnames) {
			if (!processed.containsKey(nbrname) && hasPath(nbrname, dst, processed)) {
				return true;
			}
		}
		return false;

	}

	private class pair {
		String name;
		String psf;
		vertex vtx;
	}

	public boolean BSF(String vname1, String vname2) {
		LinkedList<pair> queue = new LinkedList<>();
		pair pair1 = new pair();
		pair1.name = vname1;
		pair1.psf = vname1;
		pair1.vtx = vertices.get(vname1);
		queue.addLast(pair1);
		HashMap<String, Boolean> processed = new HashMap<>();

		while (!queue.isEmpty()) {

			pair pair2 = new pair();
			pair2 = queue.removeFirst();

			if (!processed.containsKey(pair2.name)) {
				processed.put(pair2.name, true);
				if (containsedge(pair2.name, vname2)) {
					System.out.println(pair2.psf + vname2);
					return true;
				}

				ArrayList<String> ngbrs = new ArrayList<>(pair2.vtx.ngbrs.keySet());
				for (String nbr : ngbrs) {
					pair pair3 = new pair();
					pair3.name = nbr;
					pair3.vtx = vertices.get(nbr);
					pair3.psf = pair2.psf + nbr;
					queue.addLast(pair3);
				}
			}
		}
		return false;
	}

	public boolean DSF(String vname1, String vname2) {
		LinkedList<pair> stack = new LinkedList<>();
		pair pair1 = new pair();
		pair1.name = vname1;
		pair1.psf = vname1;
		pair1.vtx = vertices.get(vname1);
		stack.addFirst(pair1);
		HashMap<String, Boolean> processed = new HashMap<>();

		while (!stack.isEmpty()) {

			pair pair2 = new pair();
			pair2 = stack.removeFirst();

			if (!processed.containsKey(pair2.name)) {
				processed.put(pair2.name, true);
				if (containsedge(pair2.name, vname2)) {
					System.out.println(pair2.psf + vname2);
					return true;
				}

				ArrayList<String> ngbrs = new ArrayList<>(pair2.vtx.ngbrs.keySet());
				for (String nbr : ngbrs) {
					pair pair3 = new pair();
					pair3.name = nbr;
					pair3.vtx = vertices.get(nbr);
					pair3.psf = pair2.psf + nbr;
					stack.addFirst(pair3);
				}
			}
		}
		return false;
	}

	public void BFT() {
		LinkedList<pair> queue = new LinkedList<>();

		ArrayList<String> keys = new ArrayList<>(vertices.keySet());
		HashMap<String, Boolean> processed = new HashMap<>();
		for (String key : keys) {

			if (processed.containsKey(key)) {
				continue;
			}
			pair pair1 = new pair();
			pair1.name = key;
			pair1.psf = key;
			pair1.vtx = vertices.get(key);
			queue.addLast(pair1);
			// HashMap<String, Boolean> processed = new HashMap<>();

			while (!queue.isEmpty()) {

				pair pair2 = new pair();
				pair2 = queue.removeFirst();

				if (!processed.containsKey(pair2.name)) {
					processed.put(pair2.name, true);

					System.out.println(pair2.name + " via " + pair2.psf);

					ArrayList<String> ngbrs = new ArrayList<>(pair2.vtx.ngbrs.keySet());
					for (String nbr : ngbrs) {
						pair pair3 = new pair();
						pair3.name = nbr;
						pair3.vtx = vertices.get(nbr);
						pair3.psf = pair2.psf + nbr;
						queue.addLast(pair3);
					}
				}
			}
		}

	}

	public void DFT() {
		LinkedList<pair> stack = new LinkedList<>();

		ArrayList<String> keys = new ArrayList<>(vertices.keySet());
		HashMap<String, Boolean> processed = new HashMap<>();
		for (String key : keys) {

			if (processed.containsKey(key)) {
				continue;
			}
			pair pair1 = new pair();
			pair1.name = key;
			pair1.psf = key;
			pair1.vtx = vertices.get(key);
			stack.addFirst(pair1);

			while (!stack.isEmpty()) {

				pair pair2 = new pair();
				pair2 = stack.removeFirst();

				if (!processed.containsKey(pair2.name)) {
					processed.put(pair2.name, true);

					System.out.println(pair2.name + " via " + pair2.psf);

					ArrayList<String> ngbrs = new ArrayList<>(pair2.vtx.ngbrs.keySet());
					for (String nbr : ngbrs) {
						pair pair3 = new pair();
						pair3.name = nbr;
						pair3.vtx = vertices.get(nbr);
						pair3.psf = pair2.psf + nbr;
						stack.addFirst(pair3);
					}
				}
			}
		}

	}

	public boolean isconnected() {

		LinkedList<pair> queue = new LinkedList<>();
		int a = 0;
		ArrayList<String> keys = new ArrayList<>(vertices.keySet());
		HashMap<String, Boolean> processed = new HashMap<>();
		for (String key : keys) {

			if (processed.containsKey(key)) {

				continue;
			}
			a++;
			pair pair1 = new pair();
			pair1.name = key;
			pair1.psf = key;
			pair1.vtx = vertices.get(key);
			queue.addLast(pair1);
			// HashMap<String, Boolean> processed = new HashMap<>();

			while (!queue.isEmpty()) {

				pair pair2 = new pair();
				pair2 = queue.removeFirst();

				if (!processed.containsKey(pair2.name)) {
					processed.put(pair2.name, true);

					// System.out.println(pair2.name + " via " + pair2.psf);

					ArrayList<String> ngbrs = new ArrayList<>(pair2.vtx.ngbrs.keySet());
					for (String nbr : ngbrs) {
						pair pair3 = new pair();
						pair3.name = nbr;
						pair3.vtx = vertices.get(nbr);
						pair3.psf = pair2.psf + nbr;
						queue.addLast(pair3);
					}
				}
			}
		}

		if (a == 1) {
			return true;
		} else
			return false;
	}

	public ArrayList<ArrayList<String>> connectedcomponents() {
		LinkedList<pair> queue = new LinkedList<>();

		ArrayList<ArrayList<String>> ans = new ArrayList<>();

		ArrayList<String> keys = new ArrayList<>(vertices.keySet());
		HashMap<String, Boolean> processed = new HashMap<>();
		for (String key : keys) {

			if (processed.containsKey(key)) {
				continue;
			}
			pair pair1 = new pair();
			pair1.name = key;
			pair1.psf = key;
			pair1.vtx = vertices.get(key);
			queue.addLast(pair1);
			// HashMap<String, Boolean> processed = new HashMap<>();
			ArrayList<String> sans = new ArrayList<>();
			while (!queue.isEmpty()) {

				pair pair2 = new pair();
				pair2 = queue.removeFirst();

				// ArrayList<String> sans = new ArrayList<>();
				if (!processed.containsKey(pair2.name)) {
					processed.put(pair2.name, true);

					// System.out.println(pair2.name + " via " + pair2.psf);
					sans.add(pair2.name);
					ArrayList<String> ngbrs = new ArrayList<>(pair2.vtx.ngbrs.keySet());
					for (String nbr : ngbrs) {
						pair pair3 = new pair();
						pair3.name = nbr;
						pair3.vtx = vertices.get(nbr);
						pair3.psf = pair2.psf + nbr;
						queue.addLast(pair3);
					}
				}
			}
			ans.add(sans);
		}

		return ans;
	}

	public boolean iscyclic() {

		LinkedList<pair> stack = new LinkedList<>();

		ArrayList<String> keys = new ArrayList<>(vertices.keySet());
		HashMap<String, Boolean> processed = new HashMap<>();
		for (String key : keys) {

			if (processed.containsKey(key)) {
				continue;
			}
			pair pair1 = new pair();
			pair1.name = key;
			pair1.psf = key;
			pair1.vtx = vertices.get(key);
			stack.addFirst(pair1);
			// HashMap<String, Boolean> processed = new HashMap<>();

			while (!stack.isEmpty()) {

				pair pair2 = new pair();
				pair2 = stack.removeFirst();

				if (!processed.containsKey(pair2.name)) {
					processed.put(pair2.name, true);

					// System.out.println(pair2.name + " via " + pair2.psf);

					ArrayList<String> ngbrs = new ArrayList<>(pair2.vtx.ngbrs.keySet());
					for (String nbr : ngbrs) {
						if (!processed.containsKey(nbr)) {
							pair pair3 = new pair();
							pair3.name = nbr;
							pair3.vtx = vertices.get(nbr);
							pair3.psf = pair2.psf + nbr;
							stack.addFirst(pair3);
						}

					}
				} else {
					return true;
				}
			}
		}

		return false;
	}

	public boolean istree() {

		if (isconnected() && !iscyclic()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean bypartite() {

		LinkedList<pair> queue = new LinkedList<>();

		ArrayList<String> keys = new ArrayList<>(vertices.keySet());
		HashMap<String, Boolean> processed = new HashMap<>();
		for (String key : keys) {

			if (processed.containsKey(key)) {
				continue;
			}
			pair pair1 = new pair();
			pair1.name = key;
			pair1.psf = key;
			pair1.vtx = vertices.get(key);
			queue.addLast(pair1);
			// HashMap<String, Boolean> processed = new HashMap<>();

			while (!queue.isEmpty()) {

				pair pair2 = new pair();
				pair2 = queue.removeFirst();

				if (!processed.containsKey(pair2.name)) {
					processed.put(pair2.name, true);

					// System.out.println(pair2.name + " via " + pair2.psf);

					ArrayList<String> ngbrs = new ArrayList<>(pair2.vtx.ngbrs.keySet());
					for (String nbr : ngbrs) {

						ArrayList<String> ngbrs2 = new ArrayList<>(vertices.get(nbr).ngbrs.keySet());
						for (String nbr1 : ngbrs2) {
							if (containsedge(pair2.name, nbr1)) {
								return false;
							}
						}

						pair pair3 = new pair();
						pair3.name = nbr;
						pair3.vtx = vertices.get(nbr);
						pair3.psf = pair2.psf + nbr;
						queue.addLast(pair3);
					}
				}
			}
		}

		return true;
	}
}
