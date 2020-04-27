package thuchanh1;

public interface Tree<T> {
    //*Chèn phần tử e vào cây tìm kiếm nhị phân.
    //* Trả về true nếu phần tử được chèn thành công.
    public boolean insert(T t);

    //*Duyệt các phần tử trong mảng từ gốc
    public void inoder();

    //*Lấy ra số lượng nút trong cây
    public int getSize();
}
