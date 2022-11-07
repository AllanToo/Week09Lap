/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import models.Role;
/**
 *
 * @author Allan T
 */
public class RoleDB {
     public List<Role> getAll() throws Exception {
       
          EntityManager em = DBUtil.getEmFactory().createEntityManager(); 

try {
      List <Role> Roles = em.createNamedQuery("Role.findAll",Role.class).getResultList(); 
          return Roles; 
        } finally {
              em.close();
        } 
    }
      public Role getRole(int role_id) throws Exception {
            EntityManager em = DBUtil.getEmFactory().createEntityManager(); 
        try {
             
         Role role = em.find(Role.class, role_id); 
             return role; 
     } 
        finally {
           em.close();
        } 
}
}
