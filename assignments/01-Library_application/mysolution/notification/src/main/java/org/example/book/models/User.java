package org.example.book.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {

@Id


    private String nome;
    private String cognome;
    private String userId;

    public String getCognome() {
        return cognome;
    }
    public String getUserId(){
        return userId;
    }


    private String getNome(){
        return nome;
    }

    private void setNome(){
        this.nome=nome;
    }

    private void setCognome(){
        this.cognome=cognome;
    }

    private void setUserId(){
        this.userId=userId;
    }


@Override
public String toString(){
        return this.nome+"  "+this.cognome;
}

}
