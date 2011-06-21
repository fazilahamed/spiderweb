package T2;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openscience.cdk.Atom;
import org.openscience.cdk.CDKConstants;
import org.openscience.cdk.Molecule;
import org.openscience.cdk.aromaticity.CDKHueckelAromaticityDetector;
import org.openscience.cdk.exception.CDKException;
import org.openscience.cdk.interfaces.IAtom;
import org.openscience.cdk.interfaces.IBond;
import org.openscience.cdk.templates.MoleculeFactory;

public class TestCDK {

	@Test
	public void testBenzene() throws CDKException{

		Molecule benzene = MoleculeFactory.makeBenzene();
		assertEquals(6, benzene.getAtomCount());
		
		IAtom atom = new Atom("C");
		benzene.addAtom(atom);
		
		assertEquals(7, benzene.getAtomCount());
				
		
	}
	
}
