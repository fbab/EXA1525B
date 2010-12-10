package fr.insa.rouen.bpm.services.process;

import fr.insa.rouen.bpm.model.process.ProcessPayLoad;

/**
 * Service de pilotage des process.
 * 
 * @author olivier
 *
 */
public interface ProcessManagerService {

	/**
	 * D�marre une instance de process qui commence par une Task.
	 * 
	 * L'utilisateur est ins�r�.
	 * La d�finition de process est pass�e en param�tres.
	 * Les variables de process sont dans le payload (typiquement la commande).
	 * 
	 * @param processPayload
	 * @param processName
	 * @param userId
	 * @return l'indentifiant de l'instance de process.
	 */
	public Long startProcessWithTask(ProcessPayLoad processPayload, String processName, Long userId);	
}
