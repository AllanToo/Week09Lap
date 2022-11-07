
package services;
import dataaccess.RoleDB;
import java.util.List;
import models.Role;
/**
 *
 * @author Allan T
 */
public class RoleService {
       public Role getRole(int role_id) throws Exception{
        RoleDB roleDB = new RoleDB(); 
        Role role = roleDB.getRole(role_id); 
        return role; 
    }
    public List<Role> getAll() throws Exception{
        RoleDB roleDB = new RoleDB(); 
        List <Role> roles = roleDB.getAll(); 
        return roles; 
    }
}
