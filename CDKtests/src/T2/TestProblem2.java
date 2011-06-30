package T2;

import org.junit.Test;
import org.openscience.cdk.DefaultChemObjectBuilder;
import org.openscience.cdk.geometry.GeometryTools;
import org.openscience.cdk.interfaces.IAtom;
import org.openscience.cdk.interfaces.IMolecule;
import org.openscience.cdk.layout.StructureDiagramGenerator;
import org.openscience.cdk.smiles.SmilesParser;

import junit.framework.Assert;
import junit.framework.TestCase;

public class TestProblem2 extends TestCase {
	@Test
	public void testProblem2() throws Exception{
		
		
		SmilesParser sp = new SmilesParser
						  (DefaultChemObjectBuilder.getInstance());
		
		IMolecule mol = sp.parseSmiles("CCC(O)C");
		Assert.assertFalse("Molecule dose not have 2D coordinates", 
							GeometryTools.has2DCoordinates(mol));
		
		
		StructureDiagramGenerator sdg = new StructureDiagramGenerator();
		sdg.setMolecule(mol);	
		sdg.generateCoordinates();
		mol=sdg.getMolecule();
		
		
		for (IAtom atom :  mol.atoms()){
			System.out.println("Molecule: "  + mol );
			atom.getPoint2d();
		}
		
		Assert.assertTrue("Molecules consist 2D coordinates",
							GeometryTools.has2DCoordinates(mol));
		}

}
