package T2;
import org.openscience.cdk.interfaces.IAtom;
import org.openscience.cdk.templates.MoleculeFactory;
import org.openscience.cdk.Atom;
import org.openscience.cdk.Molecule;

public class CdkApp {

	public static void main(String[] args) {
		
		Molecule benzene = MoleculeFactory.makeBenzene();
		for (IAtom atom : benzene.atoms()){
			System.out.println("Atom: " + atom);
		}
					
	}

}
