/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.einvoicing2.ManagedBean;

import java.io.Serializable;
import javax.annotation.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author insta
 */
@Named("loginBean")
@ViewScoped
public class LoginManagedBean implements Serializable{




    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
    
    
        public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
        public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void doLogin(){
        System.out.println("The login method was calledd ");
    }
}
