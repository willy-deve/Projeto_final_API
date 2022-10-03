package com.projetofinalapi.exeception;

public class ExeceptionPageNotFound extends RuntimeException {

    public ExeceptionPageNotFound(String msg){
        super(msg);
    }
}
