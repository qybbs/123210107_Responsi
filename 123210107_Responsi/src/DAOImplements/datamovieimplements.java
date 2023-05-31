/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImplements;
import java.util.List;
import Model.*;

/**
 *
 * @author Lab Informatika
 */
public interface datamovieimplements {
    public void insert(datamovie dm);
    public void update(datamovie dm, String j);
    public void delete(String judul);
    public List<datamovie> getAll();
}
