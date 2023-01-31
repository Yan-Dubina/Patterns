package com.sggw.pattern.State;

public class Telephone {

    TelephoneConnection connection = new TelephoneConnection();

    public static void main(String[] args) throws InterruptedException {
        Telephone  telephone = new Telephone();
        telephone.connect();
    }
    public void  connect() throws InterruptedException {
        connection.onTaken();
    }
}
