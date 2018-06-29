package com.acme.a3csci3130;

import com.google.firebase.database.Exclude;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Class that defines how the data will be stored in the
 * Firebase databse. This is converted to a JSON format
 */

public class Contact implements Serializable {


    public  String uid;
    public  String name;
    public  String number;
    public  String primary;
    public  String address;
    public  String province;

    public Contact() {
        // Default constructor required for calls to DataSnapshot.getValue
    }

    public Contact(String uid, String name, String number, String primary, String address, String province){
        this.uid = uid;
        this.name = name;
        this.number = number;
        this.primary = primary;
        this.address = address;
        this.province = province;
    }

    @Exclude
    public Map<String, Object> toMap(){
        HashMap<String, Object> result = new HashMap<>();
        result.put("uid", uid);
        result.put("name", name);
        result.put("number", number);
        result.put("primary", primary);
        result.put("address", address);
        result.put("province", province);

        return result;
    }
}