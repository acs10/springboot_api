package com.example.demo.model;


import javax.persistence.*;

@Entity(name = "usuario")
public class NotaFiscal {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer codigo;

    @Column( length = 20)
    public String IdentdEmissor;

    @Column( length = 20)
    public String IdentdDestinatario;

    @Column( length = 20)
    public String NumSeq;

    @Column( length = 20)
    public String IndrCont;

    @Column( length = 20)
    public String DomSist;

    @Column( length = 20)
    public String NUOp;



}
