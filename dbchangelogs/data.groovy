databaseChangeLog {

   changeSet(id: 'create-table', author: 'elmonko') {
    createTable(schemaName: 'mhanalyzer', tableName: 'Test') {
      column(name:'id',type: 'int') {}
    }
  }
}
