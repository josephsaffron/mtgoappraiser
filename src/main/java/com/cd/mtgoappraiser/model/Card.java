package com.cd.mtgoappraiser.model;

/**
 * Created by Cory on 7/16/2016.
 */
public class Card {
    private String name;
    private Integer quantity;
    private String set;
    private boolean isPremium;

    public Card() {}

    public Card(Card aCard) {
        this.setName(aCard.getName());
        this.setQuantity(aCard.getQuantity());
        this.setSet(aCard.getSet());
        this.setPremium(aCard.isPremium());
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Card right) {
        return this.getName().equals(right.getName());
    }

    @Override
    public boolean equals(Object right) {
        if(right instanceof Card) {
            if(this.name.equals(((Card) right).getName())) {
                return true;
            }
        }
        return false;
    }
}
