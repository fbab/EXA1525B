<?php
require_once 'Personne.php';
require_once 'AscenseurException.php';

class Ascenseur implements Countable 
{
    const MAX_ETAGES  = 50;
	
    private $_nom;
    private $_etage;
    private $_personnes;

    public function __construct($nom, $etage)
    {
        $this->_personnes = new SplObjectStorage;
	    $this->_nom = $nom;
        $this->go($etage);
    }

    protected function _searchPersonne(Personne $p)
    {
        return $this->_personnes->contains($p);
    }
    
    public function charger(Personne $p)
    {
        if($this->_searchPersonne($p)) {
            throw new AscenseurException($p->getName() . ' existe déjà');           
        }        
        $this->_personnes->attach($p);
    }

    public function decharger(Personne $p)
    {
        $this->_personnes->detach($p);
    }
    
    public function getPersonne(Personne $p)
    {
        if($this->_searchPersonne($p)) {
            return $p;
        }
        throw new AscenseurException('Cette personne n\'est pas dans l\'ascenseur');
    }
    
    public function isEmpty()
    {
        return count($this) == 0;
    }

    public function go($a_l_etage)
    {
        $a_l_etage = abs((int)$a_l_etage);
        if ($a_l_etage > self::MAX_ETAGES || $a_l_etage < 0) {
            throw new AscenseurException('Etage invalide');
        }	    
        $this->_etage = $a_l_etage;
    }

    public function getName()
    {
        return $this->_nom;
    }

    public function getEtage()
    {
        return $this->_etage;
    }
	
    public function count()
    {
        return count($this->_personnes);
    }
}
