package CRUD_KhachHang.Dao;

import java.util.ArrayList;

public interface DaoGeneric <T>{

    public int insert(T t);
    public int update(T t);
    public int delete(String t);
    public ArrayList<T> selecctAll();
    public T selectByID(String t);
}
