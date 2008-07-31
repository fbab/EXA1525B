<?php



class NomchrsMapBuilder {

	
	const CLASS_NAME = 'lib.model.map.NomchrsMapBuilder';

	
	private $dbMap;

	
	public function isBuilt()
	{
		return ($this->dbMap !== null);
	}

	
	public function getDatabaseMap()
	{
		return $this->dbMap;
	}

	
	public function doBuild()
	{
		$this->dbMap = Propel::getDatabaseMap('propel');

		$tMap = $this->dbMap->addTable('nomCHRS');
		$tMap->setPhpName('Nomchrs');

		$tMap->setUseIdGenerator(true);

		$tMap->addPrimaryKey('ID', 'Id', 'int', CreoleTypes::INTEGER, true, null);

		$tMap->addColumn('LISTNOMCHRS', 'Listnomchrs', 'string', CreoleTypes::VARCHAR, false, 255);

	} 
} 