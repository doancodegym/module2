package option;

import java.io.IOException;

public interface IManager {
    public void add(String[] arr);
    public void edit(String oldname,String name, String phone, String address, String email, String group, String gioitinh, String ngaysinh);
    public void delete(String name);
    public void search(String name);
    public void push() throws IOException;
    public void showInfo();
}
