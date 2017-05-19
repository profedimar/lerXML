/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ibiruba.inf;

import br.ibiruba.inf.bd.PopulaBD;
import br.ibiruba.inf.bd.PopulaBDImpl;
import br.ibiruba.inf.beans.Cidade;
import br.ibiruba.inf.xml.LerXML;
import br.ibiruba.inf.xml.LerXMLImpl;
import java.util.List;

/**
 *
 * @author labin
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Lendo o XML");
        LerXML lx = new LerXMLImpl();
        List<Cidade> cidades = lx.lerCidades("caminho para o XML");
        
        System.out.println("Inserindo no arquivo");
        PopulaBD pb = new PopulaBDImpl();
        pb.populaBD(cidades);
    }
}
