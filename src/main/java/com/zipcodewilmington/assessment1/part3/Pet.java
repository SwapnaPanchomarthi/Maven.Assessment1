package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public abstract class Pet extends PetOwner implements Animal {
    /**
     * nullary constructor
     * by default, pet has age of 0; name of "";
     */
    private String name;
    private int age=0;
    private PetOwner petOwner;
    // private ArrayList<PetOwner> list = new ArrayList<>();

    public Pet() {

    }

    /**
     * @param name name of this pet
     */
    public Pet(String name) {
        this.name=name;
    }


    /**
     * @param age age of this pet
     */
    public Pet(int age) {
        this.age=age;
    }

    /**
     * @param name name of this pet
     * @param age age of this pet
     */
    public Pet(String name, int age) {
        this.name=name;
        this.age=age;
    }
    public Pet(String name, int age, PetOwner owner){
        this.name=name;
        this.age=age;
        this.petOwner=owner;
    }

    public Pet(PetOwner owner){
        this.petOwner=owner;
    }
    /**
     * @return name of this pet
     */
    public String getName() {

        return this.name;
    }

    /**
     * @return age of this pet
     */
    public Integer getAge() {
        return this.age;
    }

    /**
     * @param newPetOwner the new owner of this pet
     * ensure this instance of `Pet` is added to the owner's composite `pets` list
     */
    public void setOwner(PetOwner Owner)
    {

    this.petOwner;


    }

    /**
     * @return PetOwner object whose composite `pets` collection contains this Pet instance
     */
    public PetOwner getOwner() {
        return null;
    }
}
