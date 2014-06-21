package com.elmonko.dao;

import com.elmonko.model.Monster;

/**
 * Created by dev on 19/06/2014.
 */
public interface MonsterDao {

    /**
     * Create a new monster
     * @param monster Monster to create
     * @return created monster
     */
    Monster create(Monster monster);

    /**
     * Update a monster
     * @param monster Monster to update
     * @return up-to-date monster
     */
    Monster update(Monster monster);

    /**
     * Delete a monster
     * @param monster Monster to delete
     */
    void delete(Monster monster);

    /**
     * Find a monster by id
     * @param id id of the monster
     * @return result
     */
    Monster find(long id);

    
}
