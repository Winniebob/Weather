package ui;

import presenter.Presenter;

import java.util.Scanner;

public class CosloleUI implements View {
    private Presenter presenter;
    private Scanner scanner;

    public CosloleUI(){
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
    }
    @Override
    public void start(){
        while(true){
            String city = scan();
            presenter.getIfo(city);
        }
    }
    private String scan(){
        System.out.println("Введите город");
        return  scanner.nextLine();
    }
    @Override
    public void print(String text){
        System.out.println(text);
    }
}
