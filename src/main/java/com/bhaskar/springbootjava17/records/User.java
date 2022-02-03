package com.bhaskar.springbootjava17.records;

/**
 * @author venkata.mantrala
 */
public record User(String name, String email, Integer id, Address userAddress) {

    //Cannot have setters
//    public void setName(String name) {
//        this.name = name;
//    }

    //Constructors
    public User(Address address) {
        this(null, null, 0, address);
    }
}
