/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chavedeankh;

/**
 *
 * @author Flavi
 */
public class Usuario {
    String bankname;
    String usuario;
    String senha;
  
public Usuario(){}

public Usuario (String bankname, String usuario, String senha){
    this.bankname = bankname;
    this.usuario = usuario;
    this.senha = senha;
}
    public String getBankname(){
        return bankname;
 }
    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}

