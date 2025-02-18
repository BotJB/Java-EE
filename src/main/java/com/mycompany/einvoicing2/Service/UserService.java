/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.mycompany.einvoicing2.Service;

import com.mycompany.einvoicing2.entities.User;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author insta
 */
@Stateless
public class UserService {

    @PersistenceContext(unitName = "MyPU")
    EntityManager em;
    
    
    public User findUserByUserName(String uName){
        try{
            return em.createQuery("SELECT u FROM USER U WHERE u.uName= :uName",User.class)
                    .setParameter("uName", uName)
                    .getSingleResult();
        }
        catch(Exception e ){
            return null;
        }
    }
    
    public void saveUser(User user){
        em.persist(user);
    }
}
