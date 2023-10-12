package Exam_Basic.ra.bussinessImp;

import Exam_Basic.ra.bussiness.IBook;

import java.util.Scanner;

public class Book implements IBook {
    private static int count = 1;
    private int bookId;
    private String bookName;
    private String title;
    private int numberOfPages;
    private float importPrice;
    private float exportPrice;
    private float interest;
    private boolean bookStatus;

    public Book() {
        this.bookId = Book.count++;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest() {
        this.interest = this.exportPrice - this.importPrice;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(Scanner scanner) {
        System.out.println("""
                Trạng thái
                1.true
                2.false
                """);
        this.bookStatus = Integer.parseInt(scanner.nextLine()) == 1;
    }

    public void displayData() {
        System.out.println("Book{" +
                "bookId= " + bookId +
                ", bookName= '" + bookName + '\'' +
                ", title= '" + title + '\'' +
                ", numberOfPages= " + numberOfPages +
                ", importPrice= " + importPrice +
                ", exportPrice= " + exportPrice +
                ", interest= " + interest +
                ", bookStatus= " + bookStatus +
                '}');
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.println("Nhập tên sách");
        this.bookName = scanner.nextLine();
        System.out.println("Nhập tiêu đề sách");
        this.title = scanner.nextLine();
        System.out.println("Nhập số trang sách");
        this.numberOfPages = Integer.parseInt(scanner.nextLine());
        System.out.println("Giá nhập");
        this.importPrice = Float.parseFloat(scanner.nextLine());
        System.out.println("Giá bán");
        this.exportPrice = Float.parseFloat(scanner.nextLine());
        System.out.println("""
                Trạng thái
                1.true
                2.false
                """);
        this.bookStatus = Integer.parseInt(scanner.nextLine()) == 1;
        this.setInterest();

    }
}
