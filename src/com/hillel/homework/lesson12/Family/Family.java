package com.hillel.homework.lesson12.Family;

public class Family {
    public static void main(String[] args) {
        FamilyMembers dan = new FamilyMembers("Даниил");
        FamilyMembers ilya = new FamilyMembers("Илья");
        FamilyMembers valeriya = new FamilyMembers("Валерия");
        dan.parents(ilya);
        dan.parents(valeriya);
        dan.showParents();
    }
}