import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;

import PRO.Deliverable;
import PRO.PROFactory;
import PRO.PROPackage;
import PRO.Partner;
import PRO.Project;
import PRO.Rule;
import PRO.Task;

public class PROManipulation {

	public void sauverModele(String uri, EObject root) {
		   Resource resource = null;
		   try {
		      URI uriUri = URI.createURI(uri);
		      Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		      resource = (new ResourceSetImpl()).createResource(uriUri);
		      resource.getContents().add(root);
		      resource.save(null);
		   } catch (Exception e) {
		      System.err.println(" ERROR while saving the Model : "+e);
		      e.printStackTrace();
		   }
		}

		public Resource chargerModele(String uri, EPackage pack) {
		   Resource resource = null;
		   try {
		      URI uriUri = URI.createURI(uri);
		      Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		      resource = (new ResourceSetImpl()).createResource(uriUri);
		      XMLResource.XMLMap xmlMap = new XMLMapImpl();
		      xmlMap.setNoNamespacePackage(pack);
		      java.util.Map options = new java.util.HashMap();
		      options.put(XMLResource.OPTION_XML_MAP, xmlMap);
		      resource.load(options);
		   }
		   catch(Exception e) {
		      System.err.println(" Error while charging the Model : "+e);
		      e.printStackTrace();
		   }
		   return resource;
		}
		
		public Project getProjectInModel(String modelFile) {
			Resource resource = chargerModele(modelFile, PROPackage.eINSTANCE);
			if (resource == null) {
				System.err.println(" Error while charging the Model ");
				return null;
			}

			TreeIterator it = resource.getAllContents();

			Project proj = null;
			while(it.hasNext()) {
			   EObject obj = (EObject) it.next();
			   if (obj instanceof Project) {
				   proj = (Project) obj;
			      break;
			   }
			}
			return proj;
		}
	
		
	
		public void printProject(Project proj) {
						
			int i = 0;	
			int j = 0;
			int k = 0;
			int l = 0;
			System.out.println("- Project "+proj.getName_proj()+ ": ");
			  System.out.println("     The Rules of this project :");
			  EList<Rule> rule = proj.getRules();
				for(Rule a : rule){
				  i = i+1;
				  System.out.println("\t Rule " + i +":" );
				  System.out.println("\t\t Id: "+a.getId_rule());
				  System.out.println("\t\t Title: "+a.getTitle_rule());
				  System.out.println("\t\t Type: "+a.getType_rule());
				  System.out.println("\t\t Leader: "+a.getLeader().getName_par());
				  EList<Task> task = a.getTasks();
				  for(Task t : task){
				  k = k+1;
				  System.out.println("\t --Task " + k +":" );
				  System.out.println("\t\t Title: "+t.getTitle_task());
				  System.out.println("\t\t Starting: "+t.getStart_task());
				  System.out.println("\t\t Ending: "+t.getEnd_task());
				  }
				  EList<Deliverable> del = a.getDelievrables();
				  for(Deliverable d : del){
				  l = l+1;
				  System.out.println("\t --Delievrable " + l +":" );
				  System.out.println("\t\t Title: "+d.getTitle_del());
				  System.out.println("\t\t Due To: "+d.getDue_del());
				  System.out.println("\t\t Nature: "+d.getNature_del());
				  }}
			  System.out.println("    The Partners in this projects :");
			  EList<Partner> partn = proj.getPartners();
				for(Partner par : partn) {
					j = j+1;
				  System.out.println("\t Partner " + j +":"  );
				  System.out.println("\t\t Id: "+par.getId_par());
				  System.out.println("\t\t Name: "+par.getName_par());
				  System.out.println("\t\t Country: "+par.getCountry_par());
							}
			System.out.println("This project will take about "+ proj.getDuration_proj() + " days to finish it (Duration)!!");
						}
		
		
		
		
		
		public void addRule(Project proj, String ruleCherchee, String nouvelleRule) {
			
			Rule nouvelle = PROFactory.eINSTANCE.createRule();
			nouvelle.setTitle_rule(nouvelleRule);
			
			
		}
		
		public static void main(String argv[]) {
			
			PROManipulation manip = new PROManipulation();
			Project p = manip.getProjectInModel("metamodels/Project.xmi");
			System.out.println(" *** Model charging *** \n");
			
			manip.printProject(p);
			
			//manip.addRule(p, "A2", "Nouvelle");	
			
			//manip.sauverModele("model/Nouveau.xmi",p);
			
			System.out.println(" ***End of Model *** \n");
		}
}
