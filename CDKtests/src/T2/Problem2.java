package T2;

import javax.vecmath.Vector2d;

import org.openscience.cdk.DefaultChemObjectBuilder;
import org.openscience.cdk.interfaces.IAtom;
import org.openscience.cdk.interfaces.IMolecule;
import org.openscience.cdk.layout.StructureDiagramGenerator;
import org.openscience.cdk.smiles.SmilesParser;

public class Problem2 {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		SmilesParser sp = new SmilesParser
						  (DefaultChemObjectBuilder.getInstance());
		
		IMolecule mol = sp.parseSmiles("CCC(O)C");
		StructureDiagramGenerator sdg = new StructureDiagramGenerator();
		sdg.setMolecule(mol);	
		sdg.generateCoordinates(new Vector2d(0, 1));
		mol=sdg.getMolecule();
		
		for (IAtom atom:  mol.atoms()){
			
			System.out.println("Molecule: "  + mol );
			atom.getPoint2d();
			
			
		}
		
	}

}


