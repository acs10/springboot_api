package com.example.demo.model;


import javax.persistence.*;

@Entity(name = "usuario")
public class Documento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer codigo;

    @Column( length = 20)
    public String CodMsg;

    @Column( length = 20)
    public String NumCtrlSLC;

    @Column( length = 20)
    public String IdentdEmissor;

    @Column( length = 20)
    public String ISPBIF;

    @Column( length = 20)
    public String TpInf;

    @Column( length = 20)
    public String DtLiquid;

    @Column( length = 20)
    public String NumSeqCicloLiquid;

}
