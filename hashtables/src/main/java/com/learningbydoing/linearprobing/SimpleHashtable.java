package com.learningbydoing.linearprobing;

public class SimpleHashtable {

    private StoredEmployee[] hashtable;

    public SimpleHashtable(int cap){
        hashtable = new StoredEmployee[cap];
    }

    public void put(String key, Employee employee){
        int hashKey = hashKey(key);

        if(occupied(hashKey)){
            int stop = hashKey;
            if(hashKey == hashtable.length - 1){
                hashKey = 0;
            } else {
                hashKey++;
            }

            while(occupied(hashKey) && hashKey != stop){
                hashKey = (hashKey + 1) % hashtable.length;
            }
        }


        if(occupied(hashKey))
            System.out.println("Sorry, there`s already an employee at position " + hashKey);
        else
            hashtable[hashKey] = new StoredEmployee(key, employee);
    }

    public Employee get(String key){
        int hashKey = findKey(key);

        if(hashKey == -1){
            return null;
        }
        return hashtable[hashKey].value;
    }

    public Employee remove(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return null;
        }

        Employee employee = hashtable[hashedKey].value;
        hashtable[hashedKey] = null;

        StoredEmployee[] oldHashtable = hashtable;
        hashtable = new StoredEmployee[oldHashtable.length];
        for(int i = 0; i < hashtable.length; i++){
            if(oldHashtable[i] != null){
                put(oldHashtable[i].key, oldHashtable[i].value);
            }
        }
        return employee;
    }
    private int hashKey(String key){
        return key.length() % hashtable.length;
    }

    private boolean occupied(int index){
        return hashtable[index] != null;
    }

    private int findKey(String key){
        int hashKey = hashKey(key);
        if(hashtable[hashKey] != null && hashtable[hashKey].key.equals(key)){
            return hashKey;
        }

        int stop = hashKey;
        if (hashKey == hashtable.length - 1) {
            hashKey = 0;
        } else {
            hashKey++;
        }

        while (hashKey != stop && hashtable[hashKey] != null && !hashtable[hashKey].key.equals(key)) {
            hashKey = (hashKey + 1) % hashtable.length;
        }

        if (hashtable[hashKey] != null &&
                hashtable[hashKey].key.equals(key)){
            return hashKey;
        } else {
            return -1;
        }

    }

    public void printHashtable(){
        for (StoredEmployee employee : hashtable) {
            if(employee == null){
                System.out.println("empty");
            } else {
                System.out.println(employee.value);
            }
        }
    }
}
