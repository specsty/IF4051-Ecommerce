/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Husni
 */
import groovy.transform.Canonical

@Canonical
class User {
    String name, username, email, address, password
    Wallet wallet
    Store store
    List<Order> orders = []
}

