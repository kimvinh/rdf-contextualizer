package org.knoesis.rdf.sp.utils;

public class Constants {
	
	public static final String QUAD_EXT = "nq";
	public static final String NTRIPLE_EXT = "nt";
	public static final String TURTLE_EXT = "ttl";
	public static final String DEFAULT_EXT = "ttl";

	public static final String REI_REP = "REI";
	public static final String SP_REP = "SP";
	public static final String NG_REP = "NG";
	public static final String NANO_REP = "NANO";
	public static final String TRIPLE_REP = "TRIPLE";
	public static final String NONE_REP = "NONE";

	public static final String SP_SUFFIX = "_sp";
	public static final String SP_UUID_PREFIX = "sp";
	public static final String NS_STR = "ns";
	public static final String SP_START_DELIMITER = "_";
	public static final String SP_MID_DELIMITER = ":";
	public static final String SP_END_DELIMITER = "";

	
	public static final String SINGLETON_PROPERTY_OF_URI = "<http://www.w3.org/1999/02/22-rdf-syntax-ns#singletonPropertyOf>";
	public static final String SINGLETON_PROPERTY_OF = "http://www.w3.org/1999/02/22-rdf-syntax-ns#singletonPropertyOf";
	public static final String WAS_DERIVED_FROM_URI = "<http://www.w3.org/ns/prov#wasDerivedFrom>";
	public static final String WAS_DERIVED_FROM = "http://www.w3.org/ns/prov#wasDerivedFrom";
	public static final String RDF_SUBJECT = "http://www.w3.org/1999/02/22-rdf-syntax-ns#subject";
	public static final String RDF_PREDICATE = "http://www.w3.org/1999/02/22-rdf-syntax-ns#predicate";
	public static final String RDF_OBJECT = "http://www.w3.org/1999/02/22-rdf-syntax-ns#object";
	public static final String RDF_TYPE = "http://www.w3.org/1999/02/22-rdf-syntax-ns#type";
	public static final String RDF_STATEMENT = "http://www.w3.org/1999/02/22-rdf-syntax-ns#Statement";
	public static final String RDF_SINGLETON_PROPERTY_CLASS = "http://www.w3.org/1999/02/22-rdf-syntax-ns#SingletonProperty";
	public static final String RDF_GENERIC_PROPERTY_CLASS = "http://www.w3.org/1999/02/22-rdf-syntax-ns#GenericProperty";
	public static final String RDFS_DOMAIN_PROPERTY = "http://www.w3.org/2000/01/rdf-schema#domain";
	public static final String RDFS_RANGE_PROPERTY = "http://www.w3.org/2000/01/rdf-schema#range";
	public static final String RDFS_SUBPROPERTYOF_PROPERTY = "http://www.w3.org/2000/01/rdf-schema#subPropertyOf";
	public static final String OWL_EQUIVALENTPROPERTY_PROPERTY = "http://www.w3.org/2002/07/owl#equivalentProperty";

	/**
	 * For contextual inference
	 * */
	
	public static final int RULE_ALL_SP = 0;		// infer all the rules
	public static final int RULE_RDFS_SP_3 = 1; 	// infer singleton property from hierarchy
	public static final int RULE_OWL_SP_1 = 2;		//			*				
	public static final int RULE_RDF_SP_3 = 3; 		// infer generic triple
	public static final int RULE_RDF_SP_1 = 4;		// infer SingletonProperty class instance
	public static final int RULE_OWL_SP_3 = 5;		// infer GenericProperty class instance
	public static final int RULE_RDFS_SP_4 = 6;		//			*				
	public static final int RULE_RDFS_SP_5 = 7;		//			*				
	public static final int RULE_RDF_SP_2 = 8;		//			*				
	public static final int RULE_OWL_SP_2 = 9;		//			*				
	public static final int RULE_RDFS_SP_1 = 10;	// infer domain
	public static final int RULE_RDFS_SP_2 = 11;	// infer range

	
	/**
	 * File management
	 */
	public static final String CONVERTED_TO_SP_NT = "_converted_to_sp_nt";
	public static final String CONVERTED_TO_SP_TTL = "_converted_to_sp_ttl";
	public static final String ORIGINAL_DIRECTORY = "ori";
	public static final String REPORTS_DIRECTORY = "reports";
	public static final String STAT_FILE = REPORTS_DIRECTORY + "/stat.txt";
	
}

