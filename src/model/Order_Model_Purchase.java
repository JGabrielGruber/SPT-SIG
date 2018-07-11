/*
 * Copyright (C) 2018 gruber
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author gruber
 */
public class Order_Model_Purchase extends Order_Model {

    private int id_purchase;

    private Person_Provider provider;

    private Person_Employee employee;

    private ArrayList<Product_Exchange> products;

    private int amount;

    public Order_Model_Purchase() {
    }

    public Order_Model_Purchase(int id_purchase, Person_Provider provider,
            Person_Employee employee, ArrayList<Product_Exchange> products, int amount) {
        this.id_purchase = id_purchase;
        this.provider = provider;
        this.employee = employee;
        this.products = products;
        this.amount = amount;
    }

    public Order_Model_Purchase(int id_purchase, Person_Provider provider,
            Person_Employee employee, ArrayList<Product_Exchange> products, int amount,
            int id_model, String name, String description) {
        super(id_model, name, description);
        this.id_purchase = id_purchase;
        this.provider = provider;
        this.employee = employee;
        this.products = products;
        this.amount = amount;
    }

    public int getId_purchase() {
        return id_purchase;
    }

    public void setId_purchase(int id_purchase) {
        this.id_purchase = id_purchase;
    }

    public Person_Provider getProvider() {
        return provider;
    }

    public void setProvider(Person_Provider provider) {
        this.provider = provider;
    }

    public Person_Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Person_Employee employee) {
        this.employee = employee;
    }

    public ArrayList<Product_Exchange> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product_Exchange> products) {
        this.products = products;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
