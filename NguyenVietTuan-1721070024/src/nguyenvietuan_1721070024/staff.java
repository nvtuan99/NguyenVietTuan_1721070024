package nguyenvietuan_1721070024;

import java.util.Scanner;
public class staff {
    protected String Name;
    protected int Salary,Bonus;
    public void getBonus(){
        Bonus = (Salary*20)/100;

    }
    void setStaff(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten nhan vien: ");
        Name = sc.nextLine();
        System.out.println("Nhap luong cho nhan vien: ");
        Salary = sc.nextInt();
    }
    void  getStaff(){
        System.out.println("Ho va ten: "+Name+"\nLuong cung:"+Salary+"\nThuong them: "+Bonus+"\nTong luong: "+(Salary+Bonus));
    }
}