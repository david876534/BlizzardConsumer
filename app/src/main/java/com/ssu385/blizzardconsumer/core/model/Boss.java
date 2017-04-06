package com.ssu385.blizzardconsumer.core.model;


import com.google.gson.annotations.SerializedName;

public class Boss {
    // Data properties

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    private String urlSlug;
    private int zoneId;
    private boolean availableInNormalMode;
    private boolean availableInHeroicMode;
    private int health;
    private int heroicHealth;
    private int level;
    private int heroicLevel;
    private int journalId;


    // Getters

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public String getUrlSlug() {
        return urlSlug;
    }
    public int getZoneId() {
        return zoneId;
    }
    public boolean isAvailableInNormalMode() {
        return availableInNormalMode;
    }
    public boolean isAvailableInHeroicMode() {
        return availableInHeroicMode;
    }
    public int getHealth() {
        return health;
    }
    public int getHeroicHealth() {
        return heroicHealth;
    }
    public int getLevel() {
        return level;
    }
    public int getHeroicLevel() {
        return heroicLevel;
    }
    public int getJournalId() {
        return journalId;
    }


    // Implementation of the Builder patter to allow for creation of new objects without exposing
    // data through setters
    public static class Builder {
        private Boss boss = new Boss();

        public Builder id(int id){
            boss.id = id;

            return this;
        }

        public Builder name(String name){
            boss.name = name;

            return this;
        }

        public Builder urlSlug(String urlSlug){
            boss.urlSlug = urlSlug;

            return this;
        }

        public Builder description(String description){
            boss.description = description;

            return this;
        }

        public Builder zoneId(int zoneId) {
            boss.zoneId = zoneId;

            return this;
        }

        public Builder availableInNormalMode(boolean availableInNormalMode){
            boss.availableInNormalMode = availableInNormalMode;

            return this;
        }

        public Builder availableInHeroicMode(boolean availableInHeroicMode){
            boss.availableInHeroicMode = availableInHeroicMode;

            return this;
        }

        public Builder health(int health){
            boss.health = health;

            return this;
        }

        public Builder heroicHealth(int heroicHealth){
            boss.heroicHealth = heroicHealth;

            return this;
        }

        public Builder level(int level){
            boss.level = level;

            return this;
        }

        public Builder heroiclevel(int heroicLevel){
            boss.heroicLevel = heroicLevel;

            return this;
        }

        public Builder journalId(int journalId){
            boss.journalId = journalId;

            return this;
        }

        public Boss build(){
            Boss item = boss;
            boss = null;

            return item;
        }
    }
}
