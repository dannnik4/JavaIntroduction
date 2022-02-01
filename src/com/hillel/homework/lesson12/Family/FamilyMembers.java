package com.hillel.homework.lesson12.Family;

class FamilyMembers {
    private String name;
    private String parents = "";

    public FamilyMembers(String name) {
        this.name = name;
    }

    public void parents(FamilyMembers persons) {
        this.parents += persons.name + " ";
    }

    public void showParents() {
        System.out.println("Ребёнка зовут: " + this.name);
        System.out.println("Его родителей зовут: " + parents);
    }
}