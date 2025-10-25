package JDBC_Khachhang.Dao;

import java.util.ArrayList;

public interface GenericDA0 <T>{

    public int Intert(T t);
    public int Update (T t);
    public int Delete(String t);
    public ArrayList<T> selectAll();
    public T selectByid(String t);
    public ArrayList<T> selectById(String t);
}
