package br.luiz.rent.money.challenge.entity;

public class Client {

    private int id;
    private String name;
    private String password;
    private String email;
    private int cpf;
    private int rg;
    private String address;
    private double incomeCash;


    public Client() {
    }

    public Client(String name, String password, String email, int cpf, int rg, String address, int incomeCash) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.cpf = cpf;
        this.rg = rg;
        this.address = address;
        this.incomeCash = incomeCash;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getIncomeCash() {
        return incomeCash;
    }

    public void setIncomeCash(double incomeCash) {
        this.incomeCash = incomeCash;
    }
}
