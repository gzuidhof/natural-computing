package pso;

import java.util.ArrayList;

import windfarmapi.KusiakLayoutEvaluator;
import windfarmapi.WindScenario;

public class Main {

	public static void main(String[] args) {
		
		Testing testert = new Testing();

		try {
			testert.testMax();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
//        WindScenario ws;
//		try {
//			ws = new WindScenario("Scenarios/obs_00.xml");		
//		    Test test = new Test(ws);
//		    test.run();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//       
//        
	}

}
