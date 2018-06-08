package com.jliang.springboot.hello;

public class SiloConfig {

    private String category;
    private String propertyDescription;
    private String propertyName;
    private String propertyValue;

    public SiloConfig(String category, String propertyDescription, String propertyName, String propertyValue) {
        this.category = category;
        this.propertyDescription = propertyDescription;
        this.propertyName = propertyName;
        this.propertyValue = propertyValue;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPropertyDescription() {
        return propertyDescription;
    }

    public void setPropertyDescription(String propertyDescription) {
        this.propertyDescription = propertyDescription;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    @Override
    public String toString() {
        return "SiloConfig{" +
                "category='" + category + '\'' +
                ", propertyDescription='" + propertyDescription + '\'' +
                ", propertyName='" + propertyName + '\'' +
                ", propertyValue='" + propertyValue + '\'' +
                '}';
    }
}
