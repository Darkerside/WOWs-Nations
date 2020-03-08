package com.ra121514.wowsnations;

public class Nation {
    String image;
    String name;
    String description;
    String information;
    String prefix;

    public Nation(){

    }

    public Nation(String image, String name, String information, String description, String prefix){
        this.image = image;
        this.name = name;
        this.description = description;
        this.information = information;
        this.prefix = prefix;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}

