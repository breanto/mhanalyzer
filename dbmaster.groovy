//Liquibase Master change log

databaseChangeLog {
	include(file: 'dbchangelogs/schema.groovy')
	include(file: 'dbchangelogs/data.groovy')
}
