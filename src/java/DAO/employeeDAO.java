
package DAO;

import bean.Employee;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class employeeDAO {
    public static Session getSession() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        return session;
    }
    public Employee[] getListNhanVien(){
        Session session = getSession();
        Transaction trans = session.getTransaction();
        try {
            trans.begin();
            String sql = "from Employee";
            Query query = session.createQuery(sql);
            List list = query.list();
            Employee[] result = new Employee[list.size()];
            list.toArray(result);
            session.flush();
            trans.commit();
            return result;
        }catch(Exception e){
            if (trans.isActive()) {
                trans.rollback();
            }
            e.printStackTrace();
        }
        return null;
    }
    public boolean deleteEmployee(int MaNV){
        Session session = getSession();
        Transaction trans = session.getTransaction();
        try {
            trans.begin();
            Employee e=(Employee) session.get(Employee.class, MaNV);
            session.delete(e);
            
            session.flush();
            trans.commit();
            return true;
        }catch(Exception e){
            if (trans.isActive()) {
                trans.rollback();
            }
            e.printStackTrace();
        }
        return false;
    }
    public static void main(String[] args) {
        employeeDAO dao=new employeeDAO();
        System.out.println(dao.getListNhanVien().length);
    }
}
