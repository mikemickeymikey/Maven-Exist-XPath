package test;

import practicaExist.XMLManager;

public class Main {

	public static void main(String[] args) throws Exception {
		XMLManager manager = new XMLManager("/db/mike/");
		System.out.println("Illa més elevada: " + manager.IllaMesElevada() + " metres.");
		manager.ContingutNodeIlla("island-Rugen");
		manager.ConsultaFlowr();
		manager.ModificarContingut("Svalbard");
		manager.EliminarNode("Iceland");
	}

}
