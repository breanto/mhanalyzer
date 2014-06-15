databaseChangeLog {
   changeSet(id: 'createTableItem', author: 'elmonko') {
    createTable(tableName: 'item') {
      column(name:'id',type: 'BIGINT', autoIncrement:'true') {
      	constraints(primaryKey:'true', nullable:'false')
      }
      column(name :'name',type : 'VARCHAR(255)'){
      	constraints(unique:'true')
      }
    }
  }

  changeSet(id :'createTableReferenceData', author :'elmonko'){
  	createTable(tableName : 'reference_data'){
  		column(name:'id', type:'BIGINT'){
  			constraints(primaryKey:'true', nullable:'false')
  		}
  		column(name:'type', type:'VARCHAR(128)')
  		column(name:'value', type:'VARCHAR(128)')
  	}
  }

  changeSet(id: 'createTableMonster', author:'elmonko'){
	createTable(tableName: 'monster') {
      column(name:'id',type: 'BIGINT', autoIncrement:'true') {
      	constraints(primaryKey:'true', nullable:'false')
      }      
      column(name :'name',type : 'VARCHAR(255)'){
      	constraints(unique:'true')
      }
      column(name: 'id_parent', type:'BIGINT'){}
    }
  }

  changeSet(id: 'addFkContraintsOnMonsterToParentMonster', author:'elmonko'){
  	addForeignKeyConstraint( constraintName:'fkMonsterToParentMonster', baseColumnNames:'id_parent', baseTableName:'monster', referencedTableName:'monster', referencedColumnNames:'id')
  }


  changeSet(id: 'createTableArmor', author:'elmonko'){
	createTable(tableName: 'armor') {
      column(name:'id',type: 'BIGINT', autoIncrement:'true') {
      	constraints(primaryKey:'true', nullable:'false')
      }      
      column(name :'name',type : 'VARCHAR(255)'){
      	constraints(unique:'true')
      }
      column(name: 'id_rank', type:'BIGINT'){}
      column(name: 'id_monster', type:'BIGINT'){}
    }

    addForeignKeyConstraint(constraintName:'fkArmorToMonster', baseTableName:'armor', baseColumnNames:'id_monster', referencedTableName:'monster', referencedColumnNames:'id')
    	addForeignKeyConstraint(constraintName:'fkArmorToRankReferenceData', baseTableName:'armor', baseColumnNames:'id_rank', referencedTableName:'reference_data', referencedColumnNames:'id')
  }


  changeSet(id: 'createTableArmorItem', author:'elmonko'){
	createTable(tableName: 'armor_item') {
      column(name:'id',type: 'BIGINT', autoIncrement:'true') {
      	constraints(primaryKey:'true', nullable:'false')
      }      
      column(name :'id_item',type : 'BIGINT'){}
      column(name: 'id_armor', type:'BIGINT'){}
      column(name: 'number', type:'INT'){}
    }

    addForeignKeyConstraint(constraintName:'fkArmorItemToItem', baseTableName:'armor_item', baseColumnNames:'id_item', referencedTableName:'item', referencedColumnNames:'id')
    addForeignKeyConstraint(constraintName:'fkArmorItemToArmor', baseTableName:'armor_item', baseColumnNames:'id_armor', referencedTableName:'armor', referencedColumnNames:'id')
  }

  changeSet(id:'createTableMonsterItem', author:'elmonko'){
  	createTable(tableName:'monster_item'){
  	  column(name:'id',type: 'BIGINT', autoIncrement:'true') {
      	constraints(primaryKey:'true', nullable:'false')
      }
      column(name: 'id_item',type:'BIGINT'){}
      column(name: 'id_monster', type:'BIGINT'){}
      column(name: 'number', type:'INT'){}
      column(name: 'chance', type:'INT'){}
      column(name: 'id_hunting_type', type:'BIGINT'){}
      column(name: 'id_rank', type:'BIGINT'){}
  	}

	addForeignKeyConstraint(constraintName:'fkMonsterItemToItem', baseTableName:'monster_item', baseColumnNames:'id_item', referencedTableName:'item', referencedColumnNames:'id')
    addForeignKeyConstraint(constraintName:'fkMonsterItemToMonster', baseTableName:'monster_item', baseColumnNames:'id_monster', referencedTableName:'monster', referencedColumnNames:'id')
    addForeignKeyConstraint(constraintName:'fkMonsterItemRankToReferenceData', baseTableName:'monster_item', baseColumnNames:'id_rank', referencedTableName:'reference_data', referencedColumnNames:'id')
    addForeignKeyConstraint(constraintName:'fkMonsterHuntTypeToReferenceData', baseTableName:'monster_item', baseColumnNames:'id_hunting_type', referencedTableName:'reference_data', referencedColumnNames:'id')

  
  }
}
