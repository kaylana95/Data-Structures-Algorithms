/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtabledemo;

/**
 *
 * @author Anthony
 */
//create a project called HashTableDemo
public class HashTableDemo {

    String myTable[];
    int count;
    int tableSize;

    public HashTableDemo(int ts) {
        tableSize = ts;
        myTable = new String[tableSize];
        count = 0;
    } // close constructor

// Method to insert a data item into a hash table
    public void insert(String x) {
//keys cannot be null, so just do nothing if it is
        if (x == null) {
            return;
        }
//calculate if there is enough space left in table
        int openSpaces = tableSize - count;
        double fraction = tableSize * 0.75;
        if (openSpaces < fraction) {
            growTable(tableSize * 2);
        }
        int pos = calcHash(x);
        if (positionOpen(pos)) {
            myTable[pos] = x;
        } else {
//pos = linearProbe(pos);
            pos = quadraticProbe(pos);
            myTable[pos] = x;
        }
        count++;
    }  // close insert method

    public int linearProbe(int p) {
//look from current position p for an open space
        while (positionOpen(p) == false) {
            p++;
        }
        return p;
    } // close of linear probe

    public int quadraticProbe(int p) {
        int repeat = 1; //first collision
        int testPos = (p + repeat * repeat) % tableSize;
        while (!positionOpen(testPos)) {
            repeat++;
            testPos = (p + repeat * repeat) % tableSize;
        }
        return testPos;
    } // close of quadratic probe

    public boolean positionOpen(int p) {
//just check if there is something
// in the position already
        return (myTable[p] == null);
    } // close of position open

    public void growTable(int newSize) {
//keep track of old table

        String[] oldTable = myTable;
        int oldsize = tableSize;

//make a bigger table
        myTable = new String[newSize];
        tableSize = newSize;
        count = 0; //no values in new table yet
//hash values in old table into new table
        for (int i = 0; i < oldsize; i++) {
            if (oldTable[i] != null) {
                this.insert(oldTable[i]);
            }
        }
    }// close of grow table

    public int calcHash(String x) {
        int sumLetters = 0;
//this adds the ASCII values of all the letters in the String together
        for (int i = 0; i < x.length(); i++) {
            sumLetters = sumLetters + x.charAt(i);
        }
//works out the hash value
        return sumLetters % tableSize;
    }// close of calculating the harsh 

    public void printTable() {
//give an output of the hash table
// with positions and values
        for (int i = 0; i < tableSize; i++) {
//puts in line breaks every 8 values
            if (i % 5 == 0) {
                System.out.println();
            }
//prints (0)Value,
            System.out.print("(" + i + ") " + myTable[i] + ", ");
        }
    } // close of print table

    public static void main(String[] args) {
        HashTableDemo myHashTable = new HashTableDemo(4);

        myHashTable.insert("tony");
        myHashTable.insert("John");
        myHashTable.insert("Shane");
        myHashTable.insert("Andrew");
        myHashTable.printTable();

    }

}
