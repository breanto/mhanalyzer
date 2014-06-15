package com.elmonko.model;

import java.util.List;

/**
 * Created by ElMonko on 07/06/2014.
 */
public class Monster {

    private class BodyPart{

        private String name;

        private DamageData damageData;

        /**
         * get body part name
         * @return body part name
         */
        public String getName() {
            return name;
        }

        /**
         * set body part name
         * @param name body part name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * get damage data
         * @return
         */
        public DamageData getDamageData() {
            return damageData;
        }

        /**
         * set damage data
         * @param damageData
         */
        public void setDamageData(DamageData damageData) {
            this.damageData = damageData;
        }
    }

    private long id;

    private String name;

    private Monster parent;

    private List<Armor> armors;

    private List<MonsterReward> rewards;

    /**
     * get monster database id
     * @return
     */
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    /**
     * get monster's name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set monster's name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get monster's parent (if subspecies only)
     * @return
     */
    public Monster getParent() {
        return parent;
    }

    /**
     * set monster's parent
     * @param parent
     */
    public void setParent(Monster parent) {
        this.parent = parent;
    }

    /**
     * get armors
     * @return
     */
    public List<Armor> getArmors() {
        return armors;
    }

    /**
     * set armors
     * @param armors
     */
    public void setArmors(List<Armor> armors) {
        this.armors = armors;
    }

    /**
     * Get the list of rewards
     * @return
     */
    public List<MonsterReward> getRewards() {
        return rewards;
    }

    /**
     * Set the list of rewards
     * @param rewards
     */
    public void setRewards(List<MonsterReward> rewards) {
        this.rewards = rewards;
    }

}
