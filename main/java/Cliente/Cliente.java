package Cliente;


public class Cliente {
    
    private String saldo;
    private String nome;
    private String endereco;
    private String cpf;
    private String senha;

    public Cliente(String saldo, String nome, String endereco, String cpf, String senha){
        this.saldo = saldo;
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.senha = senha;
    }

    public Cliente(String cpf, String senha) {
        this.cpf = cpf;
        this.senha = senha;
    }
    

    public String getSaldo(){
        return saldo;
    }

    public void setSaldo(String saldo){
        this.saldo = saldo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }
    }

