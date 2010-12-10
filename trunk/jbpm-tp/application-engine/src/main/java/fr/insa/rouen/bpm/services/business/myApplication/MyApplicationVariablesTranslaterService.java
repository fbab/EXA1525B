package fr.insa.rouen.bpm.services.business.myApplication;

import fr.insa.rouen.bpm.model.business.myApplication.MyApplicationCommand;
import fr.insa.rouen.bpm.model.process.ProcessPayLoad;
import fr.insa.rouen.bpm.model.process.myApplication.EMyApplicationVariables;

/**
 * Assure le mapping m�tier -> process et process -> m�tier
 * @author olivier
 *
 */
public interface MyApplicationVariablesTranslaterService {

	public ProcessPayLoad<EMyApplicationVariables> getProcessPayLoadFromCommand(MyApplicationCommand myApplicationCommand);
	
}
