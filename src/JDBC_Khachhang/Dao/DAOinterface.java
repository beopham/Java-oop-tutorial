package JDBC_Khachhang.Dao;

import java.util.ArrayList;

public interface DAOinterface <T>{

    // hàm nhập
    public int Insert(T t);
    // hàm sưa
    public int Update(T t);
    // hàm xóa
    public int Delete(String t);
    // hàm lấy theo ID
    public T selectByid(String t);
    // laays tất cả
    public ArrayList<T> selectAll();
    // xóa tất cả
    public int DeleteAll();


}
